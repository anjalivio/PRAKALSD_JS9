import java.util.Scanner;
import java.util.Stack;

public class StackSurat04 {
    private Stack<Surat04> suratMasuk;
    private Stack<Surat04> suratTerverifikasi;

    public StackSurat04() {
        suratMasuk = new Stack<>();
        suratTerverifikasi = new Stack<>();
    }
    public void pushSurat(Surat04 surat) {
        suratMasuk.push(surat);
        System.out.println("Surat berhasil ditambahkan ke daftar masuk.");
    }
    public void prosesSurat() {
        if (!suratMasuk.isEmpty()) {
            Surat04 surat = suratMasuk.pop();
            System.out.println("Surat berikut akan diverifikasi:");
            surat.displayInfo();

            Scanner sc = new Scanner(System.in);
            System.out.print("Apakah surat ini valid dan diterima? (y/n): ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("y")) {
                suratTerverifikasi.push(surat);
                System.out.println("Surat telah diverifikasi dan disimpan.");
            } else {
                System.out.println("Surat ditolak dan tidak disimpan.");
            }
        } else {
            System.out.println("Tidak ada surat yang perlu diverifikasi.");
        }
    }
    public void lihatSuratTerakhir() {
        if (!suratTerverifikasi.isEmpty()) {
            System.out.println("Surat terakhir yang telah diverifikasi:");
            suratTerverifikasi.peek().displayInfo();
        } else {
            System.out.println("Belum ada surat yang diverifikasi.");
        }
    }
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (Surat04 surat : suratMasuk) {
            if (surat.getNamaMahasiswa().equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan di daftar masuk:");
                surat.displayInfo();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            for (Surat04 surat : suratTerverifikasi) {
                if (surat.getNamaMahasiswa().equalsIgnoreCase(nama)) {
                    System.out.println("Surat ditemukan di daftar yang telah diverifikasi:");
                    surat.displayInfo();
                    ditemukan = true;
                    break;
                }
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
