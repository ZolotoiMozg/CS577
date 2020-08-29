import java.io.FileNotFoundException;

class InsertionSort {

	public static void main(String[] args) throws /*FileNotFoundException,*/ java.lang.Exception {
		//process input
		java.io.BufferedReader in = new java.io.BufferedReader (new java.io.InputStreamReader(System.in));
		//number of test cases
		int n = Integer.parseInt(in.readLine());
		//set up array for output
		int[] out = new int[n];
		//go through input
		for(int m = 0; m < n; m++){
			//first read can be interpreted as string
			int l = Integer.parseInt(in.readLine());
			//set up array to hold inputs
			String [] inputArr = new String[l];
			String str = in.readLine();
			inputArr = str.split(" ");
			
			//transfer into int array
			int [] intArr = new int[l];
			for (int d = 0; d < l; d++) intArr[d] = Integer.parseInt(inputArr[d]);
			
			//perform sort and count moves
//			out[m]=InsertSort(intArr);
			
			//count moves for current input
//			out[m]=InsertSortMoves(intArr);

			arrInv ai = new arrInv(intArr.length);
			ai.arr = intArr;
			arrInv ao = sortAndCount(ai);
			out[m] = ao.inversions;

			//print the array
//			for (int g = 0; g < ao.arr.length; g++) System.out.print(ao.arr[g]+" ");
//			System.out.println();
		}

		//print the output
		for (int i = 0; i < n; i++){
			System.out.println(out[i]);
		}
	}


	//perform an insertion sort and count moves in n^2 time...
	static int InsertSort(int[] A){
		int moves = 0;
		//perform sort
		int x;
		for(int i=1; i < A.length; i++){
			for(int j = i; j > 0 && A[j] < A[j-1]; j--){
				x = A[j];
				A[j] = A[j-1];
				A[j-1] = x;
				moves++;
			}
		}
		return moves;
	}	
	
	
	//count moves necessary for insertion sort in n^2 time...
	static int InsertSortMoves(int[] A){
		//keep track of min and max numbers already looked at
		int min = A[0];
		int max = min;
		//total moves
		int moves = 0;
		//moves for current A[i]
		int imoves = 0;
		for(int i=1; i < A.length; i++){
			//if this is max value, no moves
			if (A[i] >= max){
				max = A[i];
				imoves = 0;
			}
			//if this is min value, it will move all the way
			else if (A[i] < min){
				min = A[i];
				imoves = i;
			} 
			else{ //only loop if necessary
				imoves = 0;
				for(int j = i-1; j >= 0; j--){
					if (A[i] < A[j]) imoves++;
				}
			}
			moves += imoves;
			
		}
		return moves;		
	}
	
	//sort and count inversions
	static arrInv sortAndCount(arrInv A){
		int n = A.arr.length;
		//base case
		if (n == 1){
			A.inversions = 0;
			return A;
		}
		
		int m = n/2;
		arrInv AL = new arrInv(m /*+ (n % 2)*/);
		System.arraycopy(A.arr, 0, AL.arr, 0, m /*+ (n % 2)*/);
		arrInv AR = new arrInv(n-m);
		System.arraycopy(A.arr, m /*+ (n % 2)*/, AR.arr, 0, n-m);
		arrInv L = sortAndCount(AL);
		arrInv R = sortAndCount(AR);
		//call crossCount after AL and AR have been sorted
		int cc = crossCount(L.arr,R.arr);
		int count = L.inversions + R.inversions + cc;
		arrInv B = new arrInv(n);
		B.arr = merge(L.arr,R.arr);
		B.inversions = count;
		return B;
	}
	
	static int crossCount(int[] L, int[] R){
		int l = 0;
		int r = 0;
		int c = 0;
		int nl = L.length;
		int nr = R.length;
		while(l < nl && r < nr){
			if (L[l] <= R[r]) l++;
			else{
				c = c + nl - l;
				r++;
			}
		}
		return c;
	}
	
	static int[] merge(int[] L, int[] R){
		int l = 0;
		int r = 0;
		int m = 0;
		int nl = L.length;
		int nr = R.length;
		int[] M = new int[nl+nr];
		while (l < nl && r < nr){
			if (L[l] <= R[r]){
				M[m] = L[l];
				l++;
			} else {
				M[m] = R[r];
				r++;
			}
			m++;
		}
		while (l < nl){
			M[m] = L[l];
			l++;
			m++;
		}
		while (r < nr){
			M[m] = R[r];
			r++;
			m++;
		}
		return M;
	}
	
}

class arrInv {
	int[] arr;
	int inversions;
	
	arrInv(int n){
		arr = new int[n];
		inversions = 0;
	}
}