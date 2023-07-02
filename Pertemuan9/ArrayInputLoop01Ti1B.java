
import java.util.Scanner;
public class ArrayInputLoop01Ti1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiUAS01 [] = new int [6];    

        for(int i = 0; i < nilaiUAS01.length; i++){
            System.out.printf("Masukkan Nilai UAS ke - %s = ",i);
            nilaiUAS01[i]=sc.nextInt();
        }

        for(int i = 0; i< nilaiUAS01.length; i++){
            if (nilaiUAS01[i] > 70) {
                System.out.println("Mahasiswa ke-"+i+" Lulus");
            }  else if (nilaiUAS01[i] <= 70 ) {
                System.out.println("Mahasiswa ke-"+i+" Tidak Lulus");
            }
        }
    }
}
