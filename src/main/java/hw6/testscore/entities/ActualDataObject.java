package hw6.testscore.entities;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActualDataObject {
    protected String summary;
    protected ArrayList<String> elements;
    protected String color;
    protected String metals;
    protected ArrayList<String> vegetables;
}