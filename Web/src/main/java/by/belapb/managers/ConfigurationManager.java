package by.belapb.managers;

import by.belapb.constans.ConfigConstant;

import java.util.ResourceBundle;

/**
 * Created by Sukora Stas.
 */
public class ConfigurationManager {

    private volatile static ConfigurationManager instance;
    private final ResourceBundle bundle = ResourceBundle.getBundle(ConfigConstant.CONFIGS_SOURCE);

    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getProperty(String key){
        return bundle.getString(key);
    }

}
