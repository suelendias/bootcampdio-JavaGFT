package banco;

public class Main {

    public static void main(String[] args) {
        Cliente maria = new Cliente();
        maria.setNome("Maria");
        maria.setCidade("Recife");
        maria.setIdade(28);

        Conta cc = new contaCorrente(maria);
        Conta poupanca = new contaPoupanca(maria);

        cc.depositar(500);
        cc.transferir(180, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
