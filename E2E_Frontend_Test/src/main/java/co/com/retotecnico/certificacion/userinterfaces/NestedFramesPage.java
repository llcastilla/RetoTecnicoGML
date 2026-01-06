package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NestedFramesPage {

    public static final Target LINK_NESTED_FRAMES = Target
            .the("enlace Nested Frames")
            .locatedBy("//a[.='Nested Frames']");

    private NestedFramesPage() {
    }
}
