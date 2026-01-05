package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DynamicContentPage {

    public static final Target LINK_DYNAMIC_CONTENT = Target
            .the("enlace Dynamic Content")
            .locatedBy("//a[.='Dynamic Content']");

    public static final Target LINK_CLICK_HERE = Target
            .the("enlace click here")
            .locatedBy("//a[.='click here']");

    public static final Target CONTENIDO_DINAMICO = Target
            .the("contenido dinámico")
            .locatedBy("//div[@class='large-10 columns']");

    private DynamicContentPage() {
    }
}
