package by.belapb.dao;

import by.belapb.pojos.ATM;
import by.belapb.util.NewHibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Sukora Stas.
 */
public class AtmDAOImpl implements IAtmDao {

    public List<ATM> getProducts() {

        List<ATM> result = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction().begin();

            Criteria criteria = session.createCriteria(ATM.class);

            result = (List<ATM>) criteria.list();

            session.getTransaction().commit();
        } catch (Exception e) {
//Обработку исключений обязательно пишите. Но это я оставлю Вам на самостоятельную работу.
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
        return result;
    }
}

