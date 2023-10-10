package creational.factory_method;

public class OverseasLetterDelivery extends LetterDelivery {

    @Override
    protected int calculateLetterPostage(int weight) {
        return super.calculateLetterPostage(weight) * 3;
    }
}
