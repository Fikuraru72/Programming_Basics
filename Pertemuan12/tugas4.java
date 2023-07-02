import java.util.Scanner;
public class tugas4 {

    int Produktif [] = new int  [12];
    int BelProduktif [] = new int [12];

    public static void main(String[] args) {
        
    int bulan = 12;
    System.out.println("Total Pasangan pada bulan ke " +bulan + " adalah " + produktif(bulan));
    }

    static int produktif (int a) {
        if(a<=1){
            return a;
        } else {
            return (produktif(a-1) + produktif(a-2)); 
        }
    }
}
