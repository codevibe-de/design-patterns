package structural.adapter.solution;

import structural.adapter.IPhone;
import structural.adapter.TrsHeadset;

public class SolutionApp {

    public static void main(String[] args) {
        IPhone phone = new IPhone();
        TrsHeadset headset = new TrsHeadset();

        phone.playAudioUsing(
                new LightningToTrsAdapter(headset.getPlug())
        );
    }

}
