package yasemin1;

import java.util.Scanner;

public class asalsayi {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int input;
		boolean asal=true;
		do {
			System.out.println("bir sayi girin");
			input=scan.nextInt();
		}while(input<2);
		for(int i=2;i<input;i++) {
			if(input%i==0) {
				asal=false;
				break;
			}
		}
		if(asal) {
			System.out.println("sayi asal "+input);
		}else {
			System.out.println("sayi asal değildir "+input);
		}

	}

}
