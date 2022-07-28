package BTBuoi2;
import java.util.Scanner;
public class Bai1 {
    public static float TBCSoLe(int a[], int n){
        int count = 0;
        float sum = 0;
        float tbc;
        for(int i = 0; i < n; i++){
            if((a[i] % 2 != 0) && ((i + 1) % 2 == 0)){
                sum += a[i];
                count++;
            }
        }
        tbc = sum / count;
        return tbc;
    }

    public static int Min(int a[], int n){
        int min = a[0];
        for(int i = 0; i < n; i++){
            if(a[i] < min){
                min = i;
            }
        }
        return min;
    }

    public static boolean check(int n){
        int i = (int) Math.sqrt(n);
        if(i*i != n){
            return false;
        }
        return true;
    }

    public static void SoChinhPhuong(int a[], int n){
        int count1 = 0;
        for(int i = 0; i < n; i++){
            if(check(a[i])) {
                System.out.print(a[i] + " ");
                count1++;
            }
        }
        if(count1 == 0){
            System.out.println("Mang khong co so chinh phuong");
        }
    }

    public static boolean check2(int n){
       if(n == 2) return true;
       else if(n < 2)  return false;
       else {
           for(int i = 2; i * i <= n; i++){
              if(n % i == 0){
                    return false;
                }
            }
       }
       return true;
    }

    public static void SoNguyenTo(int a[], int n){
    	int count2=0;
        for(int i=0;i<n;i++) {
            if(check2(a[i])){
                System.out.print(a[i] + " ");
                count2++;
            }
        }
        if(count2==0){
        	System.out.println("Mang khong co so nguyen to");
        }
    }

    public static void SapXep(int a[], int n){
    	int tg;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i] > a[j]){
                    tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Nhap gia tri mang ");
        for(int i = 0; i < n; i++){
        	System.out.println("Nhap phan tu thu: "+(i+1));
            a[i] = sc.nextInt();
        }

        System.out.println("1. TBC so le o vi tri chan: " + TBCSoLe(a, n) );
        System.out.println();
        System.out.println("2. Vi tri so nho nhat trong mang: " + Min(a, n));
        System.out.println();
        System.out.println("3. Cac so chinh phuong trong mang: ");
        SoChinhPhuong(a, n);
        System.out.println();
        System.out.println();
        System.out.println("4. Cac so nguyen to trong mang: ");
        SoNguyenTo(a, n);
        System.out.println();
        System.out.println();               
        System.out.println("5. Mang sau khi sap xep tang dan: ");
        SapXep(a, n);
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
