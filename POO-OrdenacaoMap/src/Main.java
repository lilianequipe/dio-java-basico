import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        
        System.out.println("Ordem aleatória: ");
        Map<String,Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen",new Livro("Uma breve história do Tempo", 256));
            put("Duhigg Charles",new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah",new Livro("21 Lições para o Século 21", 432));
        }};


        for(Map.Entry<String,Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey()+"-"+livro.getValue().getNome()+ "-"+livro.getValue().getPaginas());

        }

        System.out.println("\nOrdem por Número de Páginas: ");
        Set<Map.Entry<String,Livro>> meusLivros2 = new TreeSet<>(new ComparatorNumeroPaginas());
        meusLivros2.addAll(meusLivros.entrySet());

        for(Map.Entry<String,Livro> livro : meusLivros2) {
            System.out.println(livro.getKey()+ "-"+livro.getValue().getPaginas());

        }
    }
}