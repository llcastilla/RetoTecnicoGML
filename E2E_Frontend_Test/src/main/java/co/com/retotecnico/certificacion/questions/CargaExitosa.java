package co.com.retotecnico.certificacion.questions;

import co.com.retotecnico.certificacion.userinterfaces.FileUploadPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CargaExitosa implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return FileUploadPage.MENSAJE_EXITO.resolveFor(actor).isVisible();
    }

    public static CargaExitosa fueExitosa() {
        return new CargaExitosa();
    }
}
