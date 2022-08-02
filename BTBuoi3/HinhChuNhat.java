package BTBuoi3;
import java.util.Scanner;
public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;
	public static Scanner sc=new Scanner(System.in);
	public void input() {
		System.out.println("Nhap chieu dai hinh chu nhat");
		chieuDai=sc.nextDouble();
		System.out.println("Nhap chieu rong hinh chu nhat");
		chieuRong=sc.nextDouble();
	}
	public void output() {
		System.out.println("Chieu dai: "+chieuDai);
		System.out.println("Chieu rong:  "+chieuRong);
	}
	public double S() {
		double s;
		s=(double)chieuDai*chieuRong;
		return s;
	}
	public double P() {
		double p;
		p=(double)(chieuDai+chieuRong)*2;
		return p;
	}
	public void setchieuDai(double chieuDai) {
		this.chieuDai=chieuDai;
	}
	public void setchieuRong(double chieuRong) {
		this.chieuRong=chieuRong;
	}
	public double getchieuDai(){
		return chieuDai;
	}
	public double getchieuRong() {
		return chieuRong;
	}
	public static void main(String[] args) {
		HinhChuNhat a=new HinhChuNhat();
		HinhChuNhat b=new HinhChuNhat();
		a.setchieuDai(6);
		a.setchieuRong(4);
		System.out.println("Chieu dai : "+a.getchieuDai());
		System.out.println("Chieu rong : "+a.getchieuRong());
		System.out.println("Dien tich : "+a.S());
		System.out.println("Chu Vi : "+a.P());
		b.setchieuDai(5.3);
		b.setchieuRong(3.3);
		System.out.println("Chieu dai : "+b.getchieuDai());
		System.out.println("Chieu rong : "+b.getchieuRong());
		System.out.println("Dien tich : "+b.S());
		System.out.println("Chu Vi : "+b.P());
		if(a.S()<b.S()) {
			System.out.println("Dien tich hinh b lon hon");
		}
		else
			System.out.println("Dien tich hinh a lon hon");
	}
}
