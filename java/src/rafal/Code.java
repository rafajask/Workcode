
package rafal;
import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		System.out.println("Hi, Welcome to the Currency Converter!");

		System.out.println("which currency You want to Convert ? ");

		System.out.println("1:Ruppe \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit ");
		Scanner sc = new Scanner(System.in);		
		int code = sc.nextInt();

		System.out.println("How much Money you want to convert ?");
		Double amount = sc.nextDouble();
		
		if (code == 1) {

			double dollar = amount / 70;
			System.out.println("Your " + amount + " Rupee is : " + String.format("%.2f", dollar) + " Dollar");

			double pound = amount / 88;
			System.out.println("Your " + amount + " Rupee is : " +  String.format("%.2f" , pound) + " Pound");

			double euro = amount / 80;
			System.out.println("Your " + amount + " Rupee is : " + String.format("%.2f" , euro) + " Euro");

			double yen = amount / 0.63;
			System.out.println("Your " + amount + " Rupee is : " + String.format("%.2f" , yen) + " Yen");

			double ringgit = amount / 16;
			System.out.println("Your " + amount + " Rupee is : " + String.format("%.2f" , ringgit) + " ringgit");
		} else if (code == 2) {
			// For Dollar Conversion

			double rupee = amount * 70;
			System.out.println("Your " + amount + " Dollar is : " + String.format("%.2f" , rupee) + " Ruppes");

			double pound = amount * 0.78;
			System.out.println("Your " + amount + " Dollar is : " + String.format("%.2f" , pound) + " Pound");

			double euro = amount * 0.87;
			System.out.println("Your " + amount + " Dollar is : " + String.format("%.2f" , euro) + " Euro");

			double yen = amount * 111.087;
			System.out.println("Your " + amount + " Dollar is : " + String.format("%.2f" , yen) + " Yen");

			double ringgit = amount * 4.17;
			System.out.println("Your " + amount + " Dollar is : " + String.format("%.2f" , ringgit) + " ringgit");
		} else if (code == 3) {
			// For Pound Conversion

			double rupee = amount * 88;
			System.out.println("Your " + amount + " pound is : " + String.format("%.2f" , rupee) + " Ruppes");

			double dollar = amount * 1.26;
			System.out.println("Your " + amount + " pound is : " + String.format("%.2f" , dollar) + " Dollar");

			double euro = amount * 1.10;
			System.out.println("Your " + amount + " pound is : " + String.format("%.2f" , euro) + " Euro");

			double yen = amount * 140.93;
			System.out.println("Your " + amount + " pound is : " + String.format("%.2f" , yen) + " Yen");

			double ringgit = amount * 5.29;
			System.out.println("Your " + amount + " pound is : " + String.format("%.2f" , ringgit) + " ringgit");
		} else if (code == 4) {
			// For Euro Conversion

			double rupee = amount * 80;
			System.out.println("Your " + amount + " euro is : " + String.format("%.2f" , rupee) + " Ruppes");

			double dollar = amount * 1.14;
			System.out.println("Your " + amount + " euro is : " + String.format("%.2f" , dollar) + " Dollar");

			double pound = amount * 0.90;
			System.out.println("Your " + amount + " euro is : " + String.format("%.2f" , pound) + " Pound");

			double yen = amount * 127.32;
			System.out.println("Your " + amount + " euro is : " + String.format("%.2f" , yen) + " Yen");

			double ringgit = amount * 4.78;
			System.out.println("Your " + amount + " euro is : " + String.format("%.2f" , ringgit) + " ringgit");
		} else if (code == 5) {

			// For Yen Conversion

			double rupee = amount * 0.63;
			System.out.println("Your " + amount + " yen is : " + String.format("%.2f" , rupee) + " Ruppes");

			double dollar = amount * 0.008;
			System.out.println("Your " + amount + " yen is : " + String.format("%.2f" , dollar) + " Dollar");

			double pound = amount * 0.007;
			System.out.println("Your " + amount + " yen is : " + String.format("%.2f" ,  pound) + " Pound");

			double euro = amount * 0.007;
			System.out.println("Your " + amount + " yen is : " + String.format("%.2f" , euro) + " Euro");

			double ringgit = amount * 0.037;
			System.out.println("Your " + amount + " yen is : " + String.format("%.2f" , ringgit) + " ringgit");
		} else if (code == 6) {
			// For Ringgit Conversion

			double rupee = amount * 16.8;
			System.out.println("Your " + amount + " ringgit is : " + String.format("%.2f" , rupee) + " Ruppes");

			double dollar = amount * 0.239;
			System.out.println("Your " + amount + " ringgit is : " + String.format("%.2f" , dollar) + " dollar");

			double pound = amount * 0.188;
			System.out.println("Your " + amount + " ringgit is : " + String.format("%.2f" , pound) + " pound");

			double euro = amount * 0.209;
			System.out.println("Your " + amount + " ringgit is : " + String.format("%.2f" , euro) + " euro");

			double yen = amount * 26.63;
			System.out.println("Your " + amount + " ringgit is : " + String.format("%.2f" , yen) + " yen");
		} else {
			System.out.println("Invalid input");
		}
	}
}
