package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RedirectLinkPage {

    public static final Target LINK_REDIRECT = Target
            .the("enlace Redirect Link")
            .locatedBy("//a[.='Redirect Link']");

    public static final Target LINK_HERE = Target
            .the("enlace here")
            .locatedBy("//a[.='here']");

    public static final Target MENSAJE_RESULTADO = Target
            .the("mensaje de resultado")
            .locatedBy("//p");

    public static Target CODIGO(String codigo) {
        return Target.the("código " + codigo)
                .locatedBy("//a[.='" + codigo + "']");
    }

    private RedirectLinkPage() {
    }
}
