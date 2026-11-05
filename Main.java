import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Carta> recebidas = new Baralho().sortearQuatro();
        ResultadoProcessamento resultado = new ProcessadorCartas().processar(recebidas);

        System.out.println("Cartas recebidas: " + nomes(resultado.recebidas()));
        System.out.println("Cartas aplicadas: " + nomes(resultado.aplicadas()));
        System.out.println("Cartas descartadas: "
                + (resultado.descartadas().isEmpty() ? "Nenhuma" : nomes(resultado.descartadas())));
        System.out.println("Personagem final: " + resultado.personagemFinal().descrever());
    }

    private static String nomes(List<Carta> cartas) {
        return cartas.stream().map(Carta::nome).collect(Collectors.joining(", "));
    }
}
