package hw6.core.entities;

import com.google.gson.JsonElement;
import hw6.core.entities.datafromjsonfile.*;

import java.util.ArrayList;

public class JsonObjectData {
    protected JsonElement summary;
    protected ArrayList<String> elements;
    protected String color;
    protected String metals;
    protected ArrayList<String> vegetables;

    private static ExistingDataJsonObject existingDataJsonObject = new ExistingDataJsonObject();

    public static Data1 firstData() {
        Data1 data_1 = new Data1(
                existingDataJsonObject.getJsonData().get(0).get("summary"),
                existingDataJsonObject.getJsonData().get(0).get("elements"),
                String.valueOf(existingDataJsonObject.getJsonData().get(0).get("color")),
                String.valueOf(existingDataJsonObject.getJsonData().get(0).get("metals")),
                existingDataJsonObject.getJsonData().get(0).get("vegetables")
        );
        return data_1;
    }

    public static Data2 secondData() {
        Data2 data_2 = new Data2(
                existingDataJsonObject.getJsonData().get(1).get("summary"),
                existingDataJsonObject.getJsonData().get(1).get("elements"),
                String.valueOf(existingDataJsonObject.getJsonData().get(1).get("color")),
                String.valueOf(existingDataJsonObject.getJsonData().get(1).get("metals")),
                existingDataJsonObject.getJsonData().get(1).get("vegetables")
        );
        return data_2;
    }

    public static Data3 thirdata() {
        Data3 data_3 = new Data3(
                existingDataJsonObject.getJsonData().get(2).get("summary"),
                existingDataJsonObject.getJsonData().get(2).get("elements"),
                String.valueOf(existingDataJsonObject.getJsonData().get(2).get("color")),
                String.valueOf(existingDataJsonObject.getJsonData().get(2).get("metals")),
                existingDataJsonObject.getJsonData().get(2).get("vegetables")
        );
        return data_3;
    }

    public static Data4 fourthData() {
        Data4 data_4 = new Data4(
                existingDataJsonObject.getJsonData().get(3).get("summary"),
                existingDataJsonObject.getJsonData().get(3).get("elements"),
                String.valueOf(existingDataJsonObject.getJsonData().get(3).get("color")),
                String.valueOf(existingDataJsonObject.getJsonData().get(3).get("metals")),
                existingDataJsonObject.getJsonData().get(3).get("vegetables")
        );
        return data_4;
    }

    public static Data5 fifthData() {
        Data5 data_5 = new Data5(
                existingDataJsonObject.getJsonData().get(4).get("summary"),
                existingDataJsonObject.getJsonData().get(4).get("elements"),
                String.valueOf(existingDataJsonObject.getJsonData().get(4).get("color")),
                String.valueOf(existingDataJsonObject.getJsonData().get(4).get("metals")),
                existingDataJsonObject.getJsonData().get(4).get("vegetables")
        );
        return data_5;
    }

    public static JsonElement getSum1() {
       return existingDataJsonObject.getJsonData().get(0).get("summary");
    }

    public static JsonElement getSum2() {
       return existingDataJsonObject.getJsonData().get(1).get("summary");
    }

    public static JsonElement getSum3() {
       return existingDataJsonObject.getJsonData().get(2).get("summary");
    }

    public static JsonElement getSum4() {
       return existingDataJsonObject.getJsonData().get(3).get("summary");
    }

    public static JsonElement getSum5() {
       return existingDataJsonObject.getJsonData().get(4).get("summary");
    }

    public static JsonElement getElements1() {
       return existingDataJsonObject.getJsonData().get(0).get("elements");
    }

    public static JsonElement getElements2() {
       return existingDataJsonObject.getJsonData().get(1).get("elements");
    }

    public static JsonElement getElements3() {
       return existingDataJsonObject.getJsonData().get(2).get("elements");
    }

    public static JsonElement getElements4() {
       return existingDataJsonObject.getJsonData().get(3).get("elements");
    }

    public static JsonElement getElements5() {
       return existingDataJsonObject.getJsonData().get(4).get("elements");
    }

    public static String getColor1() {
        return String.valueOf(existingDataJsonObject.getJsonData().get(0).get("color"));
    }

    public static String getColor2() {
        return String.valueOf(existingDataJsonObject.getJsonData().get(1).get("color"));
    }

    public static String getColor3() {
        return String.valueOf(existingDataJsonObject.getJsonData().get(2).get("color"));
    }

    public static String getColor4() {
        return String.valueOf(existingDataJsonObject.getJsonData().get(3).get("color"));
    }

    public static String getColor5() {
        return String.valueOf(existingDataJsonObject.getJsonData().get(4).get("color"));
    }

    public static String getMetals1() {
        return String.valueOf(existingDataJsonObject.getJsonData().get(0).get("metals"));
    }

    public static String getMetals2() {
        return String.valueOf(existingDataJsonObject.getJsonData().get(1).get("metals"));
    }

    public static String getMetals3() {
        return String.valueOf(existingDataJsonObject.getJsonData().get(2).get("metals"));
    }

    public static String getMetals4() {
        return String.valueOf(existingDataJsonObject.getJsonData().get(3).get("metals"));
    }

    public static String getMetals5() {
        return String.valueOf(existingDataJsonObject.getJsonData().get(4).get("metals"));
    }

    public static JsonElement getVegetables1() {
       return existingDataJsonObject.getJsonData().get(0).get("vegetables");
    }

    public static JsonElement getVegetables2() {
       return existingDataJsonObject.getJsonData().get(1).get("vegetables");
    }

    public static JsonElement getVegetables3() {
       return existingDataJsonObject.getJsonData().get(2).get("vegetables");
    }

    public static JsonElement getVegetables4() {
       return existingDataJsonObject.getJsonData().get(3).get("vegetables");
    }

    public static JsonElement getVegetables5() {
       return existingDataJsonObject.getJsonData().get(4).get("vegetables");
    }

}