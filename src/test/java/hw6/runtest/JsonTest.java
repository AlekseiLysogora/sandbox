package hw6.runtest;

import com.google.gson.*;
import hw6.service.json.JsonObjectData;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class JsonTest {
    @Test
    public void testJson() {
        JsonParser parser = new JsonParser();
        String pathToJsonFile = "hw6/properties/JDI_ex8_metalsColorsDataSet.json";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(pathToJsonFile);
        Reader reader = new InputStreamReader(inputStream);

        JsonElement rootelement = parser.parse(reader);

        JsonObject rootObject = rootelement.getAsJsonObject();
        JsonObject object = rootObject.getAsJsonObject("data_1");

        JsonArray summary = object.getAsJsonArray("summary");
        JsonArray elements = object.getAsJsonArray("elements");
        JsonPrimitive color = object.getAsJsonPrimitive("color");
        JsonPrimitive metals = object.getAsJsonPrimitive("metals");
        JsonArray vegetables = object.getAsJsonArray("vegetables");

        Gson gson = new Gson();
        JsonObjectData jsonObjectData = gson.fromJson(object, JsonObjectData.class);
        System.out.println(jsonObjectData.toString() + "\n");

        System.out.println(summary + "summary");
        System.out.println(elements + "elements");
        System.out.println(color + "color");
        System.out.println(metals + "metals");
        System.out.println(vegetables + "vegetables");
    }
}
