import java.util.Arrays;

public class Dado {
    private int lado;

    public Dado(int lado) {
        this.lado = lado;
    }

    public Dado() {
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "lado=" + lado +
                '}';
    }
}
