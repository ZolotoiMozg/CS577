package practice;

public class main {

	public static void main(String[] args) {
		//System.out.println(gcd1(4,0));
		//System.out.println(gcd2(8,2));
		//System.out.println(gcd3(5,3));
		//System.out.println(gcd4(21,35));
		int[] AA = {1,3,5,7,9,10,11,12,13,14,15,16};
		int[] BB = {2,4,5,6,7,8,10,12,14,16,16,18};
		int[] A = {1,3,5,7,9,11};
		int[] B = {2,4,6,8,10,12};
		int[] C = {5};

//		System.out.println(hw2_3(AA,BB,16)+" "+hw2_3_linear_2(A,B,16));
//		System.out.println(hw2_3(AA,BB,17)+" "+hw2_3_linear_2(AA,BB,17));

		int[] X = {1,1,1,3,3,11};
		int[] Y = {1,2,2,3,4,12};
		
//		System.out.println(hw2_3(X,Y,4)+" "+hw2_3_linear_2(X,Y,4));
//		System.out.println(hw2_3(X,Y,5)+" "+hw2_3_linear_2(X,Y,5));
				
		int[] XX = {1,1,1,3,3,11};
		int[] YY = {1,2,2,2,2,4};

/*		
		System.out.println(hw2_3(B,C,1));
		System.out.println(hw2_3(B,C,2));
		System.out.println(hw2_3(B,C,3));
		System.out.println(hw2_3(B,C,4));
		System.out.println(hw2_3(B,C,5));
		System.out.println(hw2_3(B,C,6));
		System.out.println(hw2_3(B,C,7));

		
		System.out.println(hw2_3(A,B,1)+" "+hw2_3_linear_2(A,B,1));
		System.out.println(hw2_3(A,B,2)+" "+hw2_3_linear_2(A,B,2));
		System.out.println(hw2_3(A,B,3)+" "+hw2_3_linear_2(A,B,3));
		
		System.out.println(hw2_3(A,B,4)+" "+hw2_3_linear_2(A,B,4));
		System.out.println(hw2_3(A,B,5)+" "+hw2_3_linear_2(A,B,5));
		System.out.println(hw2_3(A,B,6)+" "+hw2_3_linear_2(A,B,6));
		System.out.println(hw2_3(A,B,7)+" "+hw2_3_linear_2(A,B,7));
		
		System.out.println(hw2_3(A,B,8)+" "+hw2_3_linear_2(A,B,8));
		System.out.println(hw2_3(A,B,9)+" "+hw2_3_linear_2(A,B,9));
		System.out.println(hw2_3(A,B,10)+" "+hw2_3_linear_2(A,B,10));
		System.out.println(hw2_3(A,B,11)+" "+hw2_3_linear_2(A,B,11));
		System.out.println(hw2_3(A,B,12)+" "+hw2_3_linear_2(A,B,12));
	
		
		System.out.println("1: "+hw2_3(AA,BB,1));
		System.out.println("2: "+hw2_3(AA,BB,2));
		System.out.println("3: "+hw2_3(AA,BB,3));
		System.out.println("4: "+hw2_3(AA,BB,4));
		System.out.println("5: "+hw2_3(AA,BB,5));
		System.out.println("6: "+hw2_3(AA,BB,6));
*/		
		System.out.println("7: "+hw2_3(AA,BB,7));
/*		System.out.println("8: "+hw2_3(AA,BB,8));
		System.out.println("9: "+hw2_3(AA,BB,9));
		
		
		System.out.println("10: "+hw2_3(AA,BB,10));
		System.out.println("11: "+hw2_3(AA,BB,11));
		System.out.println("12: "+hw2_3(AA,BB,12));
		System.out.println("13: "+hw2_3(AA,BB,13));
		System.out.println("14: "+hw2_3(AA,BB,14));
		System.out.println("15: "+hw2_3(AA,BB,15));
		System.out.println("16: "+hw2_3(AA,BB,16));
		System.out.println("17: "+hw2_3(AA,BB,17));
		System.out.println("18: "+hw2_3(AA,BB,18));
		System.out.println("19: "+hw2_3(AA,BB,19));
		System.out.println("20: "+hw2_3(AA,BB,20));
		System.out.println("21: "+hw2_3(AA,BB,21));
		System.out.println("22: "+hw2_3(AA,BB,22));
		System.out.println("23: "+hw2_3(AA,BB,23));
		System.out.println("24: "+hw2_3(AA,BB,24));
		

		System.out.println(hw2_3(XX,YY,1)+" "+hw2_3_linear_2(XX,YY,1));
		System.out.println(hw2_3(XX,YY,2)+" "+hw2_3_linear_2(XX,YY,2));
		System.out.println(hw2_3(XX,YY,3)+" "+hw2_3_linear_2(XX,YY,3));
		System.out.println(hw2_3(XX,YY,4)+" "+hw2_3_linear_2(XX,YY,4));
		System.out.println(hw2_3(XX,YY,5)+" "+hw2_3_linear_2(XX,YY,5));
		System.out.println(hw2_3(XX,YY,6)+" "+hw2_3_linear_2(XX,YY,6));	
  		System.out.println(hw2_3(XX,YY,7)+" "+hw2_3_linear_2(XX,YY,7));
		System.out.println(hw2_3(XX,YY,8)+" "+hw2_3_linear_2(XX,YY,8));
		System.out.println(hw2_3(XX,YY,9)+" "+hw2_3_linear_2(XX,YY,9));
		System.out.println(hw2_3(XX,YY,10)+" "+hw2_3_linear_2(XX,YY,10));
		System.out.println(hw2_3(XX,YY,11)+" "+hw2_3_linear_2(XX,YY,11));
		System.out.println(hw2_3(XX,YY,12)+" "+hw2_3_linear_2(XX,YY,12));
		
		
/*
		System.out.println(hw2_3_old(B,C,1));
		System.out.println(hw2_3_old(B,C,2));
		System.out.println(hw2_3_old(B,C,3));
		System.out.println(hw2_3_old(B,C,4));
		System.out.println(hw2_3_old(B,C,5));
		System.out.println(hw2_3_old(B,C,6));
		System.out.println(hw2_3_old(B,C,7));

		
		System.out.println(hw2_3_old(A,B,1)+" "+hw2_3_linear_2(A,B,1));
		System.out.println(hw2_3_old(A,B,2)+" "+hw2_3_linear_2(A,B,2));
		System.out.println(hw2_3_old(A,B,3)+" "+hw2_3_linear_2(A,B,3));
		System.out.println(hw2_3_old(A,B,4)+" "+hw2_3_linear_2(A,B,4));
		System.out.println(hw2_3_old(A,B,5)+" "+hw2_3_linear_2(A,B,5));
		System.out.println(hw2_3_old(A,B,6)+" "+hw2_3_linear_2(A,B,6));
		System.out.println(hw2_3_old(A,B,7)+" "+hw2_3_linear_2(A,B,7));
		System.out.println(hw2_3_old(A,B,8)+" "+hw2_3_linear_2(A,B,8));
		System.out.println(hw2_3_old(A,B,9)+" "+hw2_3_linear_2(A,B,9));
		System.out.println(hw2_3_old(A,B,10)+" "+hw2_3_linear_2(A,B,10));
		System.out.println(hw2_3_old(A,B,11)+" "+hw2_3_linear_2(A,B,11));
		System.out.println(hw2_3_old(A,B,12)+" "+hw2_3_linear_2(A,B,12));
	
		
		System.out.println("1: "+hw2_3_old(AA,BB,1));
		System.out.println("2: "+hw2_3_old(AA,BB,2));
		System.out.println("3: "+hw2_3_old(AA,BB,3));
		System.out.println("4: "+hw2_3_old(AA,BB,4));
		System.out.println("5: "+hw2_3_old(AA,BB,5));
		System.out.println("6: "+hw2_3_old(AA,BB,6));
		System.out.println("7: "+hw2_3_old(AA,BB,7));
		System.out.println("8: "+hw2_3_old(AA,BB,8));
		System.out.println("9: "+hw2_3_old(AA,BB,9));
		System.out.println("10: "+hw2_3_old(AA,BB,10));
		System.out.println("11: "+hw2_3_old(AA,BB,11));
		System.out.println("12: "+hw2_3_old(AA,BB,12));
		System.out.println("13: "+hw2_3_old(AA,BB,13));
		System.out.println("14: "+hw2_3_old(AA,BB,14));
		System.out.println("15: "+hw2_3_old(AA,BB,15));
		System.out.println("16: "+hw2_3_old(AA,BB,16));
		System.out.println("17: "+hw2_3_old(AA,BB,17));
		System.out.println("18: "+hw2_3_old(AA,BB,18));
		System.out.println("19: "+hw2_3_old(AA,BB,19));
		System.out.println("20: "+hw2_3_old(AA,BB,20));
		System.out.println("21: "+hw2_3_old(AA,BB,21));
		System.out.println("22: "+hw2_3_old(AA,BB,22));
		System.out.println("23: "+hw2_3_old(AA,BB,23));
		System.out.println("24: "+hw2_3_old(AA,BB,24));
		

		System.out.println(hw2_3_old(XX,YY,1)+" "+hw2_3_linear_2(XX,YY,1));
		System.out.println(hw2_3_old(XX,YY,2)+" "+hw2_3_linear_2(XX,YY,2));
		System.out.println(hw2_3_old(XX,YY,3)+" "+hw2_3_linear_2(XX,YY,3));
		System.out.println(hw2_3_old(XX,YY,4)+" "+hw2_3_linear_2(XX,YY,4));
		System.out.println(hw2_3_old(XX,YY,5)+" "+hw2_3_linear_2(XX,YY,5));
		System.out.println(hw2_3_old(XX,YY,6)+" "+hw2_3_linear_2(XX,YY,6));	
  		System.out.println(hw2_3_old(XX,YY,7)+" "+hw2_3_linear_2(XX,YY,7));
		System.out.println(hw2_3_old(XX,YY,8)+" "+hw2_3_linear_2(XX,YY,8));
		System.out.println(hw2_3_old(XX,YY,9)+" "+hw2_3_linear_2(XX,YY,9));
		System.out.println(hw2_3_old(XX,YY,10)+" "+hw2_3_linear_2(XX,YY,10));
		System.out.println(hw2_3_old(XX,YY,11)+" "+hw2_3_linear_2(XX,YY,11));
		System.out.println(hw2_3_old(XX,YY,12)+" "+hw2_3_linear_2(XX,YY,12));
*/		
	}
	
