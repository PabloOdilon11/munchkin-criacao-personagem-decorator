public class CartaEspecial implements Carta {
    public enum Efeito { MESTICO, SUPER_MUNCHKIN }

    private final Efeito efeito;

    public CartaEspecial(Efeito efeito) {
        this.efeito = efeito;
    }

    @Override
    public String nome() {
        return efeito.name();
    }

    @Override
    public void habilitarRegra(RegraAcumulo regra) {
        if (efeito == Efeito.MESTICO) {
            regra.permitirRacaAdicional();
        } else {
            regra.permitirClasseAdicional();
        }
    }

    @Override
    public boolean ehEspecial() {
        return true;
    }
}
