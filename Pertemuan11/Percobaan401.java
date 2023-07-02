import java.util.Scanner;
public class Percobaan401 {
    
static int kali (int c, int d){
    int h ;
    h = (c + 10) % ( d + 19);
    return h ;
}

static int kurang (int a, int b){
    int x ;
    a = a + 7 ;
    b = b + 4 ;
    x = kali(a, b);
    return x;
}

static int tambah (int x , int y){
int kali,kurang,hasilTambah ;
kali = x*y;
kurang = x*y;
hasilTambah = kali+kurang;

return hasilTambah;
}

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int nilai1, nilai2;
    System.out.print("Masukan Nilai 1 : ");
    nilai1 = sc.nextInt();
    System.out.print("Masukan Nilai 2 : ");
    nilai2 = sc.nextInt();

    int hasil = kurang(nilai1, nilai2);
    int hasil1 = tambah(nilai1, nilai1);
    System.out.println("Hasil Akhir Adalah "+hasil);
    System.out.println("Hasil Akhir Adalah "+hasil1);
}

}
