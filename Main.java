import java.util.Stack;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder reversedNumber = new StringBuilder();
        while(!stack.isEmpty()) {
            reversedNumber.append(stack.pop());
        }
        System.out.println("Число в обратном порядке: " + reversedNumber);
    }
}