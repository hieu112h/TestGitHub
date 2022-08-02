package BTBuoi3;
import java.util.Scanner;
public class Employee {
	private String id;
	private String name;
	private int tuoi;
	private int workingDay;
	private double salary;
	public static int PRICE=50;
	public static Scanner sc=new Scanner (System.in);
	public void setid(String id) {
		this.id=id;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void settuoi(int tuoi) {
		this.tuoi=tuoi;
	}
	public void setworkingDay(int workingDay) {
		this.workingDay=workingDay;
	}
	public String getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public int gettuoi() {
		return tuoi;
	}
	public int getworkingDay() {
		return workingDay;
	}
//	public Employee(String id,String name,int tuoi,int workingDay) {
//		this.id=id;
//		this.name=name;
//		this.tuoi=tuoi;
//		this.workingDay=workingDay;
//	}
	public void input() {
		System.out.println("Nhap id: ");
		id=sc.nextLine();
		System.out.println("Nhap name: ");
		name=sc.nextLine();
		System.out.println("Nhap tuoi: ");
		tuoi=sc.nextInt();
		System.out.println("Nhap ngay lam viec: ");
		workingDay=sc.nextInt();
	}
	public float Tien() {
		return workingDay*PRICE;
	}
	public void output() {
		System.out.printf("%-10s%-10s%-10d%-15d%f",id,name,tuoi,workingDay,Tien());
	}
	public static void main(String[] args) {
//		Employee a=new Employee("1","A",10,10);
		Employee b=new Employee();
//		System.out.printf("%-10s%-10s%-10s%-15s%s \n","Id","Name","Tuoi","WorkingDay","TienLuong");
//		a.output();
		b.setid("2");
		b.setname("B");
		b.settuoi(12);
		b.setworkingDay(20);
		System.out.printf("%-10s%-10s%-10s%-15s%s \n","Id","Name","Tuoi","WorkingDay","TienLuong");
		System.out.printf("%-10s%-10s%-10d%-15d%f",b.getid(),b.getname(),b.gettuoi(),b.getworkingDay(),b.Tien());
		System.out.println();
		Employee c=new Employee();
		c.input();
		System.out.printf("%-10s%-10s%-10s%-15s%s \n","Id","Name","Tuoi","WorkingDay","TienLuong");
		c.output();
		
	}
}
