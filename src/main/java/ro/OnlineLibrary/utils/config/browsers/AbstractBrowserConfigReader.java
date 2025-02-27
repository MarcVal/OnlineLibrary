package ro.OnlineLibrary.utils.config.browsers;

import ro.OnlineLibrary.utils.config.properties.PropertiesReader;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public abstract class AbstractBrowserConfigReader extends PropertiesReader {

    public AbstractBrowserConfigReader(String defaults, String resourcePath) {
        super(defaults, resourcePath);
    }

    public abstract WebDriver createDriver() throws IOException;

    public abstract boolean isSilentDownload();

    public abstract String getDownloadPath();
}
