public class durasiBelajar {
    public static void main(String[] args) {
        int[] durasi = {45, 60, 30, 90, 75};

        int total = 0;
        int terlama = durasi[0];
        int tersingkat = durasi[0];

        System.out.print("Data durasi belajar (menit): ");
        for (int i = 0; i < durasi.length; i++) {
            System.out.print(durasi[i] + " ");

            total += durasi[i];

            if (durasi[i] > terlama) {
                terlama = durasi[i];
            }

            if (durasi[i] < tersingkat) {
                tersingkat = durasi[i];
            }
        }

        double rataRata = (double) total / durasi.length;

        System.out.println("\nTotal durasi            : " + total + " menit");
        System.out.println("Rata-rata durasi        : " + rataRata + " menit");
        System.out.println("Durasi paling lama      : " + terlama + " menit");
        System.out.println("Durasi paling singkat   : " + tersingkat + " menit");
    }
}
    

