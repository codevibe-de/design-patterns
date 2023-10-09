package structural.adapter.heating.solution;

import structural.adapter.heating.Heizung;
import structural.adapter.heating.Thermostat;

public class Application {

    public static void main(String[] args) {
        final Heizung h = new Heizung();
        final HeizungThermostatAdapter a = new HeizungThermostatAdapter(h);
        final Thermostat t = new Thermostat(a);
        t.run();
    }

}
