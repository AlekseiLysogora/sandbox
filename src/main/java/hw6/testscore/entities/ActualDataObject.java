package hw6.testscore.entities;

import com.google.gson.Gson;
import hw6.testscore.jsonreader.ReadFromJson;
import hw6.testscore.jsonreader.WriteToJason;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActualDataObject {
    protected ArrayList<String> summary;
    protected ArrayList<String> elements;
    protected String color;
    protected String metals;
    protected ArrayList<String> vegetables;

    transient WriteToJason readFromJson = new WriteToJason();
    transient Gson gson = new Gson();
}
