import java.util.Scanner;

public class menuMesinMinum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MESIN MINUMAN ===");
        System.out.println("1. Air Mineral");
        System.out.println("2. Teh Kotak");
        System.out.println("3. Kopi Kaleng");
        System.out.println("4. Jus Buah");
        System.out.println("5. Susu Kotak");
        System.out.print("Masukkan pilihan (1-5): ");

        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Minuman: Air Mineral");
                System.out.println("Harga  : Rp 5.000");
                break;
            case 2:
                System.out.println("Minuman: Teh Kotak");
                System.out.println("Harga  : Rp 7.000");
                break;
            case 3:
                System.out.println("Minuman: Kopi Kaleng");
                System.out.println("Harga  : Rp 10.000");
                break;
            case 4:
                System.out.println("Minuman: Jus Buah");
                System.out.println("Harga  : Rp 12.000");
                break;
            case 5:
                System.out.println("Minuman: Minuman Soda");
                System.out.println("Harga  : Rp 9.000");
                break;
            default:
                System.out.println("Pilihan tidak valid. Masukkan angka 1 sampai 5.");
                break;
        }

        input.close();
    }
}