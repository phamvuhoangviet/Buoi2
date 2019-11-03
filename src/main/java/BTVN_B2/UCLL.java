package BTVN_B2;
import java.util.Scanner;
public class UCLL {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        System.out.println("Xin moi nhap 1 so nguyen a bat ky:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Xin moi nhap 1 so nguyen b bat ky:");
        b = sc.nextInt();
        UCLL(a,b);
    }
    public static void UCLL(int a, int b) {
        int x =0;
        int c =0;
        if (a>b) {
            x = a;
        } else {
            x = b;
        }
        for (int i = 1; i < x; i++) {
            if (a%i == 0 && b%i == 0) {
                c = i;
            }
        }
        System.out.println("UCLL cua 2 so a va b la: " +c);
    }
}

