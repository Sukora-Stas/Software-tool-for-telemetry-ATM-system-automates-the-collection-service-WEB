package by.belapb.loader;

import by.belapb.dao.RoleDao;
import by.belapb.dao.UserDao;
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

        User user = null;
        Role role = null;

        Timestamp date = new Timestamp(Calendar.getInstance().getTimeInMillis());


//        рабочий вариант добавления роли

//        role = RoleDao.createRole(role, "admin", null);
//        RoleDao.getInstance().save(role);


        role = RoleDao.getInstance().get(2);
        user = UserDao.createUser(user,
                "test",
                "test",
                "Sukora",
                "Stanislav",
                "Igorevich", date, role);
        UserDao.getInstance().save(user);


//        User user = new User("user",
//                "user",
//                "user",
//                "user",
//                "user", date, role);


//        Session session = util.getSession();
//
//
//        session.saveOrUpdate(role);
//        session.saveOrUpdate(user);

        System.out.println("Start Menu");
        menu();
    }
}


