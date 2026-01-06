package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GeolocationPage {

    public static final Target BTN_WHERE_AM_I = Target
            .the("botón Where am I")
            .locatedBy("//button[.='Where am I?']");

    public static final Target RESULTADO = Target
            .the("resultado de ubicación")
            .locatedBy("#demo");
}
