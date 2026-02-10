import java.util.Scanner;

public class P1Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input nilai
        System.out.print("Masukkan nilai Tugas (0-100): ");
        double nilaiTugas = sc.nextDouble();
        
        System.out.print("Masukkan nilai Kuis (0-100): ");
        double nilaiKuis = sc.nextDouble();
        
        System.out.print("Masukkan nilai UTS (0-100): ");
        double nilaiUTS = sc.nextDouble();
        
        System.out.print("Masukkan nilai UAS (0-100): ");
        double nilaiUAS = sc.nextDouble();
        // Validasi input
        if (nilaiTugas < 0 || nilaiTugas > 100 || 
            nilaiKuis < 0 || nilaiKuis > 100 || 
            nilaiUTS < 0 || nilaiUTS > 100 || 
            nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid");
            sc.close();
            return;
        }
        // Hitung nilai akhir
        double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
        // Validasi nilai akhir
        if (nilaiAkhir < 0 || nilaiAkhir > 100) {
            System.out.println("Nilai Tidak Valid");
        }
        // Konversi ke nilai huruf
        String nilaiHuruf;
        String keterangan;
        
        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
            keterangan = "LULUS";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            keterangan = "LULUS";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
            keterangan = "LULUS";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            keterangan = "LULUS";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
            keterangan = "LULUS";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
            keterangan = "TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            keterangan = "TIDAK LULUS";
        }
        
        // Output hasil
        System.out.println("\n===== HASIL NILAI =====");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);
        
        sc.close();
    }
}