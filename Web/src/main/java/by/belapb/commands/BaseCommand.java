package by.belapb.commands;

import by.belapb.dao.exceptions.DaoException;

import javax.servlet.http.HttpServletRequest;

/**
 * Description: this interface contains base method of all commands
 *
 * @author Artiom Saidanov.
 */
public interface BaseCommand {

    /**
     * This is the base method for all commands
     * @return page to which user will be redirected
     * */
    String execute(HttpServletRequest request) throws DaoException;
}
