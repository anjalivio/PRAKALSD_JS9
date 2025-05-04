public class Surat04 {
    private String idSurat, namaMahasiswa, kelas;
    private char jenisIzin;
    private int durasi;
    public Surat04() {}
    public Surat04(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi){
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
    public String getIdSurat() {
        return idSurat;
    }
    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }
    public String getKelas() {
        return kelas;
    }
    public char getJenisIzin() {
        return jenisIzin;
    }
    public int getDurasi() {
        return durasi;
    }
    public void displayInfo() {
        System.out.println("ID Surat     : " + idSurat);
        System.out.println("Nama         : " + namaMahasiswa);
        System.out.println("Kelas        : " + kelas);
        System.out.println("Jenis Izin   : " + (jenisIzin == 'S' ? "Sakit" : "Izin"));
        System.out.println("Durasi (hari): " + durasi);
    }
}
