package hw6.core.utility;

import hw6.core.entities.User;

import static hw6.core.utility.GetProperties.NameOfProperty.EXERCISE_DATA;

public class AuxiliaryClass {
    protected static User ROMAN = new User("Roman", "Jdi1234");

    private  GetProperties getExerciseProperties = new GetProperties(EXERCISE_DATA);

    protected String DATA1 = getExerciseProperties.getResource("data1");
    protected String DATA2 = getExerciseProperties.getResource("data2");
    protected String DATA3 = getExerciseProperties.getResource("data3");
    protected String DATA4 = getExerciseProperties.getResource("data4");
    protected String DATA5 = getExerciseProperties.getResource("data5");
}