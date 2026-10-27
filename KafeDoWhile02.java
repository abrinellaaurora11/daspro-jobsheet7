import java.util.Scanner;
public class KafeDoWhile02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = scanner.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.println("Jumlah kopi:");
            int kopi = scanner.nextInt();
            System.out.println("Jumlah teh:");
            int teh = scanner.nextInt();
            System.out.println("Jumlah roti:");
            int roti = scanner.nextInt();

            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            scanner.nextLine(); 

        } while (true);
        System.out.println("Semua transaksi selesai.");
        scanner.close();
    }
}
