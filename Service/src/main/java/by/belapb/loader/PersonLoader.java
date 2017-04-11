package by.belapb.loader;

import by.belapb.util.HibernateUtil;

import java.util.Locale;

import static by.belapb.loader.MenuLoader.menu;


public class PersonLoader {
    public static HibernateUtil util = null;

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        util = HibernateUtil.getHibernateUtil();



        System.out.println("Start Menu");
        menu();
    }
}


