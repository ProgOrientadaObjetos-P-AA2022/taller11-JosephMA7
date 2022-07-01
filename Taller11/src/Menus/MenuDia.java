package Menus;

import Carta.Menu;

public class MenuDia extends Menu {

    private double bebida;
    private double postre;

    public MenuDia(String cade, double valIni, double valPos, double valBebi) {
        super(cade, valIni);
        postre = valPos;
        bebida = valBebi;
    }

    public void establecerPostre(double c) {
        postre = c;
    }

    public void establecerBebida(double c) {
        bebida = c;
    }

    @Override
    public void establecerValorMenu() {
        valMenu = valIni + postre + bebida;
    }

    public double obtenerPostre() {
        return postre;
    }

    public double obtenerBebida() {
        return bebida;
    }

    @Override
    public String toString() {
        String reporte = String.format("Menú Día\n"
                + "Nombre del Plato: %s\n"
                + "Valor del Menú: %.2f\n"
                + "Valor inicial del menú: %.2f\n"
                + "Valor postre: %.2f\n"
                + "Valor bebida: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorInicial(),
                obtenerPostre(),
                obtenerBebida(),
                obtenerValorMenu());

        return reporte;
    }
}
