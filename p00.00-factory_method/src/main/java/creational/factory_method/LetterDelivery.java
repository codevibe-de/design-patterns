package creational.factory_method;

import java.util.List;

public class LetterDelivery extends PostalDelivery {

    @Override
    protected Container createContainer(List<String> contents, int weight) {
        int postage = calculateLetterPostage(weight);
        return new Letter(contents, postage);
    }

    private int calculateLetterPostage(int weight) {
        return weight * 10;
    }
}
