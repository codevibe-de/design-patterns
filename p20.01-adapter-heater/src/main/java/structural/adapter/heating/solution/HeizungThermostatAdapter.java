package structural.adapter.heating.solution;

import structural.adapter.heating.Heater;
import structural.adapter.heating.ThermostatListener;

public class HeizungThermostatAdapter implements ThermostatListener {

    private final Heater heater;

    public HeizungThermostatAdapter(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void minAlarm() {
        this.heater.turnOn();
    }

    @Override
    public void maxAlarm() {
        this.heater.turnOff();
    }

}
