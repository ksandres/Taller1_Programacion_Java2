import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("ingrese los valores qu desea dividir y calcular su modulo o residuo");
        int a = x.nextInt();
        int b = x.nextInt();

        int div = a / b;
        int mod = a % b;
        if (mod == 0) {
        System.out.println("el residuo es "+ mod + " es exacta la division" + div);
        }else {
            System.out.println("el residuo "+mod+" no es exacta la division " + div);
        }
    }

    }
