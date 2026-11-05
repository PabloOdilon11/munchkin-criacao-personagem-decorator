import java.util.List;

public class ResultadoProcessamento {
    private final List<Carta> recebidas;
    private final List<Carta> aplicadas;
    private final List<Carta> descartadas;
    private final Personagem personagemFinal;

    public ResultadoProcessamento(List<Carta> recebidas, List<Carta> aplicadas,
                                  List<Carta> descartadas, Personagem personagemFinal) {
        this.recebidas = recebidas;
        this.aplicadas = aplicadas;
        this.descartadas = descartadas;
        this.personagemFinal = personagemFinal;
    }

    public List<Carta> recebidas() { return recebidas; }
    public List<Carta> aplicadas() { return aplicadas; }
    public List<Carta> descartadas() { return descartadas; }
    public Personagem personagemFinal() { return personagemFinal; }
}
