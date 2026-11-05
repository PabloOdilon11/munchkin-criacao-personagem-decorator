public class RegraAcumulo {
    private int limiteRacas = 1;
    private int limiteClasses = 1;

    public void permitirRacaAdicional() {
        limiteRacas = 2;
    }

    public void permitirClasseAdicional() {
        limiteClasses = 2;
    }

    public int getLimiteRacas() {
        return limiteRacas;
    }

    public int getLimiteClasses() {
        return limiteClasses;
    }
}
