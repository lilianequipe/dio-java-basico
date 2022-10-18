import java.io.IOException;
import java.util.Scanner;


public class Consoantes {
    public static void main(String[] args) throws IOException {
       Scanner scan = new Scanner(System.in);

        char[] consoantes = new char[6];
        char verifica;
        int qtdConsoantes=0;

            for(int i=0;i<6;i++) {
                System.out.println("Digite uma letra: ");
                verifica = scan.nextLine().charAt(0);

                switch (verifica){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    break;
                    default:
                        consoantes[qtdConsoantes] = verifica;
                        qtdConsoantes++;


                }
            }
        System.out.println("Consoantes: ");
            for(int i=0;i<qtdConsoantes;i++) System.out.println(consoantes[i]);

            System.out.println("Consoantes lidas: "+qtdConsoantes);

    }


    }

