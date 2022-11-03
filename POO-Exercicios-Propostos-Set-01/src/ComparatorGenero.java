import java.util.Comparator;
import java.util.Set;

public class ComparatorGenero implements Comparator<Serie> {



    @Override
    public int compare(Serie s1, Serie s2) {
        int genero;
        return  genero = s1.getGenero().compareTo(s2.getGenero());
    }
}
