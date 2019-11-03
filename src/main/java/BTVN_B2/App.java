package BTVN_B2;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        float a = 0;
        float b = 0;
        float x = 0;
        System.out.println( "Giai Phuong Trinh Bac 1: ax + b = 0" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin moi nhap gia tri cua a:");
        a = sc.nextFloat();
        System.out.println("Xin moi nhap gia tri cua b:");
        b = sc.nextFloat();
        x = -b/a;
        System.out.println("Nghiem cua phuong trinh la:" +x);
    }
}

