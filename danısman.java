package yasemin1;

import java.util.ArrayList;

public class danısman {
	private String isim;
	private ArrayList<öğrenci>ögrenciler;
	public danısman(String isim) {
		this.ögrenciler=new ArrayList<>();
	}
	public boolean addöğrenci(öğrenci ogrenci) {
		if(ögrenciler.size()>=40) {
			System.out.println("danışman daha fazla öğrenci alamaz...");
			return false;
			
		}
		ögrenciler.add(ogrenci);
		return true;
		
	}
	public void güncelOgrenci(öğrenci o,String newAd,double newGNotOrt) {
		o.degistir(newAd, newGNotOrt);
	}
	public void ogrenciGoster() {
		System.out.println(isim+"danışmanlığındaki öğrenciler:");
		for(öğrenci o : ögrenciler) {
			System.out.println(o);
		}
	}

}
