package structural.adapter.problem;

import structural.adapter.IPhone;
import structural.adapter.TrsHeadset;

public class ProblemApp {

    public static void main(String[] args) {
        IPhone phone = new IPhone();
        TrsHeadset headset = new TrsHeadset();

        // phone.playAudioUsing(headset.getPlug()); // doesn't work!
    }
}
