package by.belapb.commands.impl;

import by.belapb.commands.BaseCommand;
import by.belapb.constans.PagePath;
import by.belapb.managers.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Sukora Stas.
 */
public class DefaultCommand implements BaseCommand {

    public String execute(HttpServletRequest request) {
        String page = ConfigurationManager.getInstance().getProperty(PagePath.LOGIN_PAGE_PATH);
        return page;
    }
}
