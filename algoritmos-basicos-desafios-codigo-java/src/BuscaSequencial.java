// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int X;
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

        X = leitor.nextInt();

        System.out.println(buscaSequencial(X,elementos));
    }

    public static String buscaSequencial(int numero, int[] array){
        for(int i=0;i<array.length;i++){
            if(numero == array[i]){
                return "Achei "+numero+" na posicao "+i;
            }
        }
        return "Numero "+numero+" nao encontrado!";
    }
}