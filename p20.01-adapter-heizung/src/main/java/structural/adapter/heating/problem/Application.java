package structural.adapter.heating.problem;

import structural.adapter.heating.Heater;
import structural.adapter.heating.Thermostat;

public class Application {

    public static void main(String[] args) {
        final Heater h = new Heater();
        final Thermostat t = new Thermostat(null); // Heater does not implement ThermostatListener
        t.run();
    }

}
