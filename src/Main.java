import java.io.FileInputStream;
import java.util.Properties;

public class Main {
    private static final Properties properties
             = new Properties();
    private static void loadingDataFromPropertiesFile(String fileName){
        try(FileInputStream fileInputStream
                 = new FileInputStream(fileName)){
            properties.load(fileInputStream);
            System.out.println(properties.getProperty("db_url"));
            System.out.println(properties.getProperty("db_username"));
            System.out.println(properties.getProperty("db_password"));
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
    public static void main(String[] args) {
        loadingDataFromPropertiesFile("./src/app.properties");
    }
}
