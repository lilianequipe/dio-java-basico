import javax.swing.text.StyledEditorKit;
import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> estadosNE = new HashMap<>() {{
            put("PE","9.616.621");
            put("AL","3.351.543");
            put("CE","9.187.103");
            put("RN","3.534.265");
        }};

        System.out.println(estadosNE);


        System.out.println("\nSubstitua a população do estado RN por 3.534.165");
        estadosNE.put("RN","3.534.165");
        System.out.println(estadosNE);

        System.out.println("\nConfira se o estado PB está no dicionário, caso não, adicione : PB - 4.039.277");
        boolean contemPB = estadosNE.containsKey("PB");
        System.out.println("Contém PB: "+contemPB);

        if(contemPB == false) estadosNE.put("PB","4.039.277");
        System.out.println(estadosNE);

        System.out.println("\nExiba a população PE ");
        System.out.println(" População PE: "+estadosNE.get("PE"));

        System.out.println("\nExiba todos os estados e suas populações  na ordem que foi informado: ");
        Map<String, String >estadosNE2 = new LinkedHashMap<>();
        estadosNE2.put("PE","9.616.621");
        estadosNE2.put("AL","3.351.543");
        estadosNE2.put("CE","9.187.103");
        estadosNE2.put("RN","3.534.265");
        estadosNE2.put("PB","4.039.277");

        System.out.println(estadosNE2);

        System.out.println("\nExiba os estados e suas populações  em ordem alfabética: ");
        Map<String,String> estadosNE3 = new TreeMap<>();
        estadosNE3.putAll(estadosNE2);
        System.out.println(estadosNE3);

        System.out.println("\nExiba o estado com a menor população e a sua quantidade: ");
        String menorPopulacao = Collections.min(estadosNE3.values());
        String esMenorPopulacao = "";

        for (Map.Entry<String,String>entry: estadosNE3.entrySet()) {
            if(entry.getValue().equals(menorPopulacao)) {
                menorPopulacao = entry.getKey();
                esMenorPopulacao =  entry.getValue();
            }
        }
        System.out.println("Estado:"+menorPopulacao+"-"+esMenorPopulacao);

        System.out.println("\nExiba o estado com a maior população e a sua quantidade: ");
        String maiorPopulacao = Collections.max(estadosNE3.values());
        String esMaiorPopulacao = " ";

        for (Map.Entry<String,String> entry: estadosNE3.entrySet()){
            if(entry.getValue().equals(maiorPopulacao)){
                maiorPopulacao = entry.getKey();
                esMaiorPopulacao = entry.getValue();
            }
        }
        System.out.println("ES: "+maiorPopulacao+"-"+esMaiorPopulacao);

        System.out.println("\nExiba a soma da população dos estados : ");
        int somaPopulacao = 0;
        String populacao = "";

        for(Map.Entry<String,String>entry: estadosNE3.entrySet()){
            populacao = entry.getValue();
            populacao = populacao.replace(".","");
            somaPopulacao = somaPopulacao + Integer.parseInt(populacao);

        }
        NumberFormat inteiro = NumberFormat.getInstance();
        System.out.println("Soma População: "+inteiro.format(somaPopulacao));

        System.out.println("\nExiba a média da população dos estados : ");
        int quantidadeES=0;
        for (Map.Entry<String,String> entry: estadosNE3.entrySet()) quantidadeES++;

        System.out.println("Media População: "+inteiro.format(somaPopulacao/quantidadeES));

        System.out.println("\nRemova os estados com a população menor que 4M : ");
        Map<String,String> estadosNE4 = new HashMap<>();
        estadosNE4.putAll(estadosNE3);
        Iterator<Map.Entry<String, String>> iterator = estadosNE4.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            int populacaoInt = 0;
            populacao = entry.getValue();
            populacao = populacao.replace(".",""); //retira os pontos
            populacaoInt = Integer.parseInt(populacao); //converte String em int

            if(populacaoInt < 4000000) iterator.remove();

        }
        System.out.println(estadosNE4);

        System.out.println("\nApagando dicionario de Estados: ");
        estadosNE4.clear();

        System.out.println("\nDicionário de Estados está vazio?: "+ estadosNE4.isEmpty());



    }

}