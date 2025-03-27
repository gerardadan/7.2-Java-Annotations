package org.ex1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import utils.FileUtils;
import utils.Print;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Gerard", "Adan", 40);
        String json = serializeObject((Object) employee);
        String path = FileUtils.getProjectPath() + "\\src\\main\\resources\\results.txt";
        writeFile(path, json);
    }

    public static String serializeObject(Object obj) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error serializing object: " + e);
        }
    }

    public static void writeFile(String path, String text) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(text);
        } catch (IOException e) {
            Print.printConsole("Error writing file: " + e.getMessage());
        }
    }
}