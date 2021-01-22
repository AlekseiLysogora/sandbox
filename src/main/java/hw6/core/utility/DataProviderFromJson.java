package hw6.core.utility;

import hw6.core.entities.*;

import org.testng.annotations.DataProvider;

import static hw6.core.entities.JsonObjectData.*;

public class DataProviderFromJson {

    private static ExistingDataJsonObject existingDataJsonObject = new ExistingDataJsonObject();
    private JsonObjectData jsonObjectData = new JsonObjectData();

    @DataProvider(name = "firstJsonData")
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
                },
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
                }
        };
    }


    @DataProvider(name = "secondJsonData")
    public Object[][] secondJsonData() {
        return new Object[][]{
                {
                        getSum1(),
                        getElements1(),
                        getColor1(),
                        getMetals1(),
                        getVegetables1()
                },
                {
                        getSum2(),
                        getElements2(),
                        getColor2(),
                        getMetals2(),
                        getVegetables2()
                },
                {
                        getSum3(),
                        getElements3(),
                        getColor3(),
                        getMetals3(),
                        getVegetables3()
                },
                {
                        getSum4(),
                        getElements4(),
                        getColor4(),
                        getMetals4(),
                        getVegetables4()
                },
                {
                        getSum5(),
                        getElements5(),
                        getColor5(),
                        getMetals5(),
                        getVegetables5()
                }
        };

    }


    @DataProvider(name = "jsonData1")
    public Object[][] jsonData1() {
        return new Object[][]{{JsonObjectData.firstData()}};
    }

    @DataProvider(name = "jsonData2")
    public Object[][] jsonData2() {
        return new Object[][]{{JsonObjectData.secondData()}};
    }

    @DataProvider(name = "jsonData3")
    public Object[][] jsonData3() {
        return new Object[][]{{JsonObjectData.thirdata()}};
    }

    @DataProvider(name = "jsonData4")
    public Object[][] jsonData4() {
        return new Object[][]{{JsonObjectData.fourthData()}};
    }

    @DataProvider(name = "jsonData5")
    public Object[][] jsonData5() {
        return new Object[][]{{JsonObjectData.fifthData()}};
    }
}