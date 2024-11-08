import java.util.Scanner;

public class BioskopWithScanner23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();
                        int baris, kolom;

                        while (true) {
                            System.out.print("Masukkan baris (1-4): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine(); 

                            if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                                System.out.println("Nomor baris/kolom tidak tersedia. Silakan coba lagi.");
                                continue;
                            }
                            if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                            } else {
                                penonton[baris - 1][kolom - 1] = nama;
                                break;
                            }
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        String next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }
}
