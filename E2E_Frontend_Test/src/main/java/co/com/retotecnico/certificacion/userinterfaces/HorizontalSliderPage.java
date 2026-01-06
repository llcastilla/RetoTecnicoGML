package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HorizontalSliderPage {

    public static final Target LINK_HORIZONTAL_SLIDER = Target
            .the("enlace Horizontal Slider")
            .locatedBy("//a[.='Horizontal Slider']");

    public static final Target SLIDER = Target
            .the("control deslizante horizontal")
            .locatedBy("//input[@type='range']");
}
