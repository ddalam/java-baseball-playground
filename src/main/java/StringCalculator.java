import java.util.Scanner;

public class StringCalculator {

    public int calc(int result, int currentNum, String op) {
        if (op.equals("+")) {
            return result += currentNum;
        } else if (op.equals("-")) {
            return result -= currentNum;
        } else if (op.equals("*")) {
            return result *= currentNum;
        } else {
            return result /= currentNum;
        }
    }

    public int callCalc(String str) {

        String[] splitStr = str.split(" ");

        int result = Integer.parseInt(splitStr[0]);

        for (int i = 2; i < splitStr.length; i = i + 2) {
            int intS = Integer.parseInt(splitStr[i]);
            if (intS >= 0 && intS <= 9) {
                result = calc(result, intS, splitStr[i-1]);
            }
        }

        return result;
    }

    public String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
