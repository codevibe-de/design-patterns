package structural.adapter.iphone.problem;

import structural.adapter.iphone.IPhone;
import structural.adapter.iphone.TrsHeadset;

public class ProblemApp {

    public static void main(String[] args) {
        IPhone phone = new IPhone();
        TrsHeadset headset = new TrsHeadset();

        // phone.playAudioUsing(headset); // doesn't work!
    }
}
