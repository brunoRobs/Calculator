import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        while(true){
            try {
                Calculator calculator = new Calculator();
                Scanner scanner = new Scanner(System.in);
                String[] operation = scanner.nextLine().split(" ");
                switch (operation[1]) {
                    case "+" -> System.out.println(calculator.sum(Double.parseDouble(operation[0]), Double.parseDouble(operation[2])));
                    case "-" -> System.out.println(calculator.sub(Double.parseDouble(operation[0]), Double.parseDouble(operation[2])));
                    case "*" -> System.out.println(calculator.mult(Double.parseDouble(operation[0]), Double.parseDouble(operation[2])));
                    case "/" -> System.out.println(calculator.div(Double.parseDouble(operation[0]), Double.parseDouble(operation[2])));
                }

            } catch (Exception e){
                System.out.println("Invalid operation");
            }
        }
    }
}