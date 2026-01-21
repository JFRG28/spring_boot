package com.example.exceptions.exceptions.Services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;

@Service

public class FileContent {

    public String readFile(String filePath) {
        try {
            Path path = Paths.get(filePath);
            return Files.readString(path);
        } catch (IOException ERROR) {
            throw new RuntimeException("Error reading file: " + ERROR.getMessage(), ERROR);
        }
    }
}
