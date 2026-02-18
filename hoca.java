package yasemin1;
import java.util.Scanner;

import java.util.Scanner;

public class hoca{
	
	public static int[] diziIklendir() {
		int[] x = new int[10];
		
		for(int i = 0; i < x.length; i++) {
			x[i] = 2*i+1;
		}
		
		return x;
	}

	public static void main(String[] args) {

		int[] a = diziIklendir();
		
		System.out.println("Dizinin elemanları:");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		
		Scanner oku = new Scanner(System.in);
		int[] sayilar = new int[5];
		System.out.println("Lütfen " + sayilar.length + " tane tam sayı giriniz");
		for(int i = 0; i < sayilar.length; i++) {
			System.out.print((i+1) + ". sayıyı giriniz: ");
			sayilar[i] = oku.nextInt();
		}
		
		System.out.print("Girdiğiniz sayılar: ");
		for(int i = 0; i < sayilar.length; i++) {
			System.out.print(sayilar[i] + " ");
		}
		System.out.println();
		
		int maks = sayilar[0];
		int maksInd = 0;
		for(int i = 1; i < sayilar.length; i++) {
			if(maks < sayilar[i]) {
				maks = sayilar[i];
				maksInd = i;
			}
		}
		System.out.println((maksInd+1) + ". olarak girdiğiniz " + maks +
							" sayısı en büyük sayıdır.");
		
		int toplam = 0;
		float ort;
		for(int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		ort = (float) toplam / sayilar.length;
		System.out.println("Girdiğiniz sayıların ortalaması: " + ort);
		
		for(int i = 0; i < sayilar.length/2; i++) {
			int temp = sayilar[i];
			sayilar[i] = sayilar[sayilar.length-1-i];
			sayilar[sayilar.length-1-i] = temp;
		}
		
		System.out.println("Girdiğiniz sayıların tersten sıralaması:");
		for(int i = 0; i < sayilar.length; i++) {
			System.out.print(sayilar[i] + " ");
		}
		System.out.println();
		
		int tekSayiTop = 0;
		int ciftSayiTop = 0;
		for(int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] % 2 == 0) {
				ciftSayiTop += sayilar[i];
			}
			else {
				tekSayiTop += sayilar[i];
			}
		}
		System.out.println("Girdiğiniz çift sayıların toplamı: " + ciftSayiTop);
		System.out.println("Girdiğiniz tek sayıların toplamı: " + tekSayiTop);
		if(ciftSayiTop > tekSayiTop) {
			System.out.println("Çift sayıların toplamı daha büyüktür.");
		}
		else if(tekSayiTop > ciftSayiTop) {
			System.out.println("Tek sayıların toplamı daha büyüktür");
		}
		else {
			System.out.println("Çift ve tek sayıların toplamı birbirine eşittir.");
		}

	}

}
