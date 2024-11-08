import java.util.Scanner;

public class Flowchart23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] hasil = new int[10][6];

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                int nilai;
                do {
                    System.out.print("Nilai untuk pertanyaan " + (j + 1) + " (1-5): ");
                    nilai = sc.nextInt();
                    if (nilai < 1 || nilai > 5) {
                        System.out.println("Nilai harus antara 1 dan 5. Silakan coba lagi.");
                    }
                } while (nilai < 1 || nilai > 5);
                hasil[i][j] = nilai;
            }
        }

        System.out.println("\nRata-rata untuk setiap responden:");
        for (int i = 0; i < 10; i++) {
            int totalResponden = 0;
            for (int j = 0; j < 6; j++) {
                totalResponden += hasil[i][j];
            }
            double rata2Responden = (double) totalResponden / 6;
            System.out.println("Responden " + (i + 1) + ": " + rata2Responden);
        }

        System.out.println("\nRata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                totalPertanyaan += hasil[i][j];
            }
            double rata2Pertanyaan = (double) totalPertanyaan / 10;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata2Pertanyaan);
        }

        int totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += hasil[i][j];
            }
        }
        double rata2Keseluruhan = (double) totalKeseluruhan / (10 * 6);
        System.out.println("\nRata-rata keseluruhan: " + rata2Keseluruhan);

        sc.close();
    }
}
