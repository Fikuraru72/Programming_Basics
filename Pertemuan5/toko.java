import java.util.Scanner;
public class toko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int barangA,barangB,barangC,hargaA,hargaB,hargaC,totalA,totalB,totalC,potongan,totalHarga,totalBayar;

        //barang a
        System.out.print("Jumlah Barang A : ");
        barangA = sc.nextInt();
        System.out.print("Harga Barang A : Rp. ");
        hargaA = sc.nextInt();
        totalA = hargaA * barangA;
        //barang 
        System.out.print("Jumlah Barang B : ");
        barangB = sc.nextInt();
        System.out.print("Harga barang B : Rp. ");
        hargaB = sc.nextInt();
        totalB = hargaB * barangB;
        //barang c
        System.out.print("Jumlah Barang C : "); 
        barangC = sc.nextInt();
        System.out.print("Harga barang C : Rp. ");
        hargaC = sc.nextInt();
        totalC = hargaC * barangC;
        //total harga
        totalHarga = totalA + totalB + totalC;
        //pemilihan
        if (totalHarga > 1000000){
            potongan = totalHarga * 10/100;
        } 
        else if (totalHarga > 500000) {
            potongan = totalHarga * 5/100;
        }
        else if (totalHarga > 200000) {
            potongan = totalHarga *2/100;
         }
        else {
            potongan = 0;
        } 
        //nota
        System.out.println("--------------------------------------------------------------");
        System.out.println("                        Struk Nota                              ");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%15s%15s%15s%15s\n", "|Nama barang|", "|Jumlah|", "|Harga|", "|Total|");
        System.out.printf("%12s%16s%16s%16s\n", "Barang A", barangA, hargaA, totalA);
        System.out.printf("%12s%16s%16s%16s\n", "Barang B", barangB, hargaB, totalB);
        System.out.printf("%12s%16s%16s%16s\n", "Barang C", barangC, hargaC, totalC);
        System.out.println("--------------------------------------------------------------");
        System.out.println("                Total Harga Belanjaan : "+totalHarga);
        System.out.println("                Diskon : -"+potongan);
        totalBayar = totalHarga - potongan;
        System.out.print("                Total Bayar Belanjaan : Rp. " +totalBayar);
    }    
}
