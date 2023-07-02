import java.util.Scanner;
public class Arraydua2TIB01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan baris : ");
        int a = sc.nextInt();
        System.out.print("Masukan Kolom : ");
        int b = sc.nextInt();
        System.out.println("---------------------------");
        String pengunjung [][] = new String [a] [b];

        for(int baris = 0 ; baris < pengunjung.length ; baris ++){
            for(int kolom = 0 ; kolom < pengunjung[0].length ; kolom ++){
                System.out.printf("Masukan Pengunjung ke [%s][%s] ", baris, kolom);
                pengunjung[baris][kolom]=sc.next();  
            }
            System.out.println("----------------------");
        }

        for(String array [] : pengunjung  ){
            for(String arr : array)
            {
                System.out.printf("%s  \t", arr );
            }
            System.out.println("");
        }
    }
}
