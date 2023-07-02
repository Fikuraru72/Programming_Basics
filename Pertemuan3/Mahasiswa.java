public class Mahasiswa {
    public static void main(String[] args) {
        
    String kampus = "Polinema";
    byte tingkat = 1;
    char kelas = 'B' ;
    boolean statusSkill = true;
    int bilanganBulat = 10 ;
    float bilanganPecahan = 3.33333f;
    char karakter ='c';

    System.out.println(String.format("Saya mahasiswa %s kelas %s%s", kampus, tingkat,  kelas ));
    System.out.println(String.format("Sebelum masuk polinema saya (%s) sudah menguasai progamming", statusSkill));
    System.out.println("Saya sedang belajar menampilakan nilai :");
    System.out.println("Bilangan bulat " + bilanganBulat);
    System.out.println("Bilangan pecahan  " + bilanganPecahan);
    System.out.println("karakter " + karakter);
    }
}