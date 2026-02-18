package yasemin1;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int sayi1,sayi2,secim;
		System.out.print("ilk sayiyi girin:");
		sayi1=scan.nextInt();
		System.out.print("\nikinci sayiyi girin:");
        sayi2=scan.nextInt();
        System.out.print("\nlütfen yapmak istediğiniz işlemi seciniz!");
        System.out.print("\n1- toplama\n2- çıkarma\n3- çarpma\n4- bölme");
        System.out.print("\nseçiminiz:");
        secim=scan.nextInt();
        if(secim==1)
        {
        	System.out.println("toplama:"+(sayi1+sayi2));
        }else if(secim==2) {
        	System.out.println("cıkarma:"+(sayi1-sayi2));
        }else if(secim==3) {
        	System.out.println("carpma:"+(sayi1*sayi2));
        }else if(secim==4) {
        	if(sayi2==0) {
        		System.out.println("sonuc belirsizdir!!!");
        	}else {
        		System.out.println("bolme:"+(sayi1/sayi2));
        	}
        }else {
        	System.out.println("gecersiz işlem yaptiniz!!!");
        }
	}

}
