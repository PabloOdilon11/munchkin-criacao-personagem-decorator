public class CartaClasse implements Carta {
    private final String classe;

    public CartaClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String nome() {
        return classe;
    }

    @Override
    public Personagem aplicar(Personagem personagem) {
        return new ClasseDecorador(personagem, classe);
    }
}
