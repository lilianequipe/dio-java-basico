public class LinguagemFavorita {
    String nome;
    String anoDeCriacao;
    String ide;

    public LinguagemFavorita(String nome, String anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public LinguagemFavorita() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(String anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return
                "\nnome='" + nome + '\'' +
                ", anoDeCriacao='" + anoDeCriacao + '\'' +
                ", ide='" + ide + '\'' +
                '}';
    }
}
