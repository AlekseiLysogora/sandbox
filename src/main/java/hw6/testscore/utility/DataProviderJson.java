package hw6.testscore.utility;

import hw6.testscore.entities.ExistingDataJsonObject;
import org.testng.annotations.DataProvider;

public class DataProviderJson {

    private static ExistingDataJsonObject existingDataJsonObject = new ExistingDataJsonObject();

    @DataProvider(name = "jsonData")
    public static Object[][] jsonData() {
        return new Object[][]{
                {
                        existingDataJsonObject.getJsonData_1().getSummary(),
                        existingDataJsonObject.getJsonData_1().getElements(),
                        existingDataJsonObject.getJsonData_1().getColor(),
                        existingDataJsonObject.getJsonData_1().getMetals(),
                        existingDataJsonObject.getJsonData_1().getVegetables()
                },
                {
                        existingDataJsonObject.getJsonData_2().getSummary(),
                        existingDataJsonObject.getJsonData_2().getElements(),
                        existingDataJsonObject.getJsonData_2().getColor(),
                        existingDataJsonObject.getJsonData_2().getMetals(),
                        existingDataJsonObject.getJsonData_2().getVegetables()
                }/*,
                {
                        existingDataJsonObject.getJsonData_3().getSummary(),
                        existingDataJsonObject.getJsonData_3().getElements(),
                        existingDataJsonObject.getJsonData_3().getColor(),
                        existingDataJsonObject.getJsonData_3().getMetals(),
                        existingDataJsonObject.getJsonData_3().getVegetables()
                },
                {
                        existingDataJsonObject.getJsonData_4().getSummary(),
                        existingDataJsonObject.getJsonData_4().getElements(),
                        existingDataJsonObject.getJsonData_4().getColor(),
                        existingDataJsonObject.getJsonData_4().getMetals(),
                        existingDataJsonObject.getJsonData_4().getVegetables()
                },
                {
                        existingDataJsonObject.getJsonData_5().getSummary(),
                        existingDataJsonObject.getJsonData_5().getElements(),
                        existingDataJsonObject.getJsonData_5().getColor(),
                        existingDataJsonObject.getJsonData_5().getMetals(),
                        existingDataJsonObject.getJsonData_5().getVegetables()
                }*/
        };
    }

    //    @DataProvider(name = "jsonData2")
    //    public static Object[][] jsonData2() {
    //
    //        for (int i = 0; i < 6; i++) {
    //            return new Object[][]{
    //                    {
    //                            dataJsonObject.getJsonData(i).getSummary(),
    //                            dataJsonObject.getJsonData(i).getElements(),
    //                            dataJsonObject.getJsonData(i).getColor(),
    //                            dataJsonObject.getJsonData(i).getMetals(),
    //                            dataJsonObject.getJsonData(i).getVegetables()
    //                    }
    //            };
    //        }
    //
    //        return new Object[][]{ {}, {}, {} }; //todo --> ?
    //    }
}