package Main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of radius,height");
		int r=sc.nextInt();
		double h=sc.nextDouble();
		double V=3.14*r*r*h;
		System.out.println("volume of cyc"+V);
		// TODO Auto-generated method stub

	}

}
