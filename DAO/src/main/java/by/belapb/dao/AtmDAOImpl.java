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
//Создаем сессию, она нужна для использования транзакций
//Грубо говоря, транзакция - это как точка восстановления, если не прошла до конца, то все изменения откатываются.
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction().begin();
//Criteria используется  для запроса с целью получения данных из БД
//Такой формулировки, думаю, Вам пока хватит
//Параметром мы передаем тот класс-сущность, который используем. Если бы данные получали из таблицы Cart то передавать
//надо было бы Cart.class
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

