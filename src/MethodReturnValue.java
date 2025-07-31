public class MethodReturnValue {
    public static void main(String[] args) {
        var a = 100;
        var b = 100;
        var c = sum(a , b);

        System.out.println(c);
        System.out.println(hitung(100,"+",100));
    }

    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }

    // boleh return dua kali
    static int hitung(int value1, String operasi, int value2){
//        return switch (operasi){
//            case "+" ->value1 + value2;
//            case "-" ->value1 - value2;
//            default ->0;
//        };
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
