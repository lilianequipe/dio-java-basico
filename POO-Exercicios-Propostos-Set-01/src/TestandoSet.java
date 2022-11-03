import java.util.*;

public class TestandoSet {
    public static void main(String[] args) {

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia",60) );
            add(new Serie("dark", "drama",60) );
            add(new Serie("that '70s show", "comedia",25) );

        }};
        System.out.println(minhasSeries);

        System.out.println("\nOrdem Genero\n");
        Set<Serie> minhaSeries2 = new TreeSet<>(new ComparatorGenero());
        minhaSeries2.addAll(minhasSeries);
        System.out.println(minhaSeries2);

        System.out.println("\nOrdem TempoEpisodio\n");
        Set<Serie> minhaSeries3 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhaSeries3.addAll(minhasSeries);
        System.out.println(minhaSeries3);



        }
}