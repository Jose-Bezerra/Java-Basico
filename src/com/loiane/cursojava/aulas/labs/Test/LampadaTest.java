import com.loiane.cursojava.aulas.labs.diversos.Lampada;

public class LampadaTest {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.setModelo("A60");
        lampada.setTensao("Bivolt");
        lampada.setGarantiaMeses(36);
        lampada.setPotencia(7);
        lampada.setCor("Amarela");
        lampada.setTipoLuz("Amarela");
        lampada.setTipoAbajur(true);

        lampada.setTipos(new String[5]);



        lampada.ligar();
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();
        lampada.mudarEstado();;
        lampada.mostrarEstado();


    }
}
