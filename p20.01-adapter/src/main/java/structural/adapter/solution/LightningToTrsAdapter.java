package structural.adapter.solution;

import structural.adapter.LightningPlug;
import structural.adapter.TrsPlug;

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
