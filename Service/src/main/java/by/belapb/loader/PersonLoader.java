package by.belapb.loader;

import by.belapb.dao.RoleDao;
import by.belapb.dao.UserDao;
import by.belapb.pojos.Role;
import by.belapb.pojos.User;

import java.sql.Timestamp;
import java.util.*;


import static by.belapb.loader.MenuLoader.menu;


public class PersonLoader {


    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        User user = null;
//        Role role = null;

        Timestamp date = new Timestamp(Calendar.getInstance().getTimeInMillis());


//        рабочий вариант добавления роли
//        role = RoleDao.createRole(role, "user", null);
//        RoleDao.getInstance().save(role);

//        role = RoleDao.createRole(role, "admin", null);
//        RoleDao.getInstance().save(role);


//        role = RoleDao.getInstance().get(1);
//
//        user = UserDao.createUser(user,
//                "test1",
//                "test1",
//                "Sukora",
//                "Alena",
//                "Tarasova", date, role);
//        UserDao.getInstance().save(user);

//        role = RoleDao.getInstance().get(2);
//        user = UserDao.createUser(user,
//                "test",
//                "test",
//                "Sukora",
//                "Stanislav",
//                "Igorevich", date, role);
//        UserDao.getInstance().save(user);


//        sort
        Comparator<User> comparator = (u1, u2) -> u1.getId() - u2.getId();

        List<User> ua = UserDao.getInstance().getAll();
        List<Role> rolee = RoleDao.getInstance().getAll();
        ua.sort(comparator);
        System.out.println(rolee);

//        getAll
//        for (int i = 0; i < ua.size(); i++) {
//            System.out.println(ua.get(i) + "\n");
//        }

//TODO: end this facking code
        for(Role role : rolee){
            System.out.println(role.getId_User());
        }

        for (User user1 : ua) {
            System.out.println(user1.getLogin() );
//            + role.getId_User()
        }


        System.out.println("Start Menu");
        menu();
    }
}


