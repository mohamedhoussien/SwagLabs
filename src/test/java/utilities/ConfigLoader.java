package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private Properties properties;

    public ConfigLoader(String filepath) {
        if (filepath == null || filepath.isEmpty()) {
            throw new IllegalArgumentException("File path cannot be null or empty");
        }
        loadproperties(filepath);
    }

    private void loadproperties(String filepath) {
        properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(filepath)) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load properties file: " + filepath, e);
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
