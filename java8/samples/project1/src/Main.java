public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java 9 world");

        //use of lambda ex case 1
        callLambdaEx(() -> System.out.println("I'm executing from lambda"));

        //use of lambda ex case 2
        SimpleInterface si = () -> System.out.println("I'm executing from lambda, case 2");
        si.doSomthing();

    }

    private static void callLambdaEx(SimpleInterface si) {
        si.doSomthing();
    }
}
