import java.util.ArrayList;
import java.util.List;

public class Calculator {

    List<Float> records = new ArrayList<>();
    public Calculator(){
    }

    public float Add(float number1, float number2){
        return  number1 + number2;
    }

    public float Subtraction(float number1, float number2){
        return number1 - number2;
    }

    public float Multiplication(float number1, float number2){
        return number1 * number2;
    }
    public float Division(float number1, float number2){
        return number1 / number2;
    }
    public void AddRecord(float number1, float number2){
        this.records.add(number1);
        this.records.add(number2);
    }
    public void AddRecord(float number1){
        this.records.add(number1);
    }

}
