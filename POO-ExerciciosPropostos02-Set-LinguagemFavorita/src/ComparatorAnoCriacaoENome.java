import java.util.Comparator;

public class ComparatorAnoCriacaoENome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int compare = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());

        if(compare!=0) return compare;
        return l1.getNome().compareTo(l2.getNome());
    }
}
