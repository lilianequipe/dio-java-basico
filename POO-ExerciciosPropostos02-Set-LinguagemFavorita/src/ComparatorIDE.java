import java.util.Comparator;

public class ComparatorIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ide;
        return l1.getIde().compareTo(l2.getIde());
    }
}
