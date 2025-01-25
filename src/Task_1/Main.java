package Task_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] tools = {
                "Hammer", "Wrench", "Screwdriver", "Saw", "Chisel",
                "Drill", "Pliers", "Tape Measure", "Level", "Wrench",
                "Chisel", "Hammer", "Drill", "Screwdriver", "Saw",
                "Clamp", "File", "Wrench", "Hammer", "Level"
        };

        Map<String, Integer> toolCount = new HashMap<>();

        for (String tool : tools) {
            toolCount.put(tool, toolCount.getOrDefault(tool, 0) + 1);
        }

        System.out.println("Уникальные инструменты:");
        for (String tool : toolCount.keySet()) {
            System.out.println(tool);
        }

        System.out.println("\nКоличество инструментов:");
        for (Map.Entry<String, Integer> entry : toolCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}