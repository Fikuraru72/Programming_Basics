import java.util.Scanner;
public class nilaiMahasiswa {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int uas,uts,kuis,tugas,nilaiAkhir;

    System.out.print("Nilai UAS Mahasiswa :   ");
    uas = sc.nextInt();
    uas = uas * 40/100;
    
    System.out.print("Nilai UTS Mahasiswa :   ");
    uts = sc.nextInt();
    uts = uts * 30/100;

    System.out.print("Nilai Kuis Mahasiswa :   ");
    kuis = sc.nextInt();
    kuis = kuis * 10/100;

    System.out.print("Nilai Tugas Mahasiswa :   ");
    tugas = sc.nextInt();
    tugas = tugas * 20/100;

    nilaiAkhir = uas+uts+kuis+tugas;
    System.out.println("Nilai Akhir Mahasiswa Adalah " +nilaiAkhir);

    if (nilaiAkhir <65)
        System.out.println("Harap Melakukan Remidi");
    
    else
        System.out.println("Selamat Anda Lulus");
    
    }
}
