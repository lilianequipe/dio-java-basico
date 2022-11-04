

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        LinguagemFavorita linguagem1 = new LinguagemFavorita("Java","02/03/1870","InteliJ");
        LinguagemFavorita linguagem2 = new LinguagemFavorita("C++","11/05/1930","VSB");
        LinguagemFavorita linguagem3 = new LinguagemFavorita("C#","02/03/1985","Eclipse");


        Set <LinguagemFavorita>linguagens = new HashSet<>();

        linguagens.add(linguagem1);
        linguagens.add(linguagem2);
        linguagens.add(linguagem3);


        System.out.println(linguagens);

        System.out.println("\nA: Ordenamento por Ordem de Inserçao: ");
        Set<LinguagemFavorita> linguagens2 = new LinkedHashSet<LinguagemFavorita>();
        linguagens2.addAll(linguagens);

        System.out.println(linguagens2);

        System.out.println("\nB: Ordenamento por Ordem Natural ");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorNome());
        linguagens3.addAll(linguagens);
        System.out.println(linguagens3);

        System.out.println("\nC: Ordenamento por IDE: ");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorIDE());
        linguagens4.addAll(linguagens);
        System.out.println(linguagens4);

        System.out.println("\nD: Ordenamento por Ano de Criação e Nome: ");
        Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new ComparatorAnoCriacaoENome());
        linguagens5.addAll(linguagens);
        System.out.println(linguagens5);

        System.out.println("\nE: Ordenamento por Nome, Ano de Criação e IDE: ");
        Set<LinguagemFavorita> linguagens6 = new TreeSet<>(new ComparatorNomeAnoCriacaoIDE());
        linguagens6.addAll(linguagens);
        System.out.println(linguagens6);

        System.out.println("\nF: Linguagens: ");
        for (LinguagemFavorita l: linguagens) {
            System.out.println(l.getNome());
        }

    }

}