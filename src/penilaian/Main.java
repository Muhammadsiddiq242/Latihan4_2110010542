
package penilaian;


public class Main {
    public static void main(String[] args) {
        // Membuat objek nilai akhir
        NilaiAkhir nilai = new NilaiAkhir("12345", "muhammad siddiq", 80, 85, 90);

        // Menggunakan getter untuk mengakses nilai variabel dan mencetaknya
        System.out.println("NPM: " + nilai.getNpm());
        System.out.println("Nama: " + nilai.getNama());
        System.out.println("UTS: " + nilai.getUts());
        System.out.println("UAS: " + nilai.getUas());
        System.out.println("Tugas: " + nilai.getTugas());

        // Menghitung nilai akhir
        double nilaiAkhir = nilai.hitungNilaiAkhir();
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}
