import java.util.Scanner;
public class latihanfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai [][] = new int [2][3];

        for(int a = 1; a <= nilai.length ;a++){
            for(int b = 1; b <= nilai[0].length;b++){
                System.out.printf("Masukan Nilai baris %s kolom %s : ", a,b);
                nilai[a-1][b-1] = sc.nextInt();
            }
        }

        for(int a = 0 ; a < nilai.length; a ++){
            for(int b = 0 ; b < nilai[0].length;b++){
                System.out.print(nilai[a][b]+ " ");
            }
            System.out.println();
        }
    }
}
