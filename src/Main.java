import java.util.ArrayList;
import java.util.List;

import Model.*;
import Model.Classes.MenuMakan;

public class Main {

    public static void main(String[] args) {
        List<MenuMakan> listMakan = new ArrayList();
        MenuMakan menu1 = new MenuMakan("Nasi Goreng");
        MenuMakan menu2 = new MenuMakan("Mie Goreng");

        listMakan.add(menu1);
        listMakan.add(menu2);

    }
}
