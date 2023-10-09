package structural.adapter.iphone.solution;

import structural.adapter.iphone.LightningPlug;
import structural.adapter.iphone.TrsPlug;

public class LightningToTrsAdapter implements LightningPlug {

    private final TrsPlug trsPlug;

    public LightningToTrsAdapter(TrsPlug trsPlug) {
        this.trsPlug = trsPlug;
    }

    @Override
    public void accept(byte[] audioBytes) {
        this.trsPlug.accept(audioBytes);
    }

}
