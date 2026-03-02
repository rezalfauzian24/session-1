public class Math {
    // Properties
    private double number1;
    private double number2;
    private double number3;
    
    // Constructor
    public Math(double number1, double number2, double number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }
    
    // Getter and Setter methods (optional but good practice)
    public double getNumber1() {
        return number1;
    }
    
    public void setNumber1(double number1) {
        this.number1 = number1;
    }
    
    public double getNumber2() {
        return number2;
    }
    
    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    
    public double getNumber3() {
        return number3;
    }
    
    public void setNumber3(double number3) {
        this.number3 = number3;
    }
    
    // Method to calculate addition (sum of all numbers)
    public double add() {
        return number1 + number2 + number3;
    }
    
    // Method to calculate division: (number1 + number2) / number3
    public double divide() {
        if (number3 == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return (number1 + number2) / number3;
    }
    
    // Method to calculate multiplication: number1 * number2 * number3
    public double multiple() {
        return number1 * number2 * number3;
    }
}
