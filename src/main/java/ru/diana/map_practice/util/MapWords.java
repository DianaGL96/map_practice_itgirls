package ru.diana.map_practice.util;
import java.util.HashMap;
import java.util.Map;

public class MapWords {
    public static Map<Character, Integer> constructMap (char[] chars) {
        Map<Character, Integer> greeting = new HashMap<>();
        for (char ch: chars) {
            greeting.put(ch, greeting.getOrDefault(ch, 0) + 1);
        }
        return greeting;
    }
    public static void printCharacterCounts (Map<Character, Integer> greeting) {
        for (Map.Entry<Character, Integer> entry : greeting.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            System.out.println(ch + " повторяется " + count + " раз.");
        }
    }
}
