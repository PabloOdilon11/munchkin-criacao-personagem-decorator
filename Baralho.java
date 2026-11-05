import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Baralho {
    public List<Carta> sortearQuatro() {
        List<Carta> cartas = new ArrayList<>(Arrays.asList(
                new CartaRaca("ELFO"),
                new CartaRaca("ANÃO"),
                new CartaRaca("HALFLING"),
                new CartaRaca("ORC"),
                new CartaEspecial(CartaEspecial.Efeito.MESTICO),
                new CartaClasse("GUERREIRO"),
                new CartaClasse("MAGO"),
                new CartaClasse("CLÉRIGO"),
                new CartaClasse("LADRÃO"),
                new CartaEspecial(CartaEspecial.Efeito.SUPER_MUNCHKIN)
        ));
        Collections.shuffle(cartas);
        return Collections.unmodifiableList(new ArrayList<>(cartas.subList(0, 4)));
    }
}
