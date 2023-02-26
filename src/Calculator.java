import java.util.ArrayList;
import java.util.List;

public class Calculator {

    List<Float> records = new ArrayList<>();
    public Calculator(){
    }

    public float operation(String operation, float number1, float number2){
        float ans = 0;
        switch (operation) {
            case "Addition" -> ans = this.Add(number1, number2);
            case "Subtraction" -> ans = this.Subtraction(number1, number2);
            case "Multiplication" -> ans = this.Multiplication(number1, number2);
            case "Division" -> ans = this.Division(number1, number2);
            default -> System.out.println("This is not an operation");
        }
        return ans;
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
