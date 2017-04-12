package by.belapb.dao;

import by.belapb.dao.exceptions.DaoException;
import by.belapb.pojos.Role;
import by.belapb.pojos.User;
import by.belapb.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Set;

/**
 * Created by Sukora Stas.
 */
public class RoleDao extends BaseDao<Role> {
    private static Logger log = Logger.getLogger(RoleDao.class);
    private Transaction transaction = null;
    public static HibernateUtil util = null;

    private volatile static RoleDao instance;

    public static RoleDao getInstance() {
        if (instance == null) {
            synchronized (RoleDao.class) {
                if (instance == null) {
                    instance = new RoleDao();
                }
            }
        }
        return instance;
    }

    @Override
    public void save(Role role) throws DaoException {
        super.save(role);
    }


    public static Role createRole(Role role,
                                  String value,
                                  Set<User> id_User) throws Exception {
        if (role == null) {
            role = new Role();
        }
        role.setValue(value);
        role.setId_User(id_User);
        return role;
    }

}
