package rafal;
import java.util.Scanner;

public class zloty {
	
	public static void main(String[] args) {
		System.out.println("hi, Welcome to the Currency Converter");

		System.out.println("which currency You want to Convert ? ");

		System.out.println("1: CHF \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Zloty ");
		Scanner sc = new Scanner(System.in);		
		int code = sc.nextInt();

		System.out.println("How much Money you want to convert ?");
		Double amount = sc.nextDouble();
		
		if (code == 1) {

			double dollar = amount / 70;
			System.out.println("Your " + amount + "  CHF is : " + String.format("%.2f", dollar) + " Dollar");

			double pound = amount / 88;		
			System.out.println("Your " + amount + "  CHF is : " +  String.format("%.2f" , pound) + " Pound");

			double euro = amount / 80;
			System.out.println("Your " + amount + "  CHF is : " + String.format("%.2f" , euro) + " Euro");

			double yen = amount / 0.63;
			System.out.println("Your " + amount + "  CHF is : " + String.format("%.2f" , yen) + " Yen");

			double zloty = amount / 16;
			System.out.println("Your " + amount + "  CHF is : " + String.format("%.2f" , zloty) + " Zloty");
		} else if (code == 2) {
			// For Dollar Conversion

			double chf = amount * 70;
			System.out.println("Your " + amount + " Dollar is : " + String.format("%.2f" ,  chf) + "  CHF");

			double pound = amount * 0.78;
			System.out.println("Your " + amount + " Dollar is : " + String.format("%.2f" , pound) + " Pound");

			double euro = amount * 0.87;
			System.out.println("Your " + amount + " Dollar is : " + String.format("%.2f" , euro) + " Euro");

			double yen = amount * 111.087;
			System.out.println("Your " + amount + " Dollar is : " + String.format("%.2f" , yen) + " Yen");

			double zloty = amount * 4.17;
			System.out.println("Your " + amount + " Dollar is : " + String.format("%.2f" , zloty) + " Zloty");
		} else if (code == 3) {
			// For Pound Conversion

			double chf = amount * 88;
			System.out.println("Your " + amount + " pound is : " + String.format("%.2f" ,  chf) + "  CHF");

			double dollar = amount * 1.26;
			System.out.println("Your " + amount + " pound is : " + String.format("%.2f" , dollar) + " Dollar");

			double euro = amount * 1.10;
			System.out.println("Your " + amount + " pound is : " + String.format("%.2f" , euro) + " Euro");

			double yen = amount * 140.93;
			System.out.println("Your " + amount + " pound is : " + String.format("%.2f" , yen) + " Yen");

			double zloty = amount * 5.29;
			System.out.println("Your " + amount + " pound is : " + String.format("%.2f" , zloty) + " Zloty");
		} else if (code == 4) {
			// For Euro Conversion

			double chf = amount * 80;
			System.out.println("Your " + amount + " euro is : " + String.format("%.2f" , chf) + "  CHF");

			double dollar = amount * 1.14;
			System.out.println("Your " + amount + " euro is : " + String.format("%.2f" , dollar) + " Dollar");

			double pound = amount * 0.90;
			System.out.println("Your " + amount + " euro is : " + String.format("%.2f" , pound) + " Pound");

			double yen = amount * 127.32;
			System.out.println("Your " + amount + " euro is : " + String.format("%.2f" , yen) + " Yen");

			double zloty = amount * 4.78;
			System.out.println("Your " + amount + " euro is : " + String.format("%.2f" , zloty) + " Zloty");
		} else if (code == 5) {

			// For Yen Conversion

			double chf = amount * 0.63;
			System.out.println("Your " + amount + " yen is : " + String.format("%.2f" , chf) + "  CHF");

			double dollar = amount * 0.008;
			System.out.println("Your " + amount + " yen is : " + String.format("%.2f" , dollar) + " Dollar");

			double pound = amount * 0.007;
			System.out.println("Your " + amount + " yen is : " + String.format("%.2f" ,  pound) + " Pound");

			double euro = amount * 0.007;
			System.out.println("Your " + amount + " yen is : " + String.format("%.2f" , euro) + " Euro");

			double zloty = amount * 0.037;
			System.out.println("Your " + amount + " yen is : " + String.format("%.2f" , zloty) + " Zloty");
		} else if (code == 6) {
			// For Zloty Conversion

			double chf = amount * 16.8;
			System.out.println("Your " + amount + " Zloty is : " + String.format("%.2f" , chf) + "  CHF");

			double dollar = amount * 0.239;
			System.out.println("Your " + amount + " Zloty is : " + String.format("%.2f" , dollar) + " dollar");

			double pound = amount * 0.188;
			System.out.println("Your " + amount + " Zloty is : " + String.format("%.2f" , pound) + " pound");

			double euro = amount * 0.209;
			System.out.println("Your " + amount + " Zloty is : " + String.format("%.2f" , euro) + " euro");

			double yen = amount * 26.63;
			System.out.println("Your " + amount + " Zloty is : " + String.format("%.2f" , yen) + " yen");
		} else if (code == 6) {
			
			System.out.println("Invalid input");
		}
	}
}
