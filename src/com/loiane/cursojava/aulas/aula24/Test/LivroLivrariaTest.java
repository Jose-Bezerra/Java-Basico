import com.loiane.cursojava.aulas.aula24.labs.Livro;
import com.loiane.cursojava.aulas.aula24.labs.LivroLivraria;

public class LivroLivrariaTest {
    public static void main(String[] args) {
        LivroLivraria livro = new LivroLivraria();
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        livro.preco = 63.39;

        System.out.println("Nome do livro = " + livro.nome);
        System.out.println("Nome do livro = " + livro.preco);
    }
}
