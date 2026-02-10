import java.util.Scanner;

public class P1Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input NIM
        System.out.print("Masukkan NIM: ");
        String nim = sc.next();

        // Masukkan 2 Digit Terakhir
        System.out.print("Dua Digit Terakhir pada NIM:");
        int n = sc.nextInt();
        
        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }  
        System.out.print("Output: ");
        System.out.println("NIM :" + nim );
        System.out.println("Dua Digit Terakhir:" + n);
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("# ");
            }
            else if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            else {
                System.out.print("* ");
            }
        }
        System.out.println();
        sc.close();
    }
}
