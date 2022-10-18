import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        int[] vetor = new int[20];
        int count =0;
        int verifica;
        Scanner scan = new Scanner(System.in);

        while(count<20){
            System.out.println("Digite um número aleatório entre 8 e 100: (Restam: "+( 20 - count));
            verifica = scan.nextInt();
            if(verifica<8 || verifica > 100){
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
