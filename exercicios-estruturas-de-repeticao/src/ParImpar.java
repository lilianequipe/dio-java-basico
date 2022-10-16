import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int par=0;
        int impar=0;
        int numeroRecebido;
        Scanner scan = new Scanner(System.in);
        int qntNumeros, count=0;

        System.out.println("Digite a quantidade de Números a serem coletados : ");
        qntNumeros = scan.nextInt();

        do {
            System.out.println("Digite um número inteiro: ");
            numeroRecebido = scan.nextInt();
            if(numeroRecebido % 2 == 0){
                par++;
            }else impar++;
            count++;
        }while(count < qntNumeros);
        System.out.println("Numeros Pares: "+par);
        System.out.println("Numeros Impares: "+impar);
    }
}
