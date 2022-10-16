import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Informe uma nota de 0 a 10:");
        nota = scan.nextInt();

        while (true) {

            if ((nota < 0) || (nota > 10)){
                    System.out.println("Valor inválido. ");
                    System.out.println("Informe uma nota de 0 a 10:");
                    nota = scan.nextInt();
            }else {
                System.out.println("Nota informada: "+nota);
                break;
            }

        }

    }
}
