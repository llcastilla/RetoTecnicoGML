package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class JQueryUiMenusPage {

    public static final Target LINK_JQUERY_UI_MENUS =
            Target.the("enlace JQuery UI Menus")
                    .locatedBy("//a[.='JQuery UI Menus']");

    public static final Target OPTION_DISABLED =
            Target.the("opción Disabled")
                    .locatedBy("//a[.='Disabled']");

    public static final Target OPTION_ENABLED =
            Target.the("opción Enabled")
                    .locatedBy("//a[.='Enabled']");

    public static final Target OPTION_DOWNLOADS =
            Target.the("opción Downloads")
                    .locatedBy("//a[.='Downloads']");

    public static final Target OPTION_PDF =
            Target.the("opción PDF")
                    .locatedBy("//a[.='PDF']");

    public static final Target OPTION_CSV =
            Target.the("opción CSV")
                    .locatedBy("//a[.='CSV']");

    public static final Target OPTION_EXCEL =
            Target.the("opción Excel")
                    .locatedBy("//a[.='Excel']");
}
