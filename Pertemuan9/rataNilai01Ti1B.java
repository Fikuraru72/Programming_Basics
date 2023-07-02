import java.util.Scanner;
public class rataNilai01Ti1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int x = sc.nextInt();
        int nilaiMHS01 [] = new int [x];
        double total1 = 0,total2 =0, rata1, rata2 ;
        int jum1 = 0, jum2=0;

        for(int i =0;i < nilaiMHS01.length;i++){
            System.out.printf("MAsukan Nilai Mahasiswa ke-%d : ",i+1);
            nilaiMHS01 [i] =sc.nextInt();
        }
        
        for(int i =0;i < nilaiMHS01.length;i++){
            if (nilaiMHS01[i]>70) {
                total1 += nilaiMHS01[i];
                int g = 1;
                jum1 += g;
            } else if (nilaiMHS01[i]<=70) {
                total2 += nilaiMHS01[i];
                int h = 1;
                jum2 += h;
            }
            
        }
        
        rata1 = total1/jum1;
        rata2= total2/jum2;
        System.out.println("Nilai Rata-rata kelas = "+rata1); 
        System.out.println("Nilai Rata-rata kelas = "+rata2); 
    }
}
