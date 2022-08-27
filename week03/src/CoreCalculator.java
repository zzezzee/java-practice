public class CoreCalculator {
    //상수
    public static final String[] OPERATORS = new String[]{"+", "-", "*", "/", "="};

    // 프로그램 핵심 상태
    private long accumulator = 0;
    private long currentNumber = 0;
    private String currentOperator = "";

    public String getAccumulator() {
        return Long.toString(accumulator);
    }

    public String getCurrentNumber() {
        return Long.toString(currentNumber);
    }

    public void addNumber(String number) {
        currentNumber *= 10;
        currentNumber += Integer.valueOf(number);
    }

    public void updateOperator(String operator) {
        currentOperator = operator;
    }

    public void calculate() {
        switch (currentOperator) {
            case "" -> accumulator = currentNumber;
            case "+" -> accumulator += currentNumber;
            case "-" -> accumulator -= currentNumber;
            case "*" -> accumulator *= currentNumber;
            case "/" -> accumulator /= currentNumber;
        }
        currentNumber = 0;
    }
}
