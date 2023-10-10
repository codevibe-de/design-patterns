package structural.adapter.heating;

public class Thermostat {

    private final ThermostatListener listener;

    public Thermostat(ThermostatListener listener) {
        this.listener = listener;
    }

    public void run() {
        // es ist zu kalt geworden
        this.listener.minAlarm();

        // es ist zu warm geworden
        this.listener.maxAlarm();
    }

}
