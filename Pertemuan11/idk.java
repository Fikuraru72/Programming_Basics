import java.util.Scanner;
public class idk {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan Nilai Sisi Kubus : ");
    int x = sc.nextInt();
    System.out.println("===========================");
    out("Hasil Nilai Volume Kubus : ", hitungVolume(x));
    out("Hasil Nilai Luas Permukaan Kubus : ", hitungLuasPermukaan(x));
   }
   //Return Volume 
   static int hitungVolume (int b){
    b = b*b*b;
    return b ;
   }
   // Return Luas permukaan 
   static  int hitungLuasPermukaan (int a){
    a = 6*a*a;
    return a;
   }
   //Return Output 
   static void out (String stringInput, int x){
       System.out.println(stringInput+x);
   }


}
