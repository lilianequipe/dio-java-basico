import java.util.Objects;

public class EstadoNE {
    private String nomeEstado;
    private String populacao;

    public EstadoNE(String nome, String populacao) {
        this.nomeEstado = nome;
        this.populacao = populacao;
    }

    public EstadoNE() {
    }

    public String getNome() {
        return nomeEstado;
    }

    public void setNome(String nome) {
        this.nomeEstado = nome;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoNE estado = (EstadoNE) o;
        return Objects.equals(nomeEstado, estado.nomeEstado) && Objects.equals(populacao, estado.populacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeEstado, populacao);
    }

    @Override
    public String toString() {
        return
                "nome='" + nomeEstado + '\'' +
                ", populacao=" + populacao +
                '}';
    }
}
