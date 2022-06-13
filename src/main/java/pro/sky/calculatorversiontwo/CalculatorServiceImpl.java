package pro.sky.calculatorversiontwo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    private int totalSum;


    @Override
    public String getPlus(int value1, int value2) {
        totalSum = value1 + value2;
        return String.valueOf(totalSum);
    }

    @Override
    public String getNegative(int value1, int value2) {
        totalSum = value1 - value2;
        return String.valueOf(totalSum);
    }

    @Override
    public String getMultiply(int value1, int value2) {
        totalSum = value1 * value2;
        return String.valueOf(totalSum);
    }

    @Override
    public String getDivide(int value1, int value2) {
        totalSum = value1 / value2;
        return String.valueOf(totalSum);
    }
}
