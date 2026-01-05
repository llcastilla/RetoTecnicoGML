package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EntryAdPage {

    public static final Target BOTON_CLOSE = Target
            .the("botón para cerrar el modal de Entry Ad")
            .locatedBy("//p[.='Close']");


    public static final Target LINK_ENTRY_AD = Target
            .the("enlace Entry Ad")
            .locatedBy("//a[.='Entry Ad']");


    private EntryAdPage() {
    }
}
