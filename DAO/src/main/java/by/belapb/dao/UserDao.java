package by.belapb.dao;

import by.belapb.dao.exceptions.DaoException;
import by.belapb.pojos.Role;
import by.belapb.pojos.User;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sukora Stas.
 */
public class UserDao extends BaseDao<User> {
    private static Logger log = Logger.getLogger(UserDao.class);

    private volatile static UserDao instance;

    public static UserDao getInstance() {
        if (instance == null) {
            synchronized (UserDao.class) {
                if (instance == null) {
                    instance = new UserDao();
                }
            }
        }
        return instance;
    }



    @Override
    public void save(User user) throws DaoException {
        super.save(user);
    }

    @Override
    public User get(Serializable id) throws DaoException {
        return super.get(id);
    }

    public static User createUser(User user,
                                  String login,
                                  String password,
                                  String surName,
                                  String firstName,
                                  String middleName,
                                  Timestamp data,
                                  Role role) throws Exception {
        if (user == null) {
            user = new User();
        }

        user.setLogin(login);

        user.setPassword(password);

        user.setSurName(surName);

        user.setFirstName(firstName);

        user.setMiddleName(middleName);

        user.setData(data);

        user.setRole(role);

        return user;
    }

}
