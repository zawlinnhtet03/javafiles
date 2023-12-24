package Chapter1;

public class MyAnd {

	public static void main(String[] args) {
		boolean b;
		int j = 5, k = 5;
		b = (j++ == k) && (j == ++k);
		System.out.println("b, j, k " + b + ", " + j + ", " + k);
		
		j = 0; k = 0;
		b = ( j++ != k ) && ( j == ++k );
		System.out.println("b, j, k " + b + ", " + j + ", " + k);
	}

}
