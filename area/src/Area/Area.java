package Area;

 import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		int Sqrftperacr =43560; 
		Scanner a=new Scanner(System.in);
		System.out.println("Enter lenght,breath");
		 float l= a.nextFloat();
		 float w  =a.nextFloat();
		 float Area=l*w/Sqrftperacr;
		 System.out.println("Area in acr="+Area);
		
		// TODO Auto-generated method stub

	}

}
