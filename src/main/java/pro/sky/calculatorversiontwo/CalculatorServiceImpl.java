package pro.sky.calculatorversiontwo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    public String hello(){
        return "Welcome to the Calculator!";
    }

    @Override
    public int plus(int num1, int num2){
        return num1 + num2;
    }
    @Override
    public int minus(int num1, int num2){
        return num1 - num2;
    }
    @Override
    public int multiply(int num1, int num2){
        return num1 * num2;
    }
    @Override
    public double divide(int num1, int num2){
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return num1 / num2;
    }

}
