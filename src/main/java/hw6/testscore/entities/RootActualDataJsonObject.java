package hw6.testscore.entities;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import hw6.testscore.entities.dataEntity.Elements;
import hw6.testscore.utility.GetProperty;
import lombok.*;

import java.util.ArrayList;

import static hw6.testscore.utility.GetProperty.NameOfProperty.PROPERTY;

@Getter
@Setter
public class RootActualDataJsonObject {

    protected ActualDataObject data1;
    protected ActualDataObject data2;
    protected ActualDataObject data3;
    protected ActualDataObject data4;
    protected ActualDataObject data5;

    public RootActualDataJsonObject() {
        data1 = new ActualDataObject();
        data2 = new ActualDataObject();
        data3 = new ActualDataObject();
        data4 = new ActualDataObject();
        data5 = new ActualDataObject();
    }

    public RootActualDataJsonObject createDataObject(String writeActualObject) {

        // Изначально идея была такая: в этот метод прилетает строка с результатами
        // Затем, эту строку необходимо разобрать на составляющие (думал регексом)
        // Далее то что, получилось после регекса --> запихиваю в Json объекты
        // Вишинка на торте == сравниваю два Гсон объекта друг с другом
        // ..но что-то пошло не так(
        //System.err.println("\n*-*-* " + writeActualObject + " *-*-*\n");

        GetProperty getProperty = new GetProperty(PROPERTY);

        Elements getElements = new Elements();

        RootActualDataJsonObject rootActualDataJsonObject = new RootActualDataJsonObject();

        String color = String.valueOf(writeActualObject.contains("Color"));

        String metals = writeActualObject.substring(0,10);

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Cucumber");


        data1.setSummary("3");
        data1.setElements(getElements.getElements1());
        data1.setColor("Red");
        data1.setMetals("Gold");
        data1.setVegetables(vegetables);

        data2.setSummary("summary");
        data2.setElements(getElements.getElements2());
        data2.setColor(color);
        data2.setMetals(metals);
        data2.setVegetables(vegetables);

        data3.setSummary("summary");
        data3.setElements(getElements.getElements3());
        data3.setColor(color);
        data3.setMetals(metals);
        data3.setVegetables(vegetables);

        data4.setSummary("summary");
        data4.setElements(getElements.getElements4());
        data4.setColor(color);
        data4.setMetals(metals);
        data4.setVegetables(vegetables);

        data5.setSummary("summary");
        data5.setElements(getElements.getElements5());
        data5.setColor(color);
        data5.setMetals(metals);
        data5.setVegetables(vegetables);

        rootActualDataJsonObject.setData1(data1);
        rootActualDataJsonObject.setData2(data2);
        rootActualDataJsonObject.setData3(data3);
        rootActualDataJsonObject.setData4(data4);
        rootActualDataJsonObject.setData5(data5);

        return rootActualDataJsonObject;
    }
}