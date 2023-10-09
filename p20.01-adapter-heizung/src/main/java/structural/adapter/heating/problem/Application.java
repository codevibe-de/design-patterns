package structural.adapter.heating.problem;

import structural.adapter.heating.Heizung;
import structural.adapter.heating.Thermostat;

public class Application {

    public static void main(String[] args) {
        final Heizung h = new Heizung();
        final Thermostat t = new Thermostat(null); // Heizung does not implement ThermostatListener
        t.run();
    }

}
