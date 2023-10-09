package structural.adapter.heating.solution;

import structural.adapter.heating.Heizung;
import structural.adapter.heating.ThermostatListener;

public class HeizungThermostatAdapter implements ThermostatListener {

    private final Heizung heizung;

    public HeizungThermostatAdapter(Heizung heizung) {
        this.heizung = heizung;
    }

    @Override
    public void minAlarm() {
        this.heizung.brennerEin();
    }

    @Override
    public void maxAlarm() {
        this.heizung.brennerAus();
    }

}
