import java.util.Scanner;
public class WhileGaji1B01 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int karyawan, jam, gaji, jumlah = 0;
    String jabatan;

    System.out.print("Masukan Jumlah Karyawan : ");
    karyawan = sc.nextInt();

    int i = 0;
    while (i < karyawan) {
        System.out.println("Pilih Jabatan - Direktur, Manager, Staf");
        System.out.print("Masukan Jabatan KAryawan ke-" + (i+1) + " : ");
        jabatan = sc.next();
        System.out.print("MAsukan Jumlah Jam Lembur : ");
        jam = sc.nextInt();
        i++;
        if (jabatan.equalsIgnoreCase("direktur")) {
            continue;
        } else if (jabatan.equalsIgnoreCase("manager")){
            gaji = jam * 100000;
        } else {
            gaji = jam * 75000;
        }
        jumlah += gaji;
        
    }

    System.out.println("Pengeluaran Perusahaan = " +jumlah);
    }
}
