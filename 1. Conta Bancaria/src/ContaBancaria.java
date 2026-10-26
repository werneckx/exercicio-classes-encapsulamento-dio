public class ContaBancaria {
    private final String nome;
    private double saldoConta;
    private double saldoChequeEspecial;
    private double limiteChequeEspecial;
    private final double taxaChequeEspecial = 0.2;

    // CONTRUTORES

    public ContaBancaria(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldoConta = saldoInicial;

        if (saldoInicial <= 500.0) {
            this.limiteChequeEspecial = 50.0;
        } else {
            this.limiteChequeEspecial = saldoInicial * 0.5;
        }
        ;

        this.saldoChequeEspecial = limiteChequeEspecial;
    };

    // GETTERS

    public double consultarSaldo() {
        return saldoConta;
    };

    public double consultarLimiteChequeEspecial() {
        return limiteChequeEspecial;
    };

    public double consultarSaldoChequeEspecial() {
        return saldoChequeEspecial;
    };

    public Boolean estaUsandoChequeEspecial() {
        return saldoChequeEspecial < limiteChequeEspecial ? true : false;
    };

    // SETTERS

    private void debitar(double valor) {
        double limiteConta = this.saldoConta + this.saldoChequeEspecial;

        if (this.saldoConta >= valor) {
            this.saldoConta -= valor;
            System.out.println("Saldo: " + this.saldoConta);
        } else if (limiteConta >= valor) {
            double diferenca = valor - this.saldoConta;
            this.saldoConta = 0;
            this.saldoChequeEspecial -= diferenca;
            System.out.println("Saldo: " + this.saldoConta);
            System.out.println("Saldo Cheque Especial: " + this.saldoChequeEspecial);
        } else {
            System.out.println("Saldo Insuficiente.");
        }

    }

    private void creditar(double valor) {

        if (estaUsandoChequeEspecial()) {
            double diferenca = consultarLimiteChequeEspecial() - consultarSaldoChequeEspecial();
            double taxaCobrar = diferenca * taxaChequeEspecial;
            valor -= taxaCobrar;

            if (valor > diferenca) {
                this.saldoChequeEspecial += diferenca;
                this.saldoConta = valor - diferenca;
            } else {
                this.saldoChequeEspecial += valor;
            }

        } else {
            this.saldoConta += valor;
        }

        System.out.println("Saldo: " + this.saldoConta);
        System.out.println("Saldo Cheque Especial: " + this.saldoChequeEspecial);

    }

    public void depositarDinheiro(double valorDeposito) {
        creditar(valorDeposito);
    }

    public void sacarDinheiro(double saque) {
        debitar(saque);
    }

    public void pagarBoleto(double valorBoleto) {
        debitar(valorBoleto);
    }

}
