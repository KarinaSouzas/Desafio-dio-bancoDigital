public interface IConta {

    void depositar(double valorDeposito);

    void sacar(double valorSaque);

    void transferir(IConta contaDestino, double valorTransferir);

    void imprimirExtrato();
}