import java.util.ArrayList;
import java.util.List;

public class ClasseDecorador extends PersonagemDecorador {
    private final String classe;

    public ClasseDecorador(Personagem personagem, String classe) {
        super(personagem);
        this.classe = classe;
    }

    @Override
    public List<String> getClasses() {
        List<String> classes = new ArrayList<>(personagem.getClasses());
        classes.add(classe);
        return copiaImutavel(classes);
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
}
