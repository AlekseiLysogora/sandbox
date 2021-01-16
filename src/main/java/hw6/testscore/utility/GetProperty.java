package hw6.testscore.utility;

import java.util.ResourceBundle;

public class GetProperty {

    private ResourceBundle myBundle;

    public enum NameOfProperty {
        PROPERTY
    }

    public GetProperty(NameOfProperty numberOfExercise) {
        switch (numberOfExercise) {
            case PROPERTY:
                myBundle = ResourceBundle.getBundle("hw6/properties/actualProperty");
                break;
            default:
                System.out.println("The resource isn't selected");
                break;
        }
    }

    public String getResource(String resourceName) {
        return myBundle.getString(resourceName);
    }
}