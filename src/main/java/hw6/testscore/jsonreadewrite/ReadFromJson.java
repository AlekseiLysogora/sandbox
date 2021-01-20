package hw6.testscore.jsonreadewrite;

import com.google.gson.*;
import java.io.*;

public class ReadFromJson {
    JsonParser parser = new JsonParser();
    String pathToJsonFile = "hw6/properties/JDI_ex8_metalsColorsDataSet.json";

    InputStream inputStream = getClass()
            .getClassLoader()
            .getResourceAsStream(pathToJsonFile);

    Reader reader = new InputStreamReader(inputStream);

    JsonElement rootElement = parser.parse(reader);

    JsonObject rootObject = rootElement.getAsJsonObject();

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