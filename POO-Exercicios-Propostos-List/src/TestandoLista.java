import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestandoLista {
    public static void main(String[] args) {
        Random gerador = new Random();
        int tamanhoLista = 0;
        float somaMedia=0f;

        List<MesesDoAno> meses = new ArrayList<MesesDoAno>();

        meses.add(0, new MesesDoAno("1-Janeiro", 0));
        meses.add(1, new MesesDoAno("2-Fevereiro", 0));
        meses.add(2, new MesesDoAno("3-Março", 0));
        meses.add(3, new MesesDoAno("4-Abril", 0));
        meses.add(4, new MesesDoAno("5-Maio", 0));
        meses.add(5, new MesesDoAno("6-Junho", 0));

        //Recebe as temperaturas de forma aleatoria e armazena;
        System.out.println(" ");
        System.out.println("RECEBENDO AS TEMPERATURAS DOS MESES DE FORMA ALEATORIA E ARMAZENANDO... " );
        System.out.println(" ");

        for (MesesDoAno i : meses) {
            i.setTemperatura(gerador.nextFloat(40));
            System.out.println(i);
        }

        //SomaMediatemparatura
        for (MesesDoAno i : meses) {
            somaMedia = somaMedia + i.getTemperatura();
        }
        tamanhoLista = meses.size();
        somaMedia = somaMedia/tamanhoLista;

        //Meses acima da media
        System.out.println(" ");
        System.out.println("Media: "+somaMedia);
        System.out.println(" ");
        System.out.println("MESES ACIMA DA MEDIA: " );

        for (MesesDoAno i : meses) {
            if(i.temperatura>somaMedia){
                System.out.println(i.nome);
            };
        }
    }
}