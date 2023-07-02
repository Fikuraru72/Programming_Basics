import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai : ");
        int n =sc.nextInt();

        for(int i=1; i<=n; i++){
            for (int j = 1, k = n; j <= n; j++, k++) {
                System.out.print(i % 2 != 0 ? j : k);
            }
            System.out.println();
        }

    }
}
