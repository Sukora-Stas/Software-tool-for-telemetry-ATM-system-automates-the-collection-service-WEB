package by.belapb.loader;

import by.academy.it.pojos.ATM;
import by.academy.it.pojos.INF;
import by.academy.it.pojos.Person;
import by.academy.it.pojos.User;
import by.academy.it.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Locale;

import static by.academy.it.loader.MenuLoader.menu;

public class PersonLoader {
    public static HibernateUtil util = null;
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        util = HibernateUtil.getHibernateUtil();
        Person person = new Person(null, 35, "Yuli", "Slabko");
        User user = new User(19,"Stas","Sukora","Igorevich");

        ATM atm = new ATM();
        INF inf =new INF();

        Session session = util.getSession();
        session.saveOrUpdate(person);
        session.saveOrUpdate(user);

        System.out.println("Start Menu");
        menu();
    }
}


