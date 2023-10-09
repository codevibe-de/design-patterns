package structural.adapter.iphone.solution;

import structural.adapter.iphone.IPhone;
import structural.adapter.iphone.TrsHeadset;

public class SolutionApp {

    public static void main(String[] args) {
        IPhone phone = new IPhone();
        TrsHeadset headset = new TrsHeadset();

        phone.playAudioUsing(
                new LightningToTrsAdapter(headset.getPlug())
        );
    }

}
