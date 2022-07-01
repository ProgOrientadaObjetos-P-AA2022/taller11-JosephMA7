package Menus;

import Carta.Menu;

public class MenuCarta extends Menu {

    private double valGuarni;
    private double valBebi;
    private double porcServi; 

    public MenuCarta(String cade, double valIni,
            double valGuar, double valBb, double porcSer) {
        super(cade, valIni);
        establecerValorGuarnicion(valGuar);
        establecerValorBebida(valBb);
        establecerPorcentajeServicio(porcSer);
    }

    public void establecerValorGuarnicion(double c) {
        valGuarni = c;
    }

    public void establecerValorBebida(double c) {
        valBebi = c;
    }

    public void establecerPorcentajeServicio(double c) {
        porcServi = valIni * (c / 100);
    }

    @Override
    public void establecerValorMenu() {
        valMenu = valIni + valGuarni + valBebi
                + porcServi;
    }

    public double obtenerValorGuarnicion() {
        return valGuarni;
    }

    public double obtenerValorBebida() {
        return valBebi;
    }

    public double obtenerPorcentajeServicio() {
        return porcServi;
    }

    @Override
    public String toString() {
        String cadena = String.format("Carta del Menu\n"
                + "Nombre del Plato: %s\n"
                + "Valor del Menú: %.2f\n"
                + "Valor inicial del Menú: %.2f\n"
                + "Valor Guarnición: %.2f\n"
                + "Valor Bebida: %.2f\n"
                + "Porcentaje por servicio: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorInicial(),
                obtenerValorGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeServicio(),
                obtenerValorMenu());

        return cadena;
    }
}
