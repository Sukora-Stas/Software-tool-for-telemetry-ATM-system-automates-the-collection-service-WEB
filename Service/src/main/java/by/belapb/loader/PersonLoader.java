package by.belapb.loader;

import by.belapb.dao.RoleDao;
import by.belapb.dao.UserDao;
import by.belapb.pojos.Role;
import by.belapb.pojos.User;
import by.belapb.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.mapping.Collection;

import java.sql.Timestamp;
import java.util.*;


import static by.belapb.loader.MenuLoader.menu;


public class PersonLoader {


    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        User user = null;
        Role role = null;

        Timestamp date = new Timestamp(Calendar.getInstance().getTimeInMillis());


//        рабочий вариант добавления роли
//        role = RoleDao.createRole(role, "user", null);
//        RoleDao.getInstance().save(role);

//        role = RoleDao.createRole(role, "admin", null);
//        RoleDao.getInstance().save(role);


        role = RoleDao.getInstance().get(1);

        user = UserDao.createUser(user,
                "test1",
                "test1",
                "Sukora",
                "Alena",
                "Tarasova", date, role);
        UserDao.getInstance().save(user);

//        role = RoleDao.getInstance().get(2);
//        user = UserDao.createUser(user,
//                "test",
//                "test",
//                "Sukora",
//                "Stanislav",
//                "Igorevich", date, role);
//        UserDao.getInstance().save(user);

        List ua = UserDao.getInstance().getAll();;
//TODO: realization sort
        for (int i = 0; i < ua.size(); i++) {
            System.out.println(ua.get(i) + "\n");


        }


//
//        role = RoleDao.getInstance().get(1);
//        user = UserDao.createUser(user,
//                "test1",
//                "test1",
//                "Sukora",
//                "Alena",
//                "Tarasova", date, role);
//        UserDao.getInstance().save(user);


        System.out.println("Start Menu");
        menu();
    }
}