	//invalid... try gcd1(4,4) --> never terminates
	static int gcd1(int a, int b){
		if (a > b) a = a-b;
		else b = b - a;
		if (a==b) return a;
		else return gcd1(a,b);
	}
	
	//invalid... try gcd2(1,2) --> repeats this call forever
	static int gcd2(int a, int b){
		if (a == b) return a;
		if (a < b) return gcd2(b - a, b);
		else return gcd2(a, a - b);
	}
	
	//invalid... try gcd3(5,3) --> returns 3
	static int gcd3(int a, int b){
		if (a == b) return a;
		if (a < b) return gcd3(a, b - a);
		else return gcd3(b, a * b);
	}
	
	//valid!
	static int gcd4(int a, int b){
		if (a == b) return a;
		if (a < b) return gcd4(a, b - a);
		else return gcd4(b, a * (b + 1));
	}
	
	//HW2 Question 3
	static int hw2_3_linear(int A[], int B[], int k){
		int i,j,n;
		i = 0;
		j = 0;
		n = 0;
		while (i+j < k){
			if (i < A.length && j < B.length){
				n = MIN(A[i],B[j]);
				if ((A[i] <= B[j]) && (i != A.length)){
					i++;
				}
				else if ((A[i] > B[j]) && (j != B.length)){
					j++;
				}
			} else if (i < A.length) {
				n = A[i];
				i++;
			} else {
				n = B[j];
				j++;
			}
		}		
		return n;
	}
	
