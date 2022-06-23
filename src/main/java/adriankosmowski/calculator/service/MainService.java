package adriankosmowski.calculator.service;

import org.springframework.stereotype.Service;
import adriankosmowski.calculator.CalculatorVO;

@Service
public class MainService {

    public double compute(CalculatorVO calculatorVO){
        switch(calculatorVO.getOperator()){
            case "+":
                return calculatorVO.getValue1() + calculatorVO.getValue2();
            case "*":
                return calculatorVO.getValue1() * calculatorVO.getValue2();
            case "/":
                return calculatorVO.getValue1() / calculatorVO.getValue2();
            case "-":
                return calculatorVO.getValue1() - calculatorVO.getValue2();
            default:
                return 0;
        }
    }
}
