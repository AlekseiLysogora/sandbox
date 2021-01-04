package hw6.service.json;

import com.google.gson.Gson;

import java.util.ArrayList;

public class JsonObjectData {
    ArrayList<String> summary;
    ArrayList<String> elements;
    String color;
    String metals;
    ArrayList<String> vegetables;

    public JsonObjectData() {
    }

    public JsonObjectData(
            ArrayList<String> summary, ArrayList<String> elements,
            String color, String metals, ArrayList<String> vegetables
    ) {
        this.summary = summary;
        this.elements = elements;
        this.color = color;
        this.metals = metals;
        this.vegetables = vegetables;
    }

    public ArrayList<String> getSummary() {
        return summary;
    }

    public String getColor() {
        return color;
    }

    public String getMetals() {
        return metals;
    }

    public ArrayList<String> getVegetables() {
        return vegetables;
    }

    ReadFromJson readFromJson = new ReadFromJson();
    Gson gson = new Gson();

    public JsonObjectData getJsonData_1() {
        return gson.fromJson(readFromJson.getObjectData_1(), JsonObjectData.class);
    }

    public JsonObjectData getJsonData_2() {
        return gson.fromJson(readFromJson.getObjectData_2(), JsonObjectData.class);
    }
}