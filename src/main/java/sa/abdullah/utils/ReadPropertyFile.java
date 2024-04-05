package sa.abdullah.utils;

import sa.abdullah.constants.FrameworkConstants;
import sa.abdullah.enms.ConfigProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {

    private ReadPropertyFile(){}

    private static Properties properties = new Properties();

    static {

        FileInputStream config = null;
        try {
            config = new FileInputStream(FrameworkConstants.getConfigFilePath());
            properties.load(config);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(ConfigProperties key) {

        if (Objects.isNull(key) || Objects.isNull(properties.getProperty(key.toString().toLowerCase()))){
            throw new NoSuchFieldError("Property with key as (" + key + ") is not found");
        }

        return properties.getProperty(key.toString().toLowerCase()).trim();
    }

}
