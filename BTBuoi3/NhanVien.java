package BTBuoi3;
import java.util.Scanner;
public class NhanVien {
	private int maNV;
	private String tenNV;
	private int tuoi;
	private String diaChi;
	private String boPhan;
	private static int temp=1;
	public static Scanner sc= new Scanner(System.in);
	public void output() {
		System.out.printf("%-10d%-10s%-10d%-10s%-10s \n",maNV,tenNV,tuoi,diaChi,boPhan);
	}
	public NhanVien(String tenNV,int tuoi,String diaChi,String boPhan) {
		maNV=temp++;
		this.tenNV=tenNV;
		this.tuoi=tuoi;
		this.diaChi=diaChi;
		this.boPhan=boPhan;
	}
	
	public static void main(String[] args) {
		NhanVien a=new NhanVien("A",23,"TH","CNTT");
		NhanVien b=new NhanVien("B",21,"HN","QLI");
		NhanVien c=new NhanVien("C",21,"HP","CNTT");
		NhanVien d=new NhanVien("D",24,"QLI","CNTT");
		NhanVien e=new NhanVien("E",25,"HN","QLI");
		System.out.printf("%-10s%-10s%-10s%-10s%-10s \n","Manv","Tennv","Tuoi","DiaChi","BoPhan");
		a.output();
		b.output();
		c.output();
		d.output();
		e.output();
		
	}
}
