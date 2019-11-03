package BTVN_B2;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testRegex {
    public static void main(String[] args) {
        String a;
        String b ;
        System.out.println("Xin moi nhap gioi tinh (Male/Female):");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        System.out.println(a);
        String regex= "(Male|Female)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("Male|Female");
        if (boolean b = matcher.matches()) {
            System.out.println("Nhập đúng");
        } else {
        System.out.println("Nhập sai"); }
    }
}
