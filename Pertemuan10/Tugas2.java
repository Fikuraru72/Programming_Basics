import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int toko [][] = new int [3][4];
        int harga [] = {40000, 28000, 60000, 75000};
        String cabang [] = {"Dieng", "Soehat", "Sengkaling"};
        String buku [] = {"Novel", "Komik", "Pelajaran", "Enskolopedia"};
        int banBuku [] = new int [3]; 
        int pemToko [] = new int [4];
        int max = 0;
        String simpenan [] = new String [2];
        
        System.out.println();
        System.out.println("Laporan Penjualan Toko Buku Togamas");
     
        System.out.println("=====================================");

        
        for(int i = 0 ; i < toko.length;i++ ){
            for(int j = 0; j< toko[0].length;j++){
                System.out.printf("Toko cabang %4s, Buku %s berjumlah   \t%5s  ",cabang[i],buku[j], ": ");
                toko[i][j] = sc.nextInt();   
            }
            System.out.println("=====================================");
        }


        System.out.println();
        System.out.println("Banyak Buku Yang Terjual Disetiap Cabang");
        System.out.println();
        System.out.println("----------------------------------------------------------");
        for(int i =0;i<cabang.length;i++){
            for(int j =0; j<toko[0].length;j++){
                pemToko [i] += toko[i][j] * harga[j]; 
                banBuku[i] += toko[i][j];  
                if (max<pemToko[i]) {
                    max = pemToko[i];
                    simpenan[1] = cabang[i];
                    simpenan[0] = Integer.toString(banBuku[i]);
                }
            }
            System.out.printf("Buku terjual di cabang %s sebanyak %s unit\n",cabang[i],banBuku[i]);
            System.out.printf("Pemasukan Toko cabang %s sebanyak Rp.%s \n",cabang[i], pemToko[i]);
            System.out.println("----------------------------------------------------------");
            
        }
        System.out.println();
        System.out.printf("Pemasukan Terbesar dari cabang %s sebesar Rp.%s dari %s unit buku \n",simpenan[1],max,simpenan[0]);
        System.out.println("=====================================================");

    }
}
