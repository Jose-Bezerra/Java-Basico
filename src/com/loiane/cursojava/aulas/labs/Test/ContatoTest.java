import com.loiane.cursojava.aulas.labs.diversos.Contato;

public class ContatoTest {

    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.nome = "Paty";
        contato.endereco = "Rua Torres Galvão";
        contato.email = "patcasi@hotmail.com";
        contato.telefones = new String[5];
        contato.telefones[0] = "988427571";
        contato.telefones[1] = "988753739";
        contato.telefones[2] = "987054542";

        System.out.println(contato.nome);
        System.out.println(contato.telefones[0]);
    }

}
