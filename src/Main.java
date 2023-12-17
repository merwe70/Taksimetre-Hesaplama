import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double total, km, perKm = 2.20, startPrice = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Km Giriniz : ");
        km = input.nextInt();


        total = km * perKm;
        total += startPrice;


        // total = (total < 20 ) ? 20: total;
        // System.out.println("Toplam : " + total);


        if (total < 20.0) {
            System.out.println("Borcunuz 20 TL");
        } else if (total > 20.0) {
            System.out.println("Borcunuz : " + total);
        }
    }

}
