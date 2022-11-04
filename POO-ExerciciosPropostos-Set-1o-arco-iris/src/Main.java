
import java.util.*;



public class Main {
    public static void main(String[] args) {

        Set<String> arcoIris = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));

        System.out.println("A: Exibe todas as cores uma embaixo da outra");

        Iterator<String> iterator = arcoIris.iterator();

        while (iterator.hasNext()) {
            String cor = iterator.next();
            System.out.println(cor);
        }

        System.out.println("\nB: Quantidade que o arco-íris tem: "+arcoIris.size());

        System.out.println("\nC: Cores do arco-íris em ordem alfabética: ");
        Set<String > arcoIris2 = new TreeSet<>(arcoIris);
        System.out.println(arcoIris2);

        System.out.println("\nD: Ordem inversa: ");
        List<String> arcoIris3 = new ArrayList<>(arcoIris);
        Collections.reverse(arcoIris3);
        System.out.println(arcoIris3);

        System.out.println("\nE: Todas as cores que começam com 'v': ");
        Iterator<String> iterator1 = arcoIris.iterator();

        while (iterator1.hasNext()){
            String next = iterator1.next();
            char caractere = next.charAt(0);
            if(caractere == 'v') System.out.println(next);
        }

        System.out.println("\nF: Removendo Todas as cores que não começam com 'v': ");
        Set<String> arcoIris4 = new HashSet<>(arcoIris);
        Iterator<String> iterator2 = arcoIris.iterator();

        while (iterator2.hasNext()){
            String next2 = iterator2.next();
            char caractere2 = next2.charAt(0);
            if(caractere2 != 'v')arcoIris4.remove(next2);
        }
        System.out.println(arcoIris4);

        System.out.println("\nG: Limpando o conjunto... ");
        arcoIris4.removeAll(arcoIris4);
        System.out.println("H: Conjunto Vazio ? "+arcoIris4.isEmpty());
        System.out.println(arcoIris4);

    }

}