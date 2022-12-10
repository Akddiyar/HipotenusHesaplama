import java.util.Scanner;
public class DikUcgendeHipotenusBulma {
    public static void main(String[] args) {
        double a,b,c,A,B,C;

        Scanner input = new Scanner(System.in);
        System.out.print("a kenarının uzunluğunu giriniz: ");
        a = input.nextDouble();

        System.out.print("b kenarının uzunluğunu giriniz: ");
        b = input.nextDouble();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs: " + c);


        // @author Diyar Akdemir


    }
}