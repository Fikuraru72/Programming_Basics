import java.util.Scanner;
public class Tugas1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String namaBulan [] = {"januari","februari","maret", "april", "mei", "Juni", "Juli", "Agustus", "September", "oktober", "November", "Desember"};

        
        System.out.print("Masukan Bulan (1-12) : ");
        int a = sc.nextInt()-1; 

        System.out.print("Bulan : "+namaBulan[a]);
    }
}