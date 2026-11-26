import java.util.Scanner;

public class hitungHurufKalimat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        int jumlahKarakter = kalimat.length();

        int jumlahHurufA = 0;
        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);
            if (karakter == 'a' || karakter == 'A') {
                jumlahHurufA++;
            }
        }

        String kalimatKapital = kalimat.toUpperCase();

        // Menampilkan hasil
        System.out.println("\n--- Hasil Pengolahan Kalimat ---");
        System.out.println("Jumlah seluruh karakter : " + jumlahKarakter);
        System.out.println("Jumlah huruf 'a'        : " + jumlahHurufA);
        System.out.println("Kalimat huruf kapital   : " + kalimatKapital);

        if (jumlahKarakter > 0) {
            char pertama = kalimat.charAt(0);
            char terakhir = kalimat.charAt(jumlahKarakter - 1);
            System.out.println("Karakter pertama        : " + pertama);
            System.out.println("Karakter terakhir       : " + terakhir);
        } else {
            System.out.println("Kalimat kosong, tidak ada karakter pertama dan terakhir.");
        }

        input.close();
    }
} 
 