import java.util.List;
import java.util.Collections;

public class PersonagemBase implements Personagem {
    @Override
    public List<String> getRacas() {
        return Collections.emptyList();
    }

    @Override
    public List<String> getClasses() {
        return Collections.emptyList();
    }

    @Override
    public String descrever() {
        return "HUMANO, SEM CLASSE";
    }
}
