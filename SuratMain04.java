import java.util.Scanner;

public class SuratMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat04 stackSurat = new StackSurat04();

        int pilihan;
        do {
            System.out.println("\n=== MENU SURAT IZIN MAHASISWA ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses & Verifikasi Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir (Terverifikasi)");
            System.out.println("4. Cari Surat Izin");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat       : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = sc.nextInt();
                    sc.nextLine(); 

                    Surat04 suratBaru = new Surat04(id, nama, kelas, jenis, durasi);
                    stackSurat.pushSurat(suratBaru);
                    break;
                case 2:
                    stackSurat.prosesSurat(); // sekarang dengan verifikasi
                    break;
                case 3:
                    stackSurat.lihatSuratTerakhir();
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String namaCari = sc.nextLine();
                    stackSurat.cariSurat(namaCari);
                    break;
                case 5:
                    System.out.println("Program selesai. Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}
