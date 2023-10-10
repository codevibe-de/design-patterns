package structural.adapter.iphone;

public class IPhone {

    public void playAudioUsing(LightningPlug plug) {
        // load mp3 file from internal storage
        String mp3Data = "data-goes-here";

        // stream audio data to "plug"
        plug.accept(mp3Data.getBytes());
    }

}
