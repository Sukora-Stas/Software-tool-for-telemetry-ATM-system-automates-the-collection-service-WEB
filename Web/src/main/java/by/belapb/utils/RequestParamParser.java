package by.belapb.utils;

import by.belapb.commands.factory.CommandType;
import by.belapb.dao.UserDao;
import by.belapb.dao.exceptions.DaoException;
import by.belapb.pojos.User;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

import static by.belapb.constans.Parameters.*;

/**
 * Created by Sukora Stas.
 */
public class RequestParamParser {
    public static CommandType getCommandType(HttpServletRequest request) {
        String commandName = request.getParameter(COMMAND);
        CommandType commandType = CommandType.DEFAULT;
        if (commandName != null) {
            commandType = CommandType.valueOf(commandName.toUpperCase());
        }
        return commandType;
    }

//    public static User getUser(HttpServletRequest request) throws DaoException {
//        List<User> user = UserDao.getInstance().getAll();
//
//
////        User user = User.builder().build();
//        int id = 0;
//        if (request.getParameter(USER_ID) != null) {
//            id = Integer.parseInt(request.getParameter(USER_ID));
//        }
//        int accessLevel = 0;
//        if (request.getParameter(USER_ACCESS_LEVEL) != null) {
//            accessLevel = Integer.parseInt(request.getParameter(USER_ACCESS_LEVEL));
//        }
//        String firstName = request.getParameter(USER_FIRST_NAME);
//        String lastName = request.getParameter(USER_LAST_NAME);
//        String login = request.getParameter(USER_LOGIN);
//        String password = request.getParameter(USER_PASSWORD);
//        if (firstName != null & lastName != null & login != null & password != null) {
//            user = User.builder()
//                    .login(login)
//                    .password(password)
//                    .firstName(firstName)
//                    .lastName(lastName)
//                    .accessLevel(accessLevel)
//                    .id(id)
//                    .build();
//            return user;
//        } else if (login != null & password != null) {
//            user = User.builder()
//                    .login(login)
//                    .password(password)
//                    .build();
//            return user;
//        }
//        return user;
//    }

}
