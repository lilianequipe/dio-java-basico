import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        int []numero = new int[5];
        int maiorNumero=0;
        double mediaNumero =0;

        for (i=0; i<5; i++){
            System.out.println("Digite um número: ");
            numero[i] = scan.nextInt();
        }
        maiorNumero = numero[0];

        for (i=0; i<5; i++){
            if(numero[i]>maiorNumero) {
                maiorNumero = numero[i];
            }
        }
        for (i=0; i<5; i++){
            mediaNumero += numero[i];
            }
        mediaNumero = mediaNumero/5;

        System.out.println("O maior numero é: "+maiorNumero);
        System.out.println("A media dos numeros é: "+mediaNumero);



    }
}
