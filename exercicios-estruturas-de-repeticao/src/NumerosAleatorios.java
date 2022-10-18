import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        int[] vetor = new int[20];
        int count =0;
        int verifica;
        Scanner scan = new Scanner(System.in);

        while(count < vetor.length){
            System.out.println("Digite um número aleatório entre 0 e 100: (Restam: "+( vetor.length - count));
            verifica = scan.nextInt();
            if(verifica < 0 || verifica > 100){
                System.out.println("Número inválido. ");

            }else{
                vetor[count] = verifica;
                count++;
            }
        }
        for (int i: vetor) {
            System.out.println("Numero:");
            System.out.println(i);
            System.out.println("Sucessor:");
            System.out.println(i+1);

        }

    }
}
