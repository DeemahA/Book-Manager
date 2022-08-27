package online.Deemah.commen;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propReader {

    private String filePath;
    private Properties props = new Properties();

    public propReader(String filePath) {
        this.filePath = filePath;
        load();
    }

    private Properties load() {

        try ( FileInputStream input = new FileInputStream(filePath)) {

            props.load(input);

            return props;

        } catch (IOException ex) {
            System.err.println("eror");
        }

        return null;
    }

    public String get(String key) {
        return props.getProperty(key);

    }

}
