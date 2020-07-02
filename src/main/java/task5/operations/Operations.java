package task5.operations;

public class Operations {
    public static double calc(double num1, double num2, String oper) throws Exception {
        double result = 0;
        if ("+".equals(oper)) {
            result = num1 + num2;
        } else if ("-".equals(oper)) {
            result = num1 - num2;
        } else if ("*".equals(oper)) {
            result = num1 * num2;
        } else if ("/".equals(oper)) {
            result = num1 / num2;
            if (Double.isInfinite(result) || Double.isNaN(result))
                throw new Exception("Делить на ноль нельзя");
        } else {
            throw new Exception("Operation type is incorrect!");
//            System.out.println("Operation type is incorrect!");
        }
        return result;
    }
}
