package by.belapb.utils;

import by.belapb.commands.BaseCommand;
import by.belapb.commands.factory.CommandFactory;
import by.belapb.constans.PagePath;
import by.belapb.dao.exceptions.DaoException;
import by.belapb.managers.ConfigurationManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Sukora Stas.
 */
public class RequestHandler {

    public RequestHandler() {
    }

    public static void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, DaoException {
        CommandFactory commandFactory = CommandFactory.getInstance();
        BaseCommand command = commandFactory.defineCommand(request);
        String page = command.execute(request);
        if (page != null) {
//            RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher(page);
//            dispatcher.forward(request,response);
        } else {
            page = ConfigurationManager.getInstance().getProperty(PagePath.INDEX_PAGE_PATH);
            response.sendRedirect(request.getContextPath() + page);
    }
    }
}
