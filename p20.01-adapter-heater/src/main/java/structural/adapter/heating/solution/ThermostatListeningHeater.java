package structural.adapter.heating.solution;

import structural.adapter.heating.Heater;
import structural.adapter.heating.ThermostatListener;

// alternative Class-Adapter
public class ThermostatListeningHeater extends Heater implements ThermostatListener {

    @Override
    public void minAlarm() {
        this.turnOn();
    }

    @Override
    public void maxAlarm() {
        this.turnOff();
    }
}
