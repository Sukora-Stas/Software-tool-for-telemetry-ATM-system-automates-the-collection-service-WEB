package by.belapb.commands.impl.user;

import by.belapb.commands.BaseCommand;
import by.belapb.pojos.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Sukora Stas.
 */
public class LoginCommand implements BaseCommand {
    public String execute(HttpServletRequest request) {
        String page = null;
        HttpSession session = request.getSession();

//        User user =


        return page;
    }
}
