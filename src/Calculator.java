public class Calculator {
    public double sum(String... numbers){
        double result = 0;
        for(String n : numbers) result += Double.valueOf(n);
        return result;
    }

    public double sub(String... numbers){
        double result = Double.valueOf(numbers[0]);
        numbers[0] = "0";
        for(String n : numbers) result -= Double.valueOf(n);
        return result;
    }

    public double mult(String... numbers){
        double result = 1;
        for(String n : numbers) result = result * Double.valueOf(n);
        return result;
    }

    public double div(String... numbers){
        double result = Double.valueOf(numbers[0]);;
        numbers[0] = "1";
        for(String n : numbers) result = result / Double.valueOf(n);
        return result;
    }

    public double mod(String x, String y){
        return Double.valueOf(x) % Double.valueOf(y);
    }
}