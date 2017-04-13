package by.belapb.commands.impl.user;

import by.belapb.commands.BaseCommand;
import by.belapb.dao.exceptions.DaoException;
import by.belapb.pojos.User;
import by.belapb.utils.RequestParamParser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static by.belapb.constans.Parameters.USER_LOGIN;
import static by.belapb.constans.Parameters.USER_PASSWORD;

/**
 * Created by Sukora Stas.
 */
public class LoginCommand implements BaseCommand {

    public String execute(HttpServletRequest request) throws DaoException {
        String page = null;
        HttpSession session = request.getSession();

        User user = RequestParamParser.getUser(request);





        return page;
    }
}
