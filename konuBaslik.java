package finalHazirlik;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class konuBaslik {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		ArrayList<String> konular = new ArrayList();
		int konuSayisi;
		while(true) {
			System.out.println("Bİl dersi konu sayisini giriniz:");
			konuSayisi = scanner.nextInt();
			scanner.nextLine();
			if(konuSayisi >=3 && konuSayisi<=10) {
				break;
			}else {
				System.out.println("konu sayisi 3 den küçük ve 10 dan büyük olamaz...");
			}
		}
		System.out.println(".............................................................");
		for(int i=0;i< konuSayisi;) {
			System.out.println((i+1)+"konu başlığınızı girin:");
			String konu=scanner.nextLine();
			if(konular.contains(konu)) {
				System.out.println("hatali giriş! aynı konu iki kere girilmez..");
			}else {
				konular.add(konu);
				i++;
			}
		}
		System.out.println("...............................................................");
		System.out.println("Bil konularını girin.");
		System.out.println("ilk anlatılacak konu:"+konular.get(0));
		System.out.println("son anlatılacak konu:"+konular.get(konular.size()-1));
		System.out.println("konular(giriş sırasına göre):");
		for(String k:konular) {
			System.out.println(k+" ");
		}
		System.out.println();
		ArrayList<String> siraliKonular = new ArrayList<>(konular);
		Collater trCollater = Collater.getInstace(new Locale("tr","TR"));
		Collactions.sort(siraliKonular,trCollater);
		System.out.println("konular (harf sırasına göre):");
		for (String k : siraliKonular) {
            System.out.print(k + " ");
        }

        scanner.close();

	}

}
