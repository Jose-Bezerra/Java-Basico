import com.loiane.cursojava.aulas.labs.diversos.LivroBiblioteca;

import java.util.Date;

public class LivroBibliotecaTest {
    public static void main(String[] args) {
        LivroBiblioteca livro = new LivroBiblioteca();
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestimoUsuario = "José";


        System.out.println("Nome do livro = " + livro.nome);
        System.out.println("Nome do livro = " + livro.dataEntrega);
    }
}
