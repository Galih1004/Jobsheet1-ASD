import java.util.Scanner;

public class T1CariPlatNomor {

    public static void main(String[] args) {
        char[] kode = {
            'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'
        };

        char[][] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== PROGRAM PENCARI KOTA ===");
        System.out.print("Masukkan kode plat nomor (A/B/D/dll): ");
        
        char inputKode = scanner.next().toUpperCase().charAt(0);

        int indexDitemukan = cariIndexKode(kode, inputKode);

        if (indexDitemukan != -1) {
            System.out.print("Kota untuk plat " + inputKode + " adalah: ");
            tampilkanKota(kota, indexDitemukan);
        } else {
            System.out.println("Maaf, kode plat " + inputKode + " tidak ditemukan dalam sistem.");
        }
        
        scanner.close();
    }

    public static int cariIndexKode(char[] arrayKode, char target) {
        for (int i = 0; i < arrayKode.length; i++) {
            if (arrayKode[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void tampilkanKota(char[][] arrayKota, int index) {
        for (int j = 0; j < arrayKota[index].length; j++) {
            if (arrayKota[index][j] != '\0') { 
                System.out.print(arrayKota[index][j]);
            }
        }
        System.out.println();
    }
}