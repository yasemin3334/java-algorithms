package yasemin1;

import java.util.Scanner;

public class ornekler2 {

	public static void main(String[] args) {
		// örnek1=faktöriyel hesaplama
		//örnek2=harmonik sayi hesaplama
		//örnek3=yıldızlar ile üçgen girme 
		//örnek4=üslü sayi hesaplama
		/*Scanner scan=new Scanner(System.in);
		int i;
		int sonuc=1;
		System.out.println("faktöriyeli alınacak sayı");
		i=scan.nextInt();
		while(i>0) {
			sonuc=sonuc*i;
			i--;
		}
        System.out.println(sonuc);
        */
		
		/*Scanner scan=new Scanner(System.in);
		double h;
		double sonuc=0.0;
		System.out.println("harmoniği hesaplanan sayi");
		h=scan.nextDouble();
		while(h>0) {
			sonuc=sonuc+(1/h);
			h--;
		}
		System.out.println(sonuc);
		*/
		/*
		Scanner scan=new Scanner(System.in);
		int yıldız;
		
		System.out.println("girilecek değer");
		yıldız=scan.nextInt();
		int i=1;
		while(i<=yıldız) {
			int k=1;
			while(k<=i)
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
			
		}
		*/
		
		
		
		Scanner scan=new Scanner(System.in);
		int i;
		int k;
		int sonuc=1;
		System.out.println("üssü alinacak sayi");
		i=scan.nextInt();
		System.out.println("üs olan sayi");
		k=scan.nextInt();
		int a=1;

		while(a<=k) {
			sonuc=sonuc*i;
			a++;
		}
		System.out.println("sonuc:"+sonuc);

		
		
	}

}
