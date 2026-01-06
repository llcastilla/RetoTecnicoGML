package co.com.retotecnico.certificacion.questions;

import co.com.retotecnico.certificacion.userinterfaces.ForgotPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SolicitudEnviada implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return ForgotPasswordPage.MENSAJE_CONFIRMACION
                .resolveFor(actor)
                .isVisible();
    }

    public static SolicitudEnviada exitosamente() {
        return new SolicitudEnviada();
    }
}
