import java.util.Scanner;
public class Triangel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nilai N = ");
        int n = sc.nextInt();
        int i = 0;
        while ( i <= n) {
            int j = 0;
            while (j < i ) {
                System.out.print("*");
                j++;
            }
            i++;
        }
    }
}
