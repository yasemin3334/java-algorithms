package yasemin1;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int input,toplam;
		System.out.println("bir sayi girin");
		input=scan.nextInt();
		int s1=0;
		int s2=1;
		System.out.println(input+"sayisinin fibonacci serisi");
		for(int i=1;i<=input;i++) {
			System.out.print(s1+",");
			toplam=s1+s2;
			s1=s2;
			s2=toplam;
		}
		

	}

}
