package api;

import java.util.Optional;

public class AppOptional7 {

    public static void main(String[] args) {

        String s1 = Optional.of("A").orElse(get()); //O método orElse é chamado mesmo contendo valor no Optional
        System.out.println(s1);

        String s2 = Optional.of("A").orElseGet(() -> get());    //o método orElseGet só será executado se o Optional estiver vazio
        System.out.println(s2);
    }

    private static String get() {
        System.out.println("Calling get()...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "B";
    }
}
