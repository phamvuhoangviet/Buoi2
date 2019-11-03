package BTVN_B2;

import java.util.Scanner;

public class KtraSoNguyento {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        System.out.println("Xin moi nhap 1 so nguyen a bat ky:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        ktraSNT(a);
//        for (b=1;b<a;b++) {
////            if (ktraSNT(a))
////                System.out.println(b);
    }

    public static void ktraSNT(int a) {
        int dem = 0;
        if (a < 2) {
            System.out.println("So a khong phai la so nguyen to.");
        }
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                dem = dem + 1;
            }
        }
        if (dem == 2) {
            System.out.println("a la so nguyen to");
        } else {
            System.out.println("a khong phai la so nguyen to");
        }
    }
}


