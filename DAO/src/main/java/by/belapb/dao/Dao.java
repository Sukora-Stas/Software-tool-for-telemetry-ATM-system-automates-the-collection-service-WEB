package by.belapb.dao;

import by.belapb.dao.exceptions.DaoException;

import java.io.Serializable;

interface Dao<T> {
    void saveOrUpdate(T t) throws DaoException;

    T get(Serializable id) throws DaoException;

    T load(Serializable id) throws DaoException;

    void delete(T t) throws DaoException;
}

