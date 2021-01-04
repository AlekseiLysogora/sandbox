package hw6.service.entities;

import hw6.service.json.JsonObjectData;
import org.testng.annotations.DataProvider;

public class JsonDataProvider {

    private static JsonObjectData jod = new JsonObjectData();

    @DataProvider(name = "jsonData")
    public static Object[][] jsonData() {
        return new Object[][]{
                {
                    jod.getJsonData_1().getSummary(),
                    jod.getJsonData_1().getColor(),
                    jod.getJsonData_1().getMetals(),
                    jod.getJsonData_1().getVegetables()
                }
//                ,
//                {
//                    jod.getJsonData_2().getSummary(),
//                    jod.getJsonData_2().getColor(),
//                    jod.getJsonData_2().getMetals()
//                }
        };
    }
}