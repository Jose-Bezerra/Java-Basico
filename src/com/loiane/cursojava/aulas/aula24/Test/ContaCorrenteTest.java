import com.loiane.cursojava.aulas.aula24.labs.ContaCorrente;

public class ContaCorrenteTest {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.numero = "1095668";
        contaCorrente.agencia = "0321";
        contaCorrente.especial = true;
        contaCorrente.limiteEspecial = 500;
        contaCorrente.saldo = 10000;

        System.out.println("Saldo da conta " + contaCorrente.numero + " / ag " + contaCorrente.agencia
            +  " é: " + contaCorrente.saldo);
    }
}
