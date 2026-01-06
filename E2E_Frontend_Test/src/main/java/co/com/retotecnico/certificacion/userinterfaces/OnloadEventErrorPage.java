package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OnloadEventErrorPage {

    public static final Target LINK_ONLOAD_EVENT_ERROR = Target
            .the("enlace JavaScript onload event error")
            .locatedBy("//a[.='JavaScript onload event error']");

    private OnloadEventErrorPage() {
    }
}
