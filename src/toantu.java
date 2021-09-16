import java.util.Scanner;

public class toantu {
    public static void main(String[] args) {
        int width ;
        int length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap chieu rong");
        width = scanner.nextInt();
        System.out.println("Moi ban nhap chieu dai");
        length = scanner.nextInt();
        int area = width*length;
        System.out.println("Dien tich hcn la " + area);
    }
}
