package Carta;

import java.util.ArrayList;

public class Cuenta {

    private String nombUsu;
    private double iva;
    private ArrayList<Menu> InventarioCarta;
    private double subtotal;
    private double total;

    public Cuenta(String nomusu, double iva2, ArrayList<Menu> invCart) {
        nombUsu = nomusu;
        establecerIva(iva2);
        establecerInventarioCarta(invCart);
        subtotal = 0;
    }

    public void establecerNombreCliente(String c) {
        nombUsu = c;
    }

    public void establecerIva(double c) {
        iva = c / 100;
    }

    public void establecerInventarioCarta(ArrayList<Menu> ls) {
        InventarioCarta = ls;
    }

    public void establecerSubtotal() {
        for (int i = 0; i < InventarioCarta.size(); i++) {
            subtotal += InventarioCarta.get(i).obtenerValorMenu();
        }
    }

    public void establecerTotal() {
        total = subtotal + (subtotal * iva);
    }

    public String obtenerNombreCliente() {
        return nombUsu;
    }

    public double obtenerIVA() {
        return iva * subtotal;
    }

    public ArrayList<Menu> obtenerListaCartas() {
        return InventarioCarta;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerTotal() {
        return total;
    }

    @Override
    public String toString() {
        String cadena = String.format("Informacion Cuenta\n"
                + "Nombre: %s\n"
                + "Lista de Menus adquiridos\n",
                obtenerNombreCliente());

        for (int i = 0; i < obtenerListaCartas().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    obtenerListaCartas().get(i));
        }

        cadena = String.format("%sSubtotal: %.2f\n"
                + "Iva: %.2f\n"
                +"Total a Pagar: %.2f\n",
                cadena,
                obtenerSubtotal(),
                obtenerIVA(),
                obtenerTotal());
        return cadena;
    }

}
