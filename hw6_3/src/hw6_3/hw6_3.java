package hw6_3;

import java.util.*;

public class hw6_3 {

	public static void main(String[] args) {
		coin p = new coin(1);
		coin t = new coin(2);
		coin n = new coin(5);
		coin d = new coin(10);
		coin q = new coin(25);
		coin h = new coin(50);
		
		/*
		List<coin> denominations = new LinkedList<coin>();
		denominations.add(p);
		denominations.add(t);
		denominations.add(n);
		denominations.add(d);
		denominations.add(q);
		denominations.add(h);
		*/
		
		coin[] denominations = new coin[6];
		denominations[0] = p;
		denominations[1] = t;
		denominations[2] = n;
		denominations[3] = d;
		denominations[4] = q;
		denominations[5] = h;
		
		coin[] nopennies = new coin[5];
		nopennies[0] = t;
		nopennies[1] = n;
		nopennies[2] = d;
		nopennies[3] = q;
		nopennies[4] = h;
		
		coin[] weird = new coin[5];
		weird[0] = new coin(3);
		weird[1] = new coin(7);
		weird[2] = new coin(12);
		weird[3] = new coin(15);
		weird[4] = new coin(16);
		
//		makeDumbChange(nopennies, 27);
//		makeDumbChange(nopennies, 29);
//		makeDumbChange(nopennies, 3);

/*
		for (int i = 1; i < 10; i++){
			System.out.println("To make change for "+i*3+" it takes "+makeDumbChange(weird,i*3)+" coins");
		}
		
		System.out.println("To make change for "+22+" it takes "+makeDumbChange(weird,22)+" coins");
		System.out.println("To make change for "+28+" it takes "+makeDumbChange(weird,28)+" coins");
		System.out.println("To make change for "+29+" it takes "+makeDumbChange(weird,29)+" coins");
		System.out.println("To make change for "+30+" it takes "+makeDumbChange(weird,30)+" coins");
		System.out.println("To make change for "+31+" it takes "+makeDumbChange(weird,31)+" coins");
		System.out.println("To make change for "+32+" it takes "+makeDumbChange(weird,32)+" coins");
		
		System.out.println("To make change for "+34+" it takes "+makeDumbChange(weird,34)+" coins");
*/		
//		System.out.println("To make change for "+81+" it takes "+makeDumbChange(weird,81)+" coins");
		
		//can't make change:
//		System.out.println("To make change for "+11+" it takes "+makeDumbChange(weird,11)+" coins");
	}
	
	//TODO: Need a smarter way to reduce the problem set.  Once we have a "best" solution, we know not to keep tracking down any solutions that will have more total coins.
	//TODO: can I just step through coins, and make sure that the largest current denomination (i.e. coins[coins.length-1]) is >= remaining A?
	//works, but does a lot of work	

/*	
	static int makeDumbChange(coin[] coins, int A, int[] minsArr){
//		if (minsArr[A] != 0) return minsArr[A];
		
		if (A == 0){
//			System.out.println("A has bottomed out.");
			return 0;
		} else if (coins.length == 0){
			//No change made here...
			return 999999999;
		}
		
		coin[] smallercoins = new coin[coins.length-1];
		System.arraycopy(coins, 0, smallercoins, 0, coins.length-1);
			
		if (A < coins[coins.length-1].val){
			return makeDumbChange(smallercoins, A);
		}

//		System.out.println("adding a coin with value "+ coins[coins.length-1].val +". With A="+(A-coins[coins.length-1].val)+" left over");
		
		return MIN(makeDumbChange(smallercoins, A), 1 + makeDumbChange(coins, A - coins[coins.length-1].val));
	}
*/	
	
/*	
	//TODO: problem with this is that it doesn't know how to take just one 16 and then one 15.  It just tries to fit as many 16s as possible, then tries to fit as many 15s as possible
	static int makeModChange(coin[] coins, int A){
		if (A == 0){
			return 0;
		} else if (coins.length == 0){
			//No change made here...
			return 999999;
		}
		
		coin[] smallercoins = new coin[coins.length-1];
		System.arraycopy(coins, 0, smallercoins, 0, coins.length-1);
			
		if (A < coins[coins.length-1].val){
			return makeModChange(smallercoins, A);
		}

		//System.out.println("adding " +(int)Math.floor(A/coins[coins.length-1].val)+ " coins with value "+ coins[coins.length-1].val +". With A="+(int)(A-(Math.floor(A/coins[coins.length-1].val)*coins[coins.length-1].val))+" left over");
		
		return MIN(makeModChange(smallercoins, A), (int)Math.floor(A/coins[coins.length-1].val) + makeModChange(smallercoins, A%coins[coins.length-1].val));
	}
*/	
		
	static int MIN(int a, int b){
		if (a<=b) return a;
		else return b;
	}
		
	static int MAX(int a, int b){
		if (a>=b) return a;
		else return b;
	}
	
	

}

class coin{
	int val;
	int count=0;
	
	coin(int value){
		val = value;
		count=0;
	}
}
