package by.belapb.dao;


import by.belapb.dao.exceptions.DaoException;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import by.belapb.util.HibernateUtil;


public class BaseDao<T> implements Dao<T> {
    private static Logger log = Logger.getLogger(BaseDao.class);
    private Transaction transaction = null;
    public static HibernateUtil util = null;


    //TODO create saveOrUpdate to 1 criter
    public BaseDao() {

    }

    public void saveOrUpdate(T t, Session session) throws DaoException {
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(t);
            log.info("saveOrUpdate(t):" + t);
            transaction.commit();
            log.info("Save or update (commit):" + t);
        } catch (HibernateException e) {
            log.error("Error save or update " + t + " in Dao" + e);
            transaction.rollback();
            throw new DaoException(e);
        }

    }

    public T get(Serializable id) throws DaoException {
        log.info("Get class by id:" + id);
        T t = null;
        try {
            Session session = util.getSession();
            transaction = session.beginTransaction();
            t = (T) session.get(getPersistentClass(), id);
            transaction.commit();
            log.info("get clazz:" + t);
        } catch (HibernateException e) {
            transaction.rollback();
            log.error("Error get " + getPersistentClass() + " in Dao" + e);
            throw new DaoException(e);
        }
        return t;
    }

    public T load(Serializable id) throws DaoException {
        log.info("Load class by id:" + id);
        T t = null;
        try {
            Session session = util.getSession();
            transaction = session.beginTransaction();
            t = (T) session.load(getPersistentClass(), id);
            log.info("load() clazz:" + t);
            session.isDirty();
            transaction.commit();
        } catch (HibernateException e) {
            log.error("Error load() " + getPersistentClass() + " in Dao" + e);
            transaction.rollback();
            throw new DaoException(e);
        }
        return t;
    }

    public void delete(T t) throws DaoException {
        try {
            Session session = util.getSession();
            transaction = session.beginTransaction();
            session.delete(t);
            transaction.commit();
            log.info("Delete:" + t);
        } catch (HibernateException e) {
            log.error("Error save or update " + t + " in Dao" + e);
            transaction.rollback();
            throw new DaoException(e);
        }
    }

    private Class getPersistentClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
