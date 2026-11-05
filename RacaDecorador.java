import java.util.ArrayList;
import java.util.List;

public class RacaDecorador extends PersonagemDecorador {
    private final String raca;

    public RacaDecorador(Personagem personagem, String raca) {
        super(personagem);
        this.raca = raca;
    }

    @Override
    public List<String> getRacas() {
        List<String> racas = new ArrayList<>(personagem.getRacas());
        racas.add(raca);
        return copiaImutavel(racas);
    }

    @Override
    public String descrever() {
        List<String> caracteristicas = new ArrayList<>(getRacas());
        caracteristicas.addAll(getClasses());
        return String.join(", ", caracteristicas);
    }
}
