package taller11;

import java.util.ArrayList;

import Carta.Cuenta;
import Carta.Menu;
import Menus.MenuCarta;
import Menus.MenuDia;
import Menus.MenuEconomico;
import Menus.MenuNinos;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Menu> InventarioCarta = new ArrayList<>();

        MenuNinos Ninos1 = new MenuNinos("Hamburguesa Kits", 3.75, 2.00, 2.35);
        MenuNinos Ninos2 = new MenuNinos("PapasKits", 1.75, 0.50, 2.00);

        MenuEconomico Economico1 = new MenuEconomico("Combo económico de hamburguesa+paspas+hotdog+refresco", 4.75, 10);

        MenuDia DiaMenu = new MenuDia("Chuleta a la parrilla", 5.50, 5, 3.15);

        MenuCarta CartaMenu = new MenuCarta("Costillas BBQ", 7.50, 3, 4, 5);

        InventarioCarta.add(Ninos1);
        InventarioCarta.add(Ninos2);
        InventarioCarta.add(Economico1);
        InventarioCarta.add(DiaMenu);
        InventarioCarta.add(CartaMenu);

        for (int i = 0; i < InventarioCarta.size(); i++) {
            InventarioCarta.get(i).establecerValorMenu();
        }

        Cuenta cuenta = new Cuenta("Joseph Martinez", 7, InventarioCarta);
        cuenta.establecerSubtotal();
        cuenta.establecerTotal();

        System.out.println(cuenta);

    }

}
