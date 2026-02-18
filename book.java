package baslangic;

public class book {
	public String name,author,publisher;
	private int numberOfPage;
	book(String name,int numberOfPage,String author,String publisher ){
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		if(numberOfPage<1) {
			this.numberOfPage=10;
		}
		else {
			this.numberOfPage=numberOfPage;
		}
	}
	public int getnumberOfPage() {
		return this.numberOfPage;
	}
	public void setnumberOfPage(int size) {
		if(size<1) {
			System.out.println("sayi eksi olamaz!!!");
			this.numberOfPage=10;
		}else {
			this.numberOfPage=size;
		}
	}

}
