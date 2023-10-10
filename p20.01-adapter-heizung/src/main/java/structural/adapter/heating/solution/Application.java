package structural.adapter.heating.solution;

import structural.adapter.heating.Heater;
import structural.adapter.heating.Thermostat;

public class Application {

    public static void main(String[] args) {
        final Heater h = new Heater();
        final HeizungThermostatAdapter a = new HeizungThermostatAdapter(h);
        final Thermostat t = new Thermostat(a);
        t.run();
    }

}
