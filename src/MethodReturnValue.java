public class MethodReturnValue {

    public static void main(String[] args) {

        var result = sum(1, 9);
        System.out.println(result);

        System.out.println(sum(200, 200));

        var result2 = hitung(100, "+", 200);
        System.out.println(result2);

        System.out.println(hitung(100, "-", 200));
    }

    static int sum(int a, int b) {
        return a+b;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
