import java.util.Scanner;

public class Ex_NomeIdade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        while (true) {
            System.out.println("Informe seu nome: \n");
            nome = scan.next();
                if(nome.equals ("0")) break;
            System.out.println("Agora sua idade");
            idade = scan.nextInt();

        }

    }
}