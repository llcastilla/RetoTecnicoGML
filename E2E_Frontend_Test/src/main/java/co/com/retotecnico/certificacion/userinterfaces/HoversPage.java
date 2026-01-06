package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HoversPage {

    public static final Target LINK_HOVERS = Target
            .the("enlace Hovers")
            .locatedBy("//a[.='Hovers']");

    public static final Target AVATARS = Target
            .the("avatares de usuario")
            .locatedBy("//img[@alt='User Avatar']");
}
