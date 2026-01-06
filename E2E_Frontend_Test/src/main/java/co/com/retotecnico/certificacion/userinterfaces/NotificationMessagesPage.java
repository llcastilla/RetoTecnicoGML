package co.com.retotecnico.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NotificationMessagesPage {

    public static final Target LINK_NOTIFICATION_MESSAGES = Target
            .the("enlace Notification Messages")
            .locatedBy("//a[.='Notification Messages']");

    public static final Target BOTON_CLICK_HERE = Target
            .the("botón Click here")
            .locatedBy("//a[.='Click here']");

    public static final Target MENSAJE_NOTIFICACION = Target
            .the("mensaje de notificación")
            .locatedBy("//div[@id='flash']");

    private NotificationMessagesPage() {
    }
}
