package com.example.exceptions.exceptions.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.exceptions.exceptions.Services.FileContent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/files")

public class CtrlFile {

    private final FileContent fileContent;

    public CtrlFile(FileContent paramFileContent) {
        this.fileContent = paramFileContent;
    }

    @GetMapping("/read")    
    public ResponseEntity<String> read(@RequestParam String paramPath) {
        try {
            String content = fileContent.readFile(paramPath);
            return ResponseEntity.ok(content);
        } catch (RuntimeException ERROR) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error reading file: " + ERROR);
        }
    }
}