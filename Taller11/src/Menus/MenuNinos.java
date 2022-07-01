package Menus;

import Carta.Menu;

public class MenuNinos extends Menu {

    private double helado;
    private double pastel;

    public MenuNinos(String cade, double valIni, double helad, double pastl) {
        super(cade, valIni);
        helado = helad;
        pastel = pastl;
    }

    public void establecerHelado(double c) {
        helado = c;
    }

    public void establecerPastel(double c) {
        pastel = c;
    }

    @Override
    public void establecerValorMenu() {
        valMenu = valIni + helado + pastel;
    }

    public double obtenerHelado() {
        return helado;
    }

    public double obtenerPastel() {
        return pastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menú Niños\n"
                + "Nombre del Plato: %s\n"
                + "Valor del Menú: %.2f\n"
                + "Valor Inicial del menú: %.2f\n"
                + "Valor porcion  helado: %.2f\n"
                + "Valor porcion Pastel: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorInicial(),
                obtenerHelado(),
                obtenerPastel(),
                obtenerValorMenu());

        return cadena;
    }

}
