public class CartaRaca implements Carta {
    private final String raca;

    public CartaRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String nome() {
        return raca;
    }

    @Override
    public Personagem aplicar(Personagem personagem) {
        return new RacaDecorador(personagem, raca);
    }
}
