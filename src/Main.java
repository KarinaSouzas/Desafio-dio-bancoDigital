public class Main {

    public static void main(String[] args) {
        Cliente Afrodite = new Cliente();
        Afrodite.setNome("Afrodite");

        Conta contaCorente = new ContaCorrente(Afrodite);
        Conta contaPoupanca = new ContaPoupanca(Afrodite);

        contaCorente.depositar(100);
        contaCorente.transferir(contaPoupanca, 10);

        contaCorente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

    }
}