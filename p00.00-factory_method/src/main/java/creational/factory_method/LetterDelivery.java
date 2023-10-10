package creational.factory_method;

import java.util.List;

// This *concrete* creator also contains business logic, but focused on the concrete product.
public class LetterDelivery extends PostalDelivery {

    @Override
    protected Letter createContainer(List<String> contents, int weight) {
        int postage = calculateLetterPostage(weight);
        return new Letter(contents, postage);
    }

    protected int calculateLetterPostage(int weight) {
        return weight * 10;
    }
}
