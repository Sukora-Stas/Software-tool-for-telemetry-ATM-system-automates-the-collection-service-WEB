package by.belapb.dao;

import by.belapb.dao.exceptions.DaoException;
import by.belapb.pojos.Role;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Sukora Stas.
 */
public class RoleDao extends BaseDao<Role> {
    private static Logger log = Logger.getLogger(RoleDao.class);
    private Transaction transaction = null;

    public void save(Role role) throws DaoException {
        try {
            Session session = util.getSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(role);
            log.info("Save: " + role);
            transaction.commit();
            log.info("Save(commit):" + role);
        } catch (HibernateException e) {
            log.error("Error save  " + role + " in Dao" + e);
            transaction.rollback();
            throw new DaoException(e);
        }
    }
}
