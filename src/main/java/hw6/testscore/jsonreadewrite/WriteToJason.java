package hw6.testscore.jsonreadewrite;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import hw6.testscore.entities.RootActualDataJsonObject;

import java.io.*;

public class WriteToJason {

public void writeToJason(String writeActualObject) {

   Gson gson = new GsonBuilder().setPrettyPrinting().create();

    RootActualDataJsonObject dataJsonObject = new RootActualDataJsonObject();
    dataJsonObject.createDataObject(writeActualObject);

       try (FileWriter writer = new FileWriter(
                   "src/test/resources/hw6/properties/ActualDataSet.json")) {
              gson.toJson(dataJsonObject, writer);
         } catch (IOException e) {
             e.printStackTrace();
       }
    }
}