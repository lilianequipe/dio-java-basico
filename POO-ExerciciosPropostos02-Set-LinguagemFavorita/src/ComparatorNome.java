import java.util.Comparator;

public class ComparatorNome implements Comparator<LinguagemFavorita> {

    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome;
        return nome = l1.getNome().compareTo(l2.getNome());
    }

}
