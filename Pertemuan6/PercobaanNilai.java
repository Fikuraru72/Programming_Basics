import java.util.Scanner;

public class PercobaanNilai {
    public static void main(String[] args) {
        
        int nilai;
        String grade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Inputkan Nilai : ");
        nilai = sc.nextInt();

        //Kondisi 1
        if (nilai >=0 || nilai <=100) {

            //kondisi 2
            if (nilai >=90 || nilai <=100) {
                System.out.println("Nilai A, EXCELLENT");
            } else if (nilai >=80 || nilai <=89){
                System.out.println("Nilai B, PERTAHANKAN PRESTASI ANDA");
            } else if (nilai >=60 || nilai <=79){
                System.out.println("Nilai C, TINGKATKAN PRESTASI ANDA");
            } else if (nilai >=50 || nilai <=59){
                System.out.println("Nilai D, TINGKATKAN BELAJAR ANDA");
            } else {
                System.out.println("Nilai E, ANDA TIDAK LULUS");
            }

        } else if (nilai <0) {
            System.out.println("Nilai yang Anda masukkan kurang dari 0");
        } else {
            System.out.println("Nilai yang Anda masukkan lebih dari 100");
        }
    }
    
}