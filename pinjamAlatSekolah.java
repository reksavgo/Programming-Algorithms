public class pinjamAlatSekolah {
    public static void main(String[] args) {
        
        boolean kartuPelajar = true;
        boolean tidakAdaTanggunganPinjam = true;
        
        if (kartuPelajar && tidakAdaTanggunganPinjam) {
            System.out.println("Boleh meminjam alat sekolah.");
        } else {
            System.out.println("Anda tidak boleh meminjam alat sekolah.");
        }
    }
}
