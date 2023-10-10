package creational.factory_method;

import java.util.List;

public class ClientApp {

    public static void main(String[] args) {
        // send nationwide
        new LetterDelivery().send(List.of("Soap", "Toothbrush", "Towel"));

        // send overseas
        new OverseasLetterDelivery().send(List.of("Soap", "Toothbrush", "Towel"));
    }
}
