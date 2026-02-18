package yasemin1;

public class employee {
	private String name;
	public double salary;
	private int workhours,hireyear;
	employee(int hireyear,int workhours,double salary,String name  ){
		this.name=name;
		this.salary=salary;
		this.workhours=workhours;
		this.hireyear=hireyear;
	}
	public double tax() {
		if(this.salary>=1000) {
			return salary*0.03;
		}
		return 0.0;
	}
	public double bonus() {
		int extrahours=this.workhours-40;
		if(extrahours>0) {
			return 30*extrahours;
		}
		return 0.0;
	}
	public double incrase() {
		int year=2020-hireyear;
		if(year<10) {
			return 0.5*salary;
		}else if(year>=10 && year<20) {
			return salary*0.10;
		}else {
			return salary*0.15;
		}
	}

}
