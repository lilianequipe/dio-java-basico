import java.util.*;

public class OsNumerosSaoIguais {
/*
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;

        System.out.println("::OS NÚMEROS SÃO IGUAIS? ::" );

        System.out.println("Digite o 1o número:");
        numero1 = leitor.nextInt();
        System.out.println("Digite o 2o número:");
        numero2 = leitor.nextInt();

        if(numero1 == numero2){
            System.out.println("Sao iguais!");
        }else System.out.println("Não sao iguais!");



    }*/
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero1;
        int numero2;

        numero1 = leitor.nextInt();
        numero2 = leitor.nextInt();

        if(numero1 == numero2){
            System.out.println("Sao iguais!");
        }else System.out.println("Nao sao iguais!");



    }
}