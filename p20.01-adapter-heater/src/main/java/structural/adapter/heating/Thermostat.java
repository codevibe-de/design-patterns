package structural.adapter.heating;

public class Thermostat implements Runnable {

    private final ThermostatListener listener;

    public Thermostat(ThermostatListener listener) {
        this.listener = listener;
    }

    @Override
    public void run() {
        // es ist zu kalt geworden
        this.listener.minAlarm();

        // es ist zu warm geworden
        this.listener.maxAlarm();
    }

}
