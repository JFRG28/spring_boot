package com.example.exceptions.exceptions.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/operations")

public class CtrlOperations {

    @GetMapping("/divide")
/*
    public String divide() {
        float value = 10 / 0;
        return "Result: " + value;
    }
*/
    public String divide(@RequestParam String paramNumber) {
/*
        try {
            float value = Float.parseFloat(paramNumber);
            float result = 10 / value;
            return "Result: " + result;
        } catch (NumberFormatException ERROR) {
            return "Error: Invalid number format.";
        } catch (ArithmeticException ERROR) {
            return "Error: Division by zero not allowed.";
        }
    }
 */
        float value = Float.parseFloat(paramNumber);
        float result = 10 / value;
        return "Result: " + result;
    }

@RestController
@RequestMapping("/api/operations")

class NullObject{

    @GetMapping("/nullcheck")
    
    public String NullCheck() {
        String strNull = null;
        strNull.length();
        return "Variable has a null value.";
    }

}
}
