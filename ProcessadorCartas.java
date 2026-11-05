import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ProcessadorCartas {
    public ResultadoProcessamento processar(List<Carta> cartas) {
        if (cartas.size() != 4) {
            throw new IllegalArgumentException("Devem ser processadas exatamente 4 cartas.");
        }

        RegraAcumulo regra = new RegraAcumulo();
        cartas.forEach(carta -> carta.habilitarRegra(regra));

        Personagem personagem = new PersonagemBase();
        List<Carta> aplicadas = new ArrayList<>();
        List<Carta> descartadas = new ArrayList<>();

        for (Carta carta : cartas) {
            if (carta.ehEspecial()) {
                continue;
            }

            boolean podeAplicar = carta instanceof CartaRaca
                    ? personagem.getRacas().size() < regra.getLimiteRacas()
                    : personagem.getClasses().size() < regra.getLimiteClasses();

            if (podeAplicar) {
                personagem = carta.aplicar(personagem);
                aplicadas.add(carta);
            } else {
                descartadas.add(carta);
            }
        }

        return new ResultadoProcessamento(
                Collections.unmodifiableList(new ArrayList<>(cartas)),
                Collections.unmodifiableList(aplicadas),
                Collections.unmodifiableList(descartadas), personagem);
    }
}
