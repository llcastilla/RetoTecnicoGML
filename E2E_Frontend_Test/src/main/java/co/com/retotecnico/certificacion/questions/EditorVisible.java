package co.com.retotecnico.certificacion.questions;

import co.com.retotecnico.certificacion.userinterfaces.FramesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class EditorVisible implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        // 1. Entrar al iframe
        BrowseTheWeb.as(actor)
                .getDriver()
                .switchTo()
                .frame(FramesPage.IFRAME_EDITOR.resolveFor(actor));

        // 2. Validar visibilidad del cuerpo del editor
        boolean visible = FramesPage.EDITOR_BODY
                .resolveFor(actor)
                .isVisible();

        // 3. Volver siempre al contexto principal
        BrowseTheWeb.as(actor)
                .getDriver()
                .switchTo()
                .defaultContent();

        return visible;
    }

    public static EditorVisible ahora() {
        return new EditorVisible();
    }
}
