import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public abstract class PersonagemDecorador implements Personagem {
    protected final Personagem personagem;

    protected PersonagemDecorador(Personagem personagem) {
        this.personagem = personagem;
    }

    @Override
    public List<String> getRacas() {
        return personagem.getRacas();
    }

    @Override
    public List<String> getClasses() {
        return personagem.getClasses();
    }

    @Override
    public String descrever() {
        List<String> caracteristicas = new ArrayList<>(getRacas());
        caracteristicas.addAll(getClasses());
        if (caracteristicas.isEmpty()) {
            return "HUMANO, SEM CLASSE";
        }
        return String.join(", ", caracteristicas);
    }

    protected List<String> copiaImutavel(List<String> valores) {
        return Collections.unmodifiableList(valores);
    }
}