	//HW2 Question 3 variant
		static int hw2_3_linear_2(int A[], int B[], int k){
			int i,j,n;
			i = 0;
			j = 0;
			n = 0;
			while (i+j < k){
				if (i == A.length){
					n = B[j];
					j++;
				} else if (j == B.length){
					n = A[i];
					i++;
				} else{
					n = MIN(A[i],B[j]);
					if ((A[i] <= B[j]) && (i != A.length)){
						i++;
					}
					else if ((A[i] > B[j]) && (j != B.length)){
						j++;
					}
				}
			}		
			return n;
		}
		
		//HW2 Question 3 divide and conquer variant (WORKING)
		//the range of values we potentially care about is indexes 0 through k-1
		//such that i+j = k
		//start (if possible) with i=Ceiling(k/2), j=Floor(k/2)
	
	static int hw2_3(int[] A, int[] B, int k){

		//cases where A or B are empty
		if (B.length==0) return A[k-1];
		if (A.length==0) return B[k-1];
		
		//special cases where first k elements in one array
		if (A.length >= k && (A[k-1] <= B[0])) return A[k-1];
		if (B.length >= k && (B[k-1] < A[0])) return B[k-1];

		//else we know some of first k in each array, within ni:xi and nj:xj ranges
		//Need to find maximum values of i and j (as indexes of A and B respectively).  
		int xi = MIN(A.length-1,k-2);			
		int xj = MIN(B.length-1,k-2);
		//Find minimum values of i and j
		int ni = MAX(0,k-2-xj);
		int nj = MAX(0,k-2-xi);
		//set initial values for i and j
		int i = (ni+xi)/2;
		//if k is odd, add one to initial i
//		if (k % 2 == 1 && i < xi) i++;
		int j = (nj+xj)/2;
		//initial amount to move indexes
		int move = MAX((xi-ni)/2,0);
/*	
		System.out.println("k: "+k);
		System.out.println("xi: "+xi);
		System.out.println("ni: "+ni);
		System.out.println("xj: "+xj);
		System.out.println("nj: "+nj);
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		System.out.println("move: "+move);
*/	

		if (xi==ni){
			if (A[(int) i] > B[(int) j]) return A[(int) i];
			else return B[(int) j];
		}

		//check before moving indexes...
		if (k % 2 == 0){
			if (A.length > i+1){
				if (A[i+1] > B[j] && B[j] >= A[i]) return B[j];
			}
			else if (B.length > j+1){
				if (B[j+1] >= A[i] && A[i] >= B[j]) return A[i];
			}
		} else { //k is odd...
			if (A.length > i+2){
				if (A[i+2] > B[j] && B[j] >= A[i+1]) return B[j];
			}
			else if (B.length > j+1){
				if (B[j+1] >= A[i+1] && A[i+1] >= B[j]) return A[i+1];
			}
		}
		
		while (move > 0){	
			
			if (A[i] <= B[j]){  //check halfway up A's valid index range
				//move i halfway up
				i = i + move;
				//move j halfway down
				j = j - move;
			}
			else {  //check halfway down A's valid index range
				//move i halfway down
				i = i - move;
				//move j halfway up
				j = j + move;
			}
			
			if (move > 1){
				move = move/2 + move % 2;
			}
			else move = 0;
			

		}

		//come back and check if k was odd, in which case have to do extra
		if (k % 2 == 0){
			if (A[i] > B[j]) return A[i];
			else if (A.length > i+1){
				if (B[j] < A[i+1]) return B[j];
				else return A[i+1];
			} else return B[j];
		} else { //k is odd...
			if (B.length > j+1){
				return MIN(MAX(A[i+1],B[j]),MAX(B[j+1],A[i]));
			} else {
				return A[i+1];
			}
		}
		
		//return -1;
		
	}
	
	
	static int hw2_3_old(int[] A, int[] B, int k){

		//special cases where first k elements in one array
		if (A.length >= k && (A[k-1] <= B[0] || B.length==0)) return A[k-1];
		if (B.length >= k && (B[k-1] < A[0] || A.length==0)) return B[k-1];

		//else we know some of first k in each array, within ni:xi and nj:xj ranges
		//Need to find maximum values of i and j (as indexes of A and B respectively).  
		int xi = MIN(A.length-1,k-2);			
		int xj = MIN(B.length-1,k-2);
		//Find minimum values of i and j
		int ni = MAX(0,k-2-xj);
		int nj = MAX(0,k-2-xi);
		//set initial values for i and j
			
		double i = Math.ceil((ni+xi)/2);
		//if k is odd, add one to initial i
		if (k % 2 == 1 && i < xi) i++;
		double j = Math.floor((nj+xj)/2);
		//initial amount to move indexes
		int move = MAX((xi-ni)/2,1);	

		if (xi==ni){
			if (A[(int) i] > B[(int) j]) return A[(int) i];
			else return B[(int) j];
		}

		Boolean found = false;

		while (!found){	
			if (B.length-1 >= j+1){
				if (B[(int) j+1] >= A[(int) i] && A[(int) i] >= B[(int) j]) return A[(int) i];
			}
			else if (A[(int) i] >= B[(int) j] && A[(int) i-1] <= B[(int) j]){
				return A[(int) i];
			}	
			if (A.length-1 >= i+1){
				if (A[(int) i+1] >= B[(int) j] && B[(int) j ] > A[(int) i]) return B[(int) j];
			}
			else if (B[(int) j] >= A[(int) i] && B[(int) j-1] <= A[(int) i]){
				return B[(int) j];
			}
			if (A[(int) i] <= B[(int) j]){  //check halfway up A's valid index range
				//move i halfway up
				i = i + move;
				//move j halfway down
				j = j - move;
			}
			else {  //check halfway down A's valid index range
				//move i halfway down
				i = i - move;
				//move j halfway up
				j = j + move;
			}
				
			move = MAX((move/2),1);
				
		}

		return -1;
	}
		
	
	static int MIN(int a, int b){
		if (a<=b) return a;
		else return b;
	}
	
	static int MAX(int a, int b){
		if (a>=b) return a;
		else return b;
	}

}
