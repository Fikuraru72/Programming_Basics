import java.util.Scanner;
public class PemilihanPercobaan4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukan angka pertama : ");
        angka1 = sc.nextDouble();
        System.out.print("Masukan angka kedua : ");
        angka2 = sc.nextDouble();
        System.out.print("Masukan operator (+ - * /) : ");
        operator = sc.next().charAt(0);

        switch(operator){
            case '+':
            hasil = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 + " = " + hasil);
            break;
            case '-':
            hasil = angka1 - angka2;
            System.out.println(angka1 + " - " + angka2 + " = " + hasil);
            break;
            case '*':
            hasil = angka1 * angka2;
            System.out.println(angka1 + " * " + angka2 + " = " + hasil);
            break;
            case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil);
            break;

            default:
            System.out.println("Operator yang anda masukan salhan");
        }
        
    }
}