import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fatorial;
        int resultado;


        System.out.println("Informe o fatorial que deseja consultar: ");
        fatorial = scan.nextInt();
        resultado = fatorial;

        System.out.println("var fatorial: "+ fatorial);
            for (int i=fatorial; i > 1; i--) {
                    resultado = resultado * (i-1);
            }
        System.out.println(fatorial+"! = " + resultado);
    }
}
