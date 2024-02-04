package Java;

import java.util.LinkedHashMap;

public class SourceCodeAnalysis {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("1", "1");
        linkedHashMap.put("2", "2");
        linkedHashMap.put("3", "3");
        linkedHashMap.put("4", "4");
        linkedHashMap.put("5", "5");
        linkedHashMap.put("6", "6");

        linkedHashMap.get("4");
        linkedHashMap.get("2");

        System.out.println(linkedHashMap);
    }
}
