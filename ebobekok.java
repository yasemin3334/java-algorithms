package yasemin1;

import java.util.Scanner;

public class ebobekok {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int s1,s2,ebob=1,ekok,i;
		System.out.println("sayilari giriniz");
		s1=scan.nextInt();
		s2=scan.nextInt();
		int min=(s1<s2)?s1 :s2;
		for(i=min;i>0;i--) {
			if((s1%i==0)&&(s2%i==0)) {
			ebob=i;
			break;
			}
		}
		ekok=(s1*s2)/ebob;
		System.out.println("sayılarin ebobu"+ebob);
		System.out.println("sayılaarın ekoku"+ekok);

	}

}
