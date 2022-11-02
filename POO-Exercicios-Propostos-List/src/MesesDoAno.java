public class MesesDoAno {
    String nome;
    float temperatura;

    public MesesDoAno(String nome, float temperatura) {
        this.nome = nome;
        this.temperatura = temperatura;
    }

    public MesesDoAno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "MesesDoAno{" +
                "nome='" + nome + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }



}

