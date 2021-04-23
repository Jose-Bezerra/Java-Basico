package com.loiane.cursojava.aula43.imposto;

public class PessoaJuridica  extends Contribuinte{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return super.getRendaBruta() * 0.1;
//        return this.getRendaBruta() / 100 * 10;
    }

    @Override
    public String toString() {
        String s = "Pessoa Jurídica \n";
        s += super.toString() + "\n";
        s += "CNPJ: " + cnpj + "\n";
        s += "Imposto a ser pago: " + calcularImposto();
        return s;
    }
}
