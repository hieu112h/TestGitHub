package Test1;
import java.util.Scanner;
public class ChuanHoaChuoi {
	public static void main(String[] args) {
		String str;
		String s2="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		str= sc.nextLine();
		System.out.println("Chuoi sau khi nhap : "+str);
		String[] s;
		s=str.split(" ");
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}
}
