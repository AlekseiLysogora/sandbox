package hw6.testscore.entities.dataEntity;

import java.util.ArrayList;

public class Elements extends AbstractEntity {
    String delimeter = ", ";

    public ArrayList<String> getElements1() {
        String str = getProperty.getResource("Elements1");
        ArrayList<String> elements1 = new ArrayList<>();
        String[] subStr;
        subStr = str.split(delimeter);
        for (int i = 0; i < subStr.length; i++) {
            System.out.println(subStr[i]);
            elements1.add(subStr[i]);
        }
        return elements1;
    }

    public ArrayList<String> getElements2() {
        ArrayList<String> elements2 = new ArrayList<>();
        String str2 = getProperty.getResource("Elements2");
        String[] subStr2;
        subStr2 = str2.split(delimeter);
        for(int i = 0; i < subStr2.length; i++) {
            System.out.println(subStr2[i]);
            elements2.add(subStr2[i]);
        }
        return elements2;
    }

    public ArrayList<String> getElements3() {
        ArrayList<String> elements3 = new ArrayList<>();
        String str3 = getProperty.getResource("Elements3");
        String[] subStr3;
        subStr3 = str3.split(delimeter);
        for(int i = 0; i < subStr3.length; i++) {
            System.out.println(subStr3[i]);
            elements3.add(subStr3[i]);
        }
        return elements3;
    }

    public ArrayList<String> getElements4() {
        ArrayList<String> elements4 = new ArrayList<>();
        String str4 = getProperty.getResource("Elements4");
        String[] subStr4;
        subStr4 = str4.split(delimeter);
        for(int i = 0; i < subStr4.length; i++) {
            System.out.println(subStr4[i]);
            elements4.add(subStr4[i]);
        }
        return elements4;
    }

    public ArrayList<String> getElements5() {
        ArrayList<String> elements5 = new ArrayList<>();
        String str5 = getProperty.getResource("Elements5");
        String[] subStr5;
        subStr5 = str5.split(delimeter);
        for(int i = 0; i < subStr5.length; i++) {
            System.out.println(subStr5[i]);
            elements5.add(subStr5[i]);
        }
        return elements5;
    }
}