package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class StatusCodesPage {

    public static final String URL = "https://the-internet.herokuapp.com/";

    public static final Target LINK_STATUS_CODES = Target
            .the("enlace Status Codes")
            .locatedBy("//a[.='Status Codes']");

    public static final Target LINK_200 = Target
            .the("enlace 200")
            .locatedBy("//a[.='200']");

    public static final Target LINK_301 = Target
            .the("enlace 301")
            .locatedBy("//a[.='301']");

    public static final Target LINK_404 = Target
            .the("enlace 404")
            .locatedBy("//a[.='404']");

    public static final Target LINK_500 = Target
            .the("enlace 500")
            .locatedBy("//a[.='500']");

    public static final Target LINK_HERE = Target
            .the("enlace here para volver")
            .locatedBy("//a[.='here']");

    public static Target MENSAJE_STATUS(String codigo) {
        return Target.the("mensaje de status " + codigo)
                .locatedBy("//p[contains(.,'This page returned a " + codigo + " status code.')]");
    }

    private StatusCodesPage() {
        // Evitar instanciación
    }
}
