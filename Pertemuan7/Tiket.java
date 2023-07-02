import java.util.Scanner;
public class Tiket {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tiketAnak, tanggal, tahun, tiketDewasa, totalHarga;
    int totalBulanan = 0, jumlahHargaAnak = 0, jumlahHargaDewasa = 0;

    System.out.println("Mesin Penjumlahan Hasil Bulanan");
    for(int i=0; i <= 31; i++ ){

        System.out.print("Masukan Tanggal : ");
        tanggal = sc.nextInt();
        System.out.print("Masukan Bulan : ");
        String bulan = sc.next();
        System.out.print("Masukan Tahun : ");
        tahun = sc.nextInt();

        if (tanggal % 7 == 0){ 
            continue;
        } else {

            // tiket anak
            System.out.println("========================================");
            System.out.println("Harga Tiket Anak Rp. 50.000");
            System.out.print("Masukan Jumlah Tiket Anak : ");
            tiketAnak = sc.nextInt();
            tiketAnak = tiketAnak * 50000;
            System.out.println("Total Harga Tiket Anak : Rp. "+tiketAnak);

            // tiket dewasa
            System.out.println("========================================");
            System.out.println("Harga Tiket Dewasa Rp. 100.000");
            System.out.print("Masukan Jumlah Tiket Dewasa : ");
            tiketDewasa = sc.nextInt();
            tiketDewasa = tiketDewasa * 100000;
            System.out.println("Total Harga Tiket Dewasa : Rp. "+tiketDewasa);

            // pendapatan harian
            System.out.println("========================================");
            totalHarga = tiketAnak + tiketDewasa;
            System.out.printf("Total Penjualan Tanggal %s %s %s sebanyak %s\n",tanggal,bulan, tahun, totalHarga);

            // total akhir
            System.out.println("========================================");
            totalBulanan += totalHarga;
            System.out.print("Lanjutkan Transaksi (Y/N) : ");
            String hitungTotal = sc.next();
            System.out.println("========================================");

            if (hitungTotal.equalsIgnoreCase("n")){
                System.out.println("Total Pendapatan Saat Ini : "+totalBulanan);
                System.out.println("========================================");
                break;
             } else if (hitungTotal.equalsIgnoreCase("y")){
                continue;
             }
        }
     }
    
    }
}
