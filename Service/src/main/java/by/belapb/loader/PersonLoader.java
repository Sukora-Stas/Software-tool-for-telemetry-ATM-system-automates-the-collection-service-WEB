package by.belapb.loader;

import by.belapb.dao.RoleDao;
import by.belapb.pojos.Role;
import by.belapb.pojos.User;
import by.belapb.util.HibernateUtil;
import org.hibernate.Session;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Locale;


import static by.belapb.loader.MenuLoader.menu;


public class PersonLoader {


    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Timestamp date = new Timestamp(Calendar.getInstance().getTimeInMillis());


        Role role = null;

        role = RoleDao.createRole(role, "admin", null);

        RoleDao.getInstance().save(role);

        System.out.println(role);
































//        User user = new User("test",
//                "test",
//                "Sukora",
//                "Stanislav",
//                "Igorevich", date, role);

//        Role role = new Role("user", null);
//        User user = new User("user",
//                "user",
//                "user",
//                "user",
//                "user", date, role);

        System.out.println(role);

//        System.out.println(user);


//        Session session = util.getSession();
//
//
//        session.saveOrUpdate(role);
//        session.saveOrUpdate(user);

        System.out.println("Start Menu");
        menu();
    }
}


