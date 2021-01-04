package hw6.service.json;

import com.google.gson.*;

import java.io.*;

public class ReadFromJson {
    JsonParser parser = new JsonParser();
    String pathToJsonFile = "hw6/properties/JDI_ex8_metalsColorsDataSet.json";
    InputStream inputStream = getClass()
            .getClassLoader()
            .getResourceAsStream(pathToJsonFile);
    Reader reader = new InputStreamReader(inputStream);

    JsonElement rootelement = parser.parse(reader);

    JsonObject rootObject = rootelement.getAsJsonObject();


    public JsonObject getObjectData_1() {
        JsonObject object = rootObject.getAsJsonObject("data_1");
        return object;
    }
    public JsonObject getObjectData_2() {
        JsonObject object = rootObject.getAsJsonObject("data_2");
        return object;
    }
}