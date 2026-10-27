import java.util.Scanner;
public class tugasBioskop02 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket ( untuk selesai): ");
            jumlahTiket = scanner.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            double totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = totalHarga * 0.15;
            } else if (jumlahTiket > 4) {
                diskon = totalHarga * 0.10;
            }

            double totalBayar = totalHarga - diskon;

            System.out.println("Total harga: Rp " + totalHarga);
            System.out.println("Diskon: Rp " + diskon);
            System.out.println("Total bayar: Rp " + totalBayar);

            totalTiket = jumlahTiket;
            totalPenjualan = totalBayar;
        }

        System.out.println("Hasil penjualan tiket bioskop:");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

        scanner.close();
    }
}
 
