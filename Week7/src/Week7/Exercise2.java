package Week7;

public class Exercise2 {

	public static void main(String[] args) {

		System.out.println("for: ");
		int i = 5;
		for(int c=0; c<=i; c++) {
			for (int d=i; d>=c; d--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\nwhile: ");
		int a=1;
		while(a<=i) {
			int b=i;
			while (b>=a) {
				System.out.print("&");
				b--;
			}
			System.out.println();
			a++;
		}
		
		System.out.println("\ndo while: ");
		int e=1;
		do {
			int d=a;
			do {
				System.out.print("#");
				d--;
			}
			while(d>=e);
			System.out.println();
			e++;
		}while(e<a);
	}

}
