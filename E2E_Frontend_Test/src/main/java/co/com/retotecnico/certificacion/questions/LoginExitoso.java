package co.com.retotecnico.certificacion.questions;

import co.com.retotecnico.certificacion.userinterfaces.FormAuthenticationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LoginExitoso implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return FormAuthenticationPage.MENSAJE_LOGIN_EXITOSO
                .resolveFor(actor)
                .isVisible();
    }

    public static LoginExitoso confirmado() {
        return new LoginExitoso();
    }
}
