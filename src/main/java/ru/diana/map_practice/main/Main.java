package ru.diana.map_practice.main;
import java.util.Map;
import ru.diana.map_practice.util.MapWords;

public class Main {
    public static void main(String[] args) {
        String str = "Hallo, ITGirls";
        Map<Character, Integer> greeting = MapWords.constructMap(str.toCharArray());
        MapWords.printCharacterCounts(greeting);
    }
}
