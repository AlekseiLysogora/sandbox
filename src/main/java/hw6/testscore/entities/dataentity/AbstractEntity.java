package hw6.testscore.entities.dataentity;

import hw6.testscore.utility.GetProperty;

import static hw6.testscore.utility.GetProperty.NameOfProperty.PROPERTY;

/*
This and the following enhanced classes created to fill JSON  object,
but I have realized that this way isn't the right decision for the
solution of the particular problem. I simply wanted to show you my reasoning.
*/
public class AbstractEntity {
    protected GetProperty getProperty = new GetProperty(PROPERTY);
}