package BTVN_B2;
import java.util.Scanner;
public class PTbac2
{
    public static void main( String[] args )
    {
        float a = 0;
        float b = 0;
        float c = 0;
        double delta = 0;
        System.out.println( "Giai Phuong Trinh Bac 2: ax^2 + bx +c = 0 (a!=0)" );
        Scanner sc = new Scanner(System.in);
        System.out.print("Xin moi nhap gia tri cua a: ");
        a = sc.nextFloat();
        while (a == 0)
        {
            System.out.println("Gia tri a phai khac 0");
            System.out.print("Vui long nhap lai gia tri a: ");
            a = sc.nextFloat();
        }
        System.out.print("Xin moi nhap gia tri cua b: ");
        b = sc.nextFloat();
        System.out.print("Xin moi nhap gia tri cua c: ");
        c = sc.nextFloat();
        delta = Math.pow(b,2) - 4*a*c;
        System.out.println("Gia tri Delta cua phuong trinh bac 2 la: " +delta);
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        }
        if (delta == 0) {
            System.out.println("Phuong trinh co 1 nghiem kep: x1 = x2 = -b/2a = " + -b / 2*a);
        }
        if (delta > 0) {
            System.out.println("Phuong trinh co 2 nghiem:");
            System.out.println("x1 = " +(-b + Math.sqrt(delta))/2*a);
            System.out.println("x2 = " +(-b - Math.sqrt(delta))/2*a);
        }
    }
}
