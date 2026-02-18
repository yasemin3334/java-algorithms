package yasemin1;

import java.util.Scanner;

public class ucakbileti {

	public static void main(String[] args) {
		// km birim fiyati 0.10$
		//12 yasından küçüksen yüzde 50 indirim
		//12 ve 24 yas arasındaysan yüzde 10 indirim
		//65 yaş üstü isen yüzde 30 indirim
		//gidis dönüş alırsan yüzde 20 indirim
		Scanner scan=new Scanner(System.in);
		int km,yas,tip;
		double normalfiyat,indirimli,tipliindirim;
		System.out.println("km girin:");
		km=scan.nextInt();
		System.out.println("yasini girin:");
		yas=scan.nextInt();
		System.out.println("tipi seç(1=tek yön)(2=gidis dönüs)");
		tip=scan.nextInt();
		if(yas>0&&km>0&&(tip ==1|| tip==2))
		{
			normalfiyat=km*0.10;
			if(yas<12) {
				indirimli=normalfiyat*0.50;
				normalfiyat=normalfiyat-indirimli;
			}else if(12<=yas && yas<=24){
				indirimli=normalfiyat*0.10;
				normalfiyat=normalfiyat-indirimli;
			}else if(yas>=65) {
				indirimli=normalfiyat*0.30;
				normalfiyat=normalfiyat-indirimli;
			}else {
				indirimli=0;
			}
			if(tip==2) {
				indirimli=normalfiyat*0.20;
				normalfiyat=(normalfiyat-indirimli)*2;
			} 
			System.out.println("bilet tutari:"+normalfiyat+("$"));
		}
			else {
				System.out.println("yanlıs değerler girdiniz...");
				
			}
		}
		

	}


