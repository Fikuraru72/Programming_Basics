import java.util.Scanner;
public class Toko {
    public static void main(String[] args) {
    int biru, merah, diskonBiru, diskonMerah, totalHarga;

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Bulan Departemen Store");

    //Baju biru
    System.out.println("Baju Biru : ");
    biru = sc.nextInt();
    diskonBiru = biru * 50/100;
    diskonBiru = biru - diskonBiru;
    System.out.println("Diskon Baju Biru : " + diskonBiru);

    //Baju merah
    System.out.println("Baju Merah : ");
    merah = sc.nextInt();
    diskonMerah = merah * 30/100;
    diskonMerah = merah - diskonMerah;
    System.out.println("Diskon Baju Merah : " + diskonMerah);

    //Total harga 
    totalHarga = diskonBiru + diskonMerah;
    System.out.println("Total harga : " + totalHarga);

    
    }
}