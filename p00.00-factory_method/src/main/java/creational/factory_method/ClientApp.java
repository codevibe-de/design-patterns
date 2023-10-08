package creational.factory_method;

import java.util.List;

public class ClientApp {

    public static void main(String[] args) {
        new LetterDelivery().send(List.of("Soap", "Toothbrush", "Towel"));
    }
}
