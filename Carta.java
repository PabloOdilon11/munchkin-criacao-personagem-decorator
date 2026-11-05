public interface Carta {
    String nome();

    default void habilitarRegra(RegraAcumulo regra) {
        // Cartas comuns não alteram os limites.
    }

    default boolean ehEspecial() {
        return false;
    }

    default Personagem aplicar(Personagem personagem) {
        return personagem;
    }
}
