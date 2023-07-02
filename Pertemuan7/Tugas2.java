public class Tugas2 {
    public static void main(String[] args) {
        int anak = 5, dewasa = 5, hargaAnak = 50000, hargaDewasa = 100000;
        int totalAnak, totalDewasa, totalHarian, totalBulan = 0;
        
        
        System.out.println("Mesin Penghitung Hasil Bulanan");
        System.out.println("====================================================");
        
        for(int i=1;i <= 31;i++){
            
            if (i%7 == 0) 
                continue;

            System.out.println("Sekarang Tanggal " +i);

            totalAnak = hargaAnak*anak;
            System.out.println("Harga Tiket Anak : Rp. " +hargaAnak);
            System.out.println("Jumlah Anak : Rp. "+anak);
            System.out.println("Total Penjualan Tiket Anak : Rp. "+totalAnak);

            totalDewasa = hargaDewasa*dewasa;
            System.out.println("Harga Tiket Dewasa : Rp. " +hargaDewasa);
            System.out.println("Jumlah Dewasa : Rp. "+dewasa);
            System.out.println("Total Penjualan Tiket Dewasa : Rp. "+totalDewasa);

            totalHarian = totalAnak+totalDewasa;
            System.out.println("====================================================");
            System.out.println("Total Penjualan Tiket Hari Ini : Rp. "+totalHarian);
            
            totalBulan += totalHarian;     
            System.out.println("====================================================");
        }  
        System.out.println("Total Bulan ini : Rp. "+totalBulan);
    }
}
