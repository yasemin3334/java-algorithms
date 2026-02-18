package baslangic;

public class Main {

	public static void main(String[] args) {
		book b1 = new book("sahipsizlik",100,"yasemin dözel","kodlama vakti");
		b1.setnumberOfPage(-90);
		System.out.println(b1.getnumberOfPage());
	}

}
