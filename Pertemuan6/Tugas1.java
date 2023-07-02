import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String kodeKeberangkatan;
        int biaya,biayaReg,biayaBayar;
        int admin = 50000;

        System.out.print("Masukan Kode Keberangkatan [pg/sg/mg/reg] : ");
        kodeKeberangkatan = sc.nextLine();

        if (kodeKeberangkatan.equalsIgnoreCase("pg")) {
            
            System.out.println("Kode Keberangkatan : " +kodeKeberangkatan);
            System.out.println("Kelas Kereta : Eksekutif");
            biaya = 1250000;
            System.out.println("Biaya Tiket : RP."+biaya);
            biaya = biaya + admin;
            System.out.println("Total Bayar : RP."+biaya);
            

        } else if (kodeKeberangkatan.equalsIgnoreCase("sg")) {
            
            System.out.println("Kode Keberangkatan : " +kodeKeberangkatan);
            System.out.println("Kelas Kereta : Bisnis");
            biaya = 1375000;
            System.out.println("Biaya Tiket : RP."+biaya);
            biaya = biaya + admin;
            System.out.println("Total Bayar : RP."+biaya);
            

        } else if (kodeKeberangkatan.equalsIgnoreCase("mg")) {
            
            System.out.println("Kode Keberangkatan : " +kodeKeberangkatan);
            System.out.println("Kelas Kereta : Luxury");
            biaya = 2500000;
            System.out.println("Biaya Tiket : RP."+biaya);
            biaya = biaya + admin;
            System.out.println("Total Bayar : RP."+biaya);
            

        } else if (kodeKeberangkatan.equalsIgnoreCase("reg")) {
            
            System.out.println("Kode Keberangkatan : " +kodeKeberangkatan);
            System.out.println("Kelas Kereta : Eksekutif");
            biaya = 50000;
            System.out.println("Biaya Tiket : RP."+biaya);
            
            

        } else {
            System.out.println("Kode keberangkatan yang anda masukan tiddak sesuai");


        }
    }
}
