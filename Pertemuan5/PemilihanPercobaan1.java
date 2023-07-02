import java.util.Scanner;
public class PemilihanPercobaan1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int bil;

    System.out.println("Masukan Sebuah Bilangan");
    bil = input.nextInt();
    
    if(bil%2==0){
        String output=(bil%2==0)?"Bilangan Genap":"Bilangan Ganjil";
        System.out.println(output);
    }
    else {
        System.out.println("Bilangan Ganjil");
    }    

    }

}