package Carta;

public abstract class Menu {

    protected String nombPlato;
    protected double valMenu;
    protected double valIni;

    public Menu(String nomplato, double valin) {
        nombPlato = nomplato;
        valIni = valin;
    }

    public void establecerNombrePlato(String c) {
        nombPlato = c;
    }

    public void establecerValorInicial(double c) {
        valIni = c;
    }

    public abstract void establecerValorMenu();

    public String obtenerNombrePlato() {
        return nombPlato;
    }

    public double obtenerValorInicial() {
        return valIni;
    }

    public double obtenerValorMenu() {
        return valMenu;
    }

}
