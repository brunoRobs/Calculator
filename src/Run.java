import java.util.Arrays;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        while(true){
            try {
                Calculator calculator = new Calculator();
                Scanner scanner = new Scanner(System.in);
                String text = scanner.nextLine().trim();
                if(text.contains("+")) {
                    String[] operation = scanner.nextLine().replace("+", "_").split("_");
                    System.out.println(calculator.sum(operation));
                } else if(text.contains("-")) {
                    String[] operation = scanner.nextLine().split("-");
                    System.out.println(calculator.sub(operation));
                } else if(text.contains("*")) {
                    String[] operation = scanner.nextLine().replace("*", "_").split("_");
                    System.out.println(calculator.mult(operation));
                } else if(text.contains("/")) {
                    String[] operation = scanner.nextLine().split("/");
                    System.out.println(calculator.div(operation));
                } else {
                    String[] operation = scanner.nextLine().split("%");
                    System.out.println(calculator.mod(operation[0], operation[2]));
                }

            } catch (Exception e){
                System.out.println("Invalid operation");
            }
        }
    }
}