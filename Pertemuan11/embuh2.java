import java.util.Scanner;
public class embuh2 {

    static int nilai [][];
    static String nama [];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Jumlah Siswa : ");
        int x = sc.nextInt();
        System.out.print("Masukan Jumlah Minggu : ");
        int y = sc.nextInt();
        System.out.println("====================================");

        nama = new String [x];
        nama = inputNama(nama);

        nilai = new int [x][y];
        nilai = inputNilai(nilai);
        
        outprint(nilai);
        nbesar(nilai);
        

    }

    //Fungsi Input Nama 
    static String [] inputNama (String inName []){
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        for(int a = 0; a < inName.length;a++){
            System.out.printf("Masukan Nama Siswa ke %s : ",a+1);
            inName[a] = sc.nextLine();
        }
        return inName;
    }

    //Fungsi Return Input Nilai 
    static int [][] inputNilai  (int nilaiInput [][]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("====================================");
        for(int a = 0 ; a < nilaiInput.length; a++){
            for(int b = 0 ; b < nilaiInput[0].length;b++ ){
                System.out.printf("Masukan Nilai siswa %s minggu %s : ",nama[a],b+1);
                nilaiInput[a][b] = sc.nextInt();
            }
             System.out.println("*************************************");
        }
        return nilaiInput;
    }

    // Fungsi Output Semua Nilai 
    static void outprint (int allNilai[][]){

        System.out.println("====================================");
        for(int a = 0 ; a < allNilai.length; a++){
            for(int b = 0 ; b< allNilai[0].length;b++ ){
                System.out.printf("Nilai siswa %s minggu %s : %s \n",nama[a],b+1,nilai[a][b] );
            }
            System.out.println("*************************************");
        }
        
    }

    //Fungsi Return Nilai Terbesar
    static void  nbesar (int nMax [][]){
        int x = 0,y = 0,z = 0 ;
        
        for(int a = 0 ; a< nMax.length; a++){
            for(int b=0 ;b < nMax[0].length;b++){
                if (x <nMax[a][b]){
                    x = nMax[a][b];
                    y = b+1;
                    z = a;
                }
            }
        }
        System.out.printf("Nilai terbesar %s Pada Minggu ke %s Oleh Siswa %s",x,y,nama[z]);
    }

    

    

    
}