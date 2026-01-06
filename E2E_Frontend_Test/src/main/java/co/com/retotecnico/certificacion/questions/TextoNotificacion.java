package co.com.retotecnico.certificacion.questions;

import co.com.retotecnico.certificacion.userinterfaces.NotificationMessagesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TextoNotificacion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return NotificationMessagesPage.MENSAJE_NOTIFICACION
                .resolveFor(actor)
                .getText();
    }

    public static TextoNotificacion es() {
        return new TextoNotificacion();
    }
}
