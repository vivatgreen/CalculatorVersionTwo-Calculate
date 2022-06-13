package pro.sky.calculatorversiontwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private CalculatorService calculatorService;

    public void Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String hello(){
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2){
        if(num1 == null || num2 == null){
            return "Please add parameters";
        }
        return num1 +  " + " + num2 +  " = " + calculatorService.plus(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2){
        return num1 +  " - " + num2 +  " = " + calculatorService.minus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2){
        return num1 +  " * " + num2 +  " = " + calculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2){
        return num1 +  " / " + num2 +  " = " + calculatorService.divide(num1, num2);
    }






}
