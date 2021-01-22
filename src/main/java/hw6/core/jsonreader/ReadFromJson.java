package hw6.core.jsonreader;

import com.google.gson.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFromJson {
    JsonParser parser = new JsonParser();
    String pathToJsonFile = "hw6/properties/JDI_ex8_metalsColorsDataSet.json";

    InputStream inputStream = getClass()
            .getClassLoader()
            .getResourceAsStream(pathToJsonFile);

    Reader reader = new InputStreamReader(inputStream);

    JsonElement rootElement = parser.parse(reader);

    JsonObject rootObject = rootElement.getAsJsonObject();

    public List<JsonObject> getObjectData() {
        List<JsonObject> listObjectData = new ArrayList<>();

        JsonObject data1 = rootObject.getAsJsonObject("data_1");
        JsonObject data2 = rootObject.getAsJsonObject("data_2");
        JsonObject data3 = rootObject.getAsJsonObject("data_3");
        JsonObject data4 = rootObject.getAsJsonObject("data_4");
        JsonObject data5 = rootObject.getAsJsonObject("data_5");
        JsonObject data6 = rootObject.getAsJsonObject("data_6");

        listObjectData.add(data1);
        listObjectData.add(data2);
        listObjectData.add(data3);
        listObjectData.add(data4);
        listObjectData.add(data5);
        listObjectData.add(data6);

        return listObjectData;
    }

    public JsonObject getObjectData_1() {
        JsonObject object = rootObject.getAsJsonObject("data_1");
        return object;
    }

    public JsonObject getObjectData_2() {
        JsonObject object = rootObject.getAsJsonObject("data_2");
        return object;
    }

    public JsonObject getObjectData_3() {
        JsonObject object = rootObject.getAsJsonObject("data_3");
        return object;
    }

    public JsonObject getObjectData_4() {
        JsonObject object = rootObject.getAsJsonObject("data_4");
        return object;
    }

    public JsonObject getObjectData_5() {
        JsonObject object = rootObject.getAsJsonObject("data_5");
        return object;
    }
}