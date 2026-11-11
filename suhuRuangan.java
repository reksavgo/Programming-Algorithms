public class suhuRuangan {
    public static void main(String[] args) {
        int suhu = 24;

        if (suhu < 18) {
            System.out.println("Suhu ruangan terlalu dingin.");
        } else if (suhu >= 18 && suhu <= 27) {
            System.out.println("Suhu ruangan normal.");
        } else {
            System.out.println("Suhu ruangan terlalu panas.");
        }
    }
}
