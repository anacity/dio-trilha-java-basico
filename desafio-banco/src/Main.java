import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente ana = new Cliente();
        Cliente pedro = new Cliente();
        Cliente marcia = new Cliente();

        ana.setNome("Ana");
        pedro.setNome("Pedro");
        marcia.setNome("Marcia");

        Conta cc = new ContaCorrente(ana);
        cc.depositar(100);

        Conta cc2 = new ContaCorrente(marcia);
        cc2.depositar(200);
        cc2.sacar(50);

        Conta poupanca = new ContaPoupanca(ana);

        Conta poupanca2 = new ContaPoupanca(pedro);
        poupanca2.depositar(500);
        poupanca2.transferir(150, cc2);

        cc.transferir(100, poupanca);

        //cc.imprimirExtrato();
        //cc2.imprimirExtrato();
        //poupanca.imprimirExtrato();
        poupanca2.imprimirExtrato();

    }
}
