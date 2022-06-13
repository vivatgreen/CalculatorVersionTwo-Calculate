package pro.sky.calculatorversiontwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/calculator/plus")
    public String getPlus(@RequestParam(value = "value1", required = false) Integer value1,
                          @RequestParam(value = "value2", required = false) Integer value2) {
        if (value1 == null || value2 == null) {
            return "Не указан параметр";
        }
        return "Результат сложения: " + value1 + " + " + value2 + " = "
                + calculatorService.getPlus(value1, value2);
    }

    @GetMapping(path = "/calculator/minus")
    public String getNegative(@RequestParam(value = "value1", required = false) Integer value1,
                              @RequestParam(value = "value2", required = false) Integer value2) {
        if (value1 == null || value2 == null) {
            return "Не указан параметр";
        }
        return "Результат вычитания: " + value1 + " - " + value2 + " = "
                + calculatorService.getNegative(value1, value2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String getMultiply(@RequestParam(value = "value1", required = false) Integer value1,
                              @RequestParam(value = "value2", required = false) Integer value2) {
        if (value1 == null || value2 == null) {
            return "Не указан параметр";
        }
        return "Результат умножения: " + value1 + " * " + value2 + " = "
                + calculatorService.getMultiply(value1, value2);
    }

    @GetMapping(path = "/calculator/divide")
    public String getDivide(@RequestParam(value = "value1", required = false) Integer value1,
                            @RequestParam(value = "value2", required = false) Integer value2) {
        if (value1 == null || value2 == null) {
            return "Не указан параметр";
        }
        if (value2 == 0) {
            return "На ноль делить нельзя. Измените значение: " + value2;
        }
        return "Результат деления: " + value1 + " / " + value2 + " = "
                + calculatorService.getDivide(value1, value2);
    }
}
