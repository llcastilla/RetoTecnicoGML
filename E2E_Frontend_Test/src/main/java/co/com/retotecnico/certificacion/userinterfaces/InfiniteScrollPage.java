package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InfiniteScrollPage {

    public static final Target LINK_INFINITE_SCROLL = Target
            .the("enlace Infinite Scroll")
            .locatedBy("//a[.='Infinite Scroll']");
}
