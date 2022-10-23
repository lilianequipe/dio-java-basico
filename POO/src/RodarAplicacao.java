public class RodarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Funcionario gerente1 = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro1 = new Faxineiro();

        Vendedor vendedor1 = (Vendedor) new Funcionario();

    }
}
