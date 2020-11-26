package Week7;

public class Revision {

	public static void main(String[] args) {
		//1
		System.out.print("1. ");
		int max = 5, n=1;
		while (n<=max) {
			System.out.println("\t" +n);
			n++;
		}
		
		
		//2
		System.out.print("2. ");
		int total=25, num=1;
		while(num<(total/2)) {
			total=total-num;
			System.out.println("\t" +total +" " +num);
			num++;
		}
		System.out.println();
		
		//3
		int k=1;
		System.out.println("3. ");
		while(k<=2) {
			int j=1;
			while(j<=3) {
				int i=1;
				while(i<=4) {
					System.out.print("*");
					i++;
				}
				System.out.print("!");
				j++;
			}
			System.out.println();
			k++;
		}
		System.out.println();
		
		//4
		System.out.println("4. ");
		int number = 4, q=0;
		while (q<number) {
			System.out.println(number);
			number = number/2;
			q++;
		}
	}
	

}
