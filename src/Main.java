import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;
		
//		s1 = sc.nextLine();
//		s2 = sc.nextLine();
//		s3 = sc.nextLine();
//		
//		System.out.println("Você digitou:");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//	
//		sc.close();
		
		double delta;
		double a = 8;
		double b = 2;
		double c = 1;
		double x1;
		double x2;
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		 x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		 x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		 
		 System.out.println(x1);
		 

	}

}
