import java.util.Scanner;
public class ForKelipatan1B01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int kelipatan,total = 0,counter = 0;
        double rata;

        System.out.print("Masukan Bilangan Kelipatan (1-9) : ");
        kelipatan = sc.nextInt();
        
        for(int i = 1; i<= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;  
            }            
        }
        rata = (double) total/counter;
        System.out.printf("Banyak Bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan,counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata-rata bilangan %d dari 1 sampai 50 adalah %s\n", kelipatan, rata);

    }
}