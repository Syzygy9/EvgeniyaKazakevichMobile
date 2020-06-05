package util;

import lombok.SneakyThrows;

import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

    @SneakyThrows
    public static Properties getProperties() {

        Properties properties = new Properties();
        String propertyPath = "config.properties";
        try {
            properties.load(ConfigProperties.class.getClassLoader()
                    .getResourceAsStream(propertyPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
