import java.util.Scanner;
public class Suhu{
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    float suhu, celcius, farhrenhait, kelvin, reaumur ,F;

    System.out.println("Masukan Suhu : ");
    suhu = sc.nextFloat();
    celcius = suhu;
    farhrenhait = (9/5 * celcius) + 32;
    reaumur = (5/4) * celcius ;
    kelvin = celcius + 273 ;

    System.out.println(String.format("Celcius : %.2f", celcius ));
    System.out.println(String.format("Reaumur : %.2f", reaumur ));
    System.out.println(String.format("Farhrenhait : %.2f", farhrenhait ));
    System.out.println(String.format("Kelvin : %.2f", kelvin ));
    

    }
}