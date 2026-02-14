package Java;

public class ContaBancaria {
    private int numeroConta;
    private float saldo = 0;
    private String titular;
    private boolean contaCorrente = false;


        public ContaBancaria(String titular, int numeroConta){
            this.titular = titular;
            this.numeroConta = numeroConta;
            this.saldo = 0;
        }

        int getNumeroConta(){
            return numeroConta;
        }

        float getSaldo(){
            return saldo;
        }

        String getTitular(){
            return titular;
        }

        boolean getContaCorrente(){
            return contaCorrente;
        }

        boolean sacar(int valor){
            if((contaCorrente == true) && (valor <= saldo)){
                saldo -= valor;
                System.out.println(valor + " sacado com sucesso!");
                return true;
            }
            else if (contaCorrente == true){
                System.out.println("Sua conta não é corrente!");
                return false;
            }
            else{
                System.out.println("Saldo insuficiente!");
                return false;
            }
        }

        void depositar(int valor){
            if(valor > 0 && contaCorrente == true){
                saldo += valor;
                System.out.println(valor + " depositado com sucesso!");
            }
            else if (valor < 0){
                System.out.println("Digite um valor positivo!");
            }
            else{
                System.out.println("Para operação desse tipo transforme sua conta em corrente!");
            }
        }

        void alterarConta(){
            if (contaCorrente == true) {
                contaCorrente = false;
                System.out.println("Conta: " + numeroConta + " alterada para Poupança");
            }
            else{
                contaCorrente = true;
                System.out.println("Conta: " + numeroConta + " alterada para Corrente");
            }
        }

        void transferencia(ContaBancaria conta, int valor){
            if(sacar(valor)){
                conta.depositar(valor);
                System.out.println("Transferencia realizada com sucesso!");
            }
            else{
                System.out.println("Erro na transferência!");
            }
        }
}
