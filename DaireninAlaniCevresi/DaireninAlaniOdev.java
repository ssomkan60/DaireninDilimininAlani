import java.util.Scanner;
public class DaireninAlaniOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14;
        System.out.print("Yarıçapı Değerini Giriniz:");
        int r = input.nextInt();
        System.out.println("Yarıçapı:" +r);

        System.out.println("Açı Değerini Giriniz:");
        int a = input.nextInt();
        System.out.println("Açı Değeri:" + a);

        double alan;
        alan = (pi*(r*r)*a)/360;
        System.out.println("Alan:" + alan);

    }
}
