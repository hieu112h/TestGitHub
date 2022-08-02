package BTBuoi3;
import java.util.Scanner;
public class PTBac2 {
	private double a;
	private double b;
	private double c;
	public static Scanner sc = new Scanner(System.in);
    public void input() {
    	System.out.println("Nhap a: ");
    	a=sc.nextDouble();
    	System.out.println("Nhap b: ");
    	b=sc.nextDouble();
    	System.out.println("Nhap c: ");
    	c=sc.nextDouble();
    }
    public void output() {
    	System.out.println(a+"x^2"+b+"x"+c+"=0");
    }
    public void giaiPT() {
    	double denta;
    	denta=b*b-4*a*c;
    	double candenta;
    	candenta=Math.sqrt(denta);
    	if(denta<0) {
    		System.out.println("PT vo nghiem");
    	}
    	else if(denta==0) {
    		System.out.println("PT nghiem kep x1=x2="+(-b/(2*a)));
    	}
    	else
    	{
    		System.out.println("PT co 2 nghiem phan biet");
    		System.out.println("x1="+((-b+candenta)/(2*a)));
    		System.out.println("x2="+((-b-candenta)/(2*a)));
    		
    	}
    }
    public static void main(String[] args) {
		PTBac2 a= new PTBac2();
		a.input();
		System.out.println("PT sau khi nhap");
		a.output();
		a.giaiPT();
	}
}
