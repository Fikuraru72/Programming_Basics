import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai : ");
        int n = sc.nextInt();
        if (n>=3) {
            for(int i= 1; i <= n; i++){
                if (i==1||i==n) {
                    for(int j=1;j <=n; j++){
                        System.out.printf("%s ",n);
                    }
                } else {
                    for(int k = 1; k <= n;k++ ){
                        if (n<10) {
                            if (k==1||k==n) {
                                System.out.printf("%s ",n);
                            } else {
                                System.out.print("  ");
                            }
                        } else  {
                            if (k==1||k==n) {
                                System.out.printf("%s ",n);
                            } else {
                                System.out.print("   ");
                            } 
                        }
                        
                    }
                }
                System.out.println();
            }
            
        } else {
            System.out.println("Angka Terlalu kecil");
        }
    }
}
