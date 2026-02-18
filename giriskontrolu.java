package yasemin1;

import java.util.Scanner;

public class giriskontrolu {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String k_adi;
		String parola;
		System.out.print("kullanici adini girin:");
		k_adi = scan.nextLine();
	    System.out.print("parolayi girin:");
	    parola= scan.nextLine();
	    if(k_adi.equals("java")&&parola.equals("123"))
	    {
	    	System.out.println("başarili işlem yaptınız...");
	    }else {
	    	System.out.println("yanlış giriş yaptınız...");
	    }

	}

}
