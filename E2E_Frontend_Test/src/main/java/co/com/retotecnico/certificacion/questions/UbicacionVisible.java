package co.com.retotecnico.certificacion.questions;

import co.com.retotecnico.certificacion.userinterfaces.GeolocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class UbicacionVisible implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return GeolocationPage.RESULTADO
                .resolveFor(actor)
                .isVisible();
    }

    public static UbicacionVisible ahora() {
        return new UbicacionVisible();
    }
}
