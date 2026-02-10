import java.util.Scanner;

public class T1JadwalKuliah {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mata kuliah yang ingin diinput (n): ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];
        isiJadwal(jadwal);

        while (true) {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan Seluruh Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSemuaJadwal(jadwal);
                    break;
                case 2:
                    System.out.print("Masukkan nama hari (Senin/Selasa/dll): ");
                    String cariHari = sc.nextLine();
                    tampilkanJadwalPerHari(jadwal, cariHari);
                    break;
                case 3:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String cariMatkul = sc.nextLine();
                    tampilkanJadwalPerMatkul(jadwal, cariMatkul);
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
    static void isiJadwal(String[][] data) {
        System.out.println("\n--- Input Data Jadwal ---");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah     : ");
            data[i][0] = sc.nextLine();
            
            System.out.print("Ruang                : ");
            data[i][1] = sc.nextLine();
            
            System.out.print("Hari                 : ");
            data[i][2] = sc.nextLine();
            
            System.out.print("Jam (contoh: 08.00)  : ");
            data[i][3] = sc.nextLine();
            System.out.println();
        }
    }

    static void tampilkanSemuaJadwal(String[][] data) {
        System.out.println("\n--- Seluruh Jadwal Kuliah ---");
        System.out.printf("%-25s %-15s %-10s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-25s %-15s %-10s %-15s\n", 
                data[i][0], data[i][1], data[i][2], data[i][3]);
        }
    }

    static void tampilkanJadwalPerHari(String[][] data, String hariDicari) {
        System.out.println("\n--- Jadwal Hari " + hariDicari + " ---");
        System.out.printf("%-25s %-15s %-10s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-------------------------------------------------------------------");

        boolean ditemukan = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i][2].equalsIgnoreCase(hariDicari)) {
                System.out.printf("%-25s %-15s %-10s %-15s\n", 
                    data[i][0], data[i][1], data[i][2], data[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hariDicari);
        }
    }

    static void tampilkanJadwalPerMatkul(String[][] data, String matkulDicari) {
        System.out.println("\n--- Pencarian Mata Kuliah: " + matkulDicari + " ---");
        System.out.printf("%-25s %-15s %-10s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-------------------------------------------------------------------");

        boolean ditemukan = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i][0].equalsIgnoreCase(matkulDicari)) {
                System.out.printf("%-25s %-15s %-10s %-15s\n", 
                    data[i][0], data[i][1], data[i][2], data[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah " + matkulDicari + " tidak ditemukan.");
        }
    }
}