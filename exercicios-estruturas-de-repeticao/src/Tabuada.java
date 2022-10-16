import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTabuada;
        int count;
        int resultado;

        System.out.println("Informe qual o úmero da Tabuada que você deseja ver: ");
        numTabuada = scan.nextInt();

        for(count=0; count<=10; count++){
            resultado = numTabuada*count;
            System.out.println(numTabuada + "x" + count + "=" + resultado);

        }
    }
}
