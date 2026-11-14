package Banco;

public class ContaSalario extends ContaBancaria {
    private String empresa;

    public ContaSalario(double saldo, String empresa) {
        super(saldo);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return this.empresa;
    }
    
}
