package hw6.core.entities;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import hw6.core.jsonreadewrite.ReadFromJson;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExistingDataJsonObject {

    protected ArrayList<String> summary;
    protected ArrayList<String> elements;
    protected String color;
    protected String metals;
    protected ArrayList<String> vegetables;

    ReadFromJson readFromJson = new ReadFromJson();
    Gson gson = new Gson();

    public List<JsonObject> getJsonData() {
        return readFromJson.getObjectData();
    }

    public ExistingDataJsonObject getJsonData_1() {
        return gson.fromJson(readFromJson.getObjectData_1(), ExistingDataJsonObject.class);
    }

    public ExistingDataJsonObject getJsonData_2() {
        return gson.fromJson(readFromJson.getObjectData_2(), ExistingDataJsonObject.class);
    }

    public ExistingDataJsonObject getJsonData_3() {
        return gson.fromJson(readFromJson.getObjectData_3(), ExistingDataJsonObject.class);
    }

    public ExistingDataJsonObject getJsonData_4() {
        return gson.fromJson(readFromJson.getObjectData_4(), ExistingDataJsonObject.class);
    }

    public ExistingDataJsonObject getJsonData_5() {
        return gson.fromJson(readFromJson.getObjectData_5(), ExistingDataJsonObject.class);
    }
}