// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.
        System.out.println(FizzBuzz(num));

    }
    public static String FizzBuzz(int num){
        if(num%3 == 0 && num%5 == 0){
            return "FizzBuzz";
        }
        if(num%3 == 0){
            return "Fizz";
        }
        if(num%5 == 0){
            return "Buzz";
        }
        if(!(num%3 == 0 || num%5 == 0)){
           System.out.println(num);
        }
    return "";
    }

}
