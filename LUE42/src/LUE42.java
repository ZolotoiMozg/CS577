import java.io.FileNotFoundException;

class LUE42 {
	public static void main(String[] args) throws FileNotFoundException, java.lang.Exception{
		String s;
		java.io.BufferedReader in = new java.io.BufferedReader (new java.io.InputStreamReader(System.in));
		while(!(s=in.readLine()).equals("42")){
			System.out.println(s);
		}
		return;
	}	
}


