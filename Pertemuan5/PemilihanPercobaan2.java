import java.util.Scanner;
public class PemilihanPercobaan2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nilai1, nilai2,rataRata;

    System.out.println("Masukan Sebuah Bilangan 1 : ");
    nilai1=sc.nextInt();

    System.out.println("Masukan Sebuah Bilangan 2 : ");
    nilai2=sc.nextInt();

    rataRata=(nilai1+nilai2)/2;
    System.out.println("Rata-rata Nilai Adalah "+rataRata);
    
    if(rataRata>=100)
        rataRata-=5;
    
    System.out.println("Hasil Nilai Akhir Adalah "+rataRata);

    }
}
