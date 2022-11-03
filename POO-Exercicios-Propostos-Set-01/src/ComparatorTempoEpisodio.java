import java.util.Comparator;

public class ComparatorTempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        int tempoEpisodio = s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio());
        if(tempoEpisodio != 0) return tempoEpisodio;

        tempoEpisodio = s1.getNome().compareTo(s2.getNome());
        return tempoEpisodio;
    }
}
