package hw6.testscore.jsonreadewrite;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;

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

    /*public JsonObject getObjectData(int i) {
        JsonObject object = rootObject.getAsJsonObject("data_" + i);
        return object;
    }*/

    public String getSummaryData(int i) {
        JsonObject object = rootObject.getAsJsonObject("data_" + i);

        JsonArray summary = object.getAsJsonArray("summary");

        ArrayList<Integer> yourArray = new Gson()
                .fromJson(summary, new TypeToken<ArrayList<Integer>>(){}.getType());

        String result = String.valueOf(yourArray.get(0) + yourArray.get(1));

        System.out.println(result);
        return result;
    }
}