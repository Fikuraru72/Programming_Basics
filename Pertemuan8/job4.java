import java.util.Scanner;
public class job4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        int n = sc.nextInt();
        if (n>=5){
            for(int i = 1 ; i<=n ; i++){
                if (i % 2 == 0 ) {
                    for(int j = n; j > 0; j--  ){
                        System.out.print(j);
                    }
                } else {
                    for(int k = 1; k <= n; k++){
                        System.out.print(k);
                    }
                    
                }
                System.out.println("");
            }
        } else {
            System.out.println("Angka yang anda masukan terlalu kecil");
        }
        
    }
}
