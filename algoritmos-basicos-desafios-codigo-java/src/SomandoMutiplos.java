// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class SomandoMutiplos {
    public static void main(String[] args) {
        int A, N;
        int somaMultiplo=0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".

        for(int i=0; i<=N; i++){
            if(i%A == 0) {
                somaMultiplo += i;
            }
        }
        System.out.println(somaMultiplo);

    }
}