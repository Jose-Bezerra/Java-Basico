package com.loiane.cursojava.aula43.imposto;

public class Test {
    public static void main(String[] args) {
        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Contribuinte 01");
        p1.setRendaBruta(1000);
        p1.setCpf("308.544.681-88");

        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNome("Contribuinte 02");
        p2.setRendaBruta(5000);
        p2.setCnpj("59.743.155/0001-60");

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Contribuinte 03");
        p3.setRendaBruta(2000);
        p3.setCpf("578.828.559-36");

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte 04");
        p4.setRendaBruta(3000);
        p4.setCnpj("08.632.955/0001-73");

        PessoaFisica p5 = new PessoaFisica();
        p5.setNome("Contribuinte 05");
        p5.setRendaBruta(3700);
        p5.setCpf("578.828.559-36");

        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNome("Contribuinte 06");
        p6.setRendaBruta(4000);
        p6.setCnpj("87.565.428/0001-60");

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;

        for (Contribuinte c : contribuintes) {
            System.out.println(c.toString());
            System.out.println();
        }
    }
}
