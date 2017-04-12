package by.belapb.utils;

import by.belapb.commands.factory.CommandType;

import javax.servlet.http.HttpServletRequest;

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



}
