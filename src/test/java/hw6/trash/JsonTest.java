package hw6.trash;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import hw6.testscore.entities.ExistingDataJsonObject;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class JsonTest {

    //Training class

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
        ExistingDataJsonObject entityDataFromJson = gson
                .fromJson(object, ExistingDataJsonObject.class);
        System.out.println(entityDataFromJson.getJsonData_1().toString() + "\n");

        ArrayList<Integer> yourArray = new Gson()
                .fromJson(summary, new TypeToken<ArrayList<Integer>>(){}.getType());
        //int sum = Arrays.stream(yourArray).sum();
        int a = yourArray.get(0);
        int b = yourArray.get(1);
        System.out.println(a + " " + b + " = " + (a + b));
        System.out.println(summary + "summary");
        /*System.out.println(elements + "elements");
        System.out.println(color + "color");
        System.out.println(metals + "metals");
        System.out.println(vegetables + "vegetables");*/
    }
}