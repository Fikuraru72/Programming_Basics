import java.util.Scanner;


 
public class tugas1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int tglLah, blnLah, tahLah ;
    int tglSek = 26 ;
    int blnSek = 9;
    int tahSek = 2022;
    long usiaSek1;
    long usiaSek2;
    long usiaSek3;

    System.out.println(String.format("Tanggal Sekarang : %s-%s-%s\n", tglSek, blnSek, tahSek));

    System.out.print("Masukan Tanggal Lahir : ");
    tglLah = sc.nextInt();

    System.out.print("Masukan Bulan Lahir : ");
    blnLah = sc.nextInt();

    System.out.print("Masukan Tahun Lahir : ");
    tahLah = sc.nextInt();

    System.out.println(String.format("\nTanggal Lahir Anda Adallah %s-%s-%s", tglLah, blnLah, tahLah));

    usiaSek1 = tglSek - tglLah;
    usiaSek2 = blnSek - blnLah;
    usiaSek3 = tahSek - tahLah;

    System.out.println(String.format("\nJadi Usia Anda Sekarang Adalah %s tahun %s bulan %s hari",usiaSek3,usiaSek2,usiaSek3));


    }

}