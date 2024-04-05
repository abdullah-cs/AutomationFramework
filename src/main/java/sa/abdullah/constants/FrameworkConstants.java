package sa.abdullah.constants;

public final class FrameworkConstants {

    //private constructor so no one creates objects of the class
    private FrameworkConstants(){}

    private static final String CHROME_DRIVER_PATH = "src/main/resources/drivers/chromedriver";
    private static final String CONFIG_FILE_PATH = "src/main/resources/config/config.properties";
    private static final int WAIT_TIME = 10;

    public static String getChromeDriverPath(){
        return CHROME_DRIVER_PATH;
    }

    public static String getConfigFilePath() {
        return CONFIG_FILE_PATH;
    }

    public static int getWaitTime(){
        return WAIT_TIME;
    }
}
