public class VarargOverload {

    private void quantity(int ... args) {
        int sum = 0;
        for (int x: args) {
            sum += x;
        }
        System.out.println("Sum = " + sum);
    }
    private void quantity(boolean p, String ... args) {
        boolean negate = !p;
        System.out.println("Negate = " + negate );
        System.out.println("argsLength = " + args.length);
    }

    public static void main(String[] args) {
        VarargOverload obj = new VarargOverload();
        obj.quantity(1, 2, 3);
        obj.quantity(true, "hello", "world");
    }
}
