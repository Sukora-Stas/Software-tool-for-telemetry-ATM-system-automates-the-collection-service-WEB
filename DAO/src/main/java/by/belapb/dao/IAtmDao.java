package by.belapb.dao;

import by.belapb.pojos.ATM;

import java.util.List;

/**
 * Created by Sukora Stas.
 */
public interface IAtmDao {

    IAtmDao INSTANCE_PRODUCT= new AtmDAOImpl();
    List<ATM> getProducts();
}
