package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.JQueryUiMenusPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DescargarArchivosJQuery implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Hover.over(JQueryUiMenusPage.OPTION_ENABLED),
                Hover.over(JQueryUiMenusPage.OPTION_DOWNLOADS),

                Hover.over(JQueryUiMenusPage.OPTION_PDF),
                Click.on(JQueryUiMenusPage.OPTION_PDF),

                Hover.over(JQueryUiMenusPage.OPTION_ENABLED),
                Hover.over(JQueryUiMenusPage.OPTION_DOWNLOADS),
                Hover.over(JQueryUiMenusPage.OPTION_CSV),
                Click.on(JQueryUiMenusPage.OPTION_CSV),

                Hover.over(JQueryUiMenusPage.OPTION_ENABLED),
                Hover.over(JQueryUiMenusPage.OPTION_DOWNLOADS),
                Hover.over(JQueryUiMenusPage.OPTION_EXCEL),
                Click.on(JQueryUiMenusPage.OPTION_EXCEL)
        );
    }

    public static DescargarArchivosJQuery ahora() {
        return instrumented(DescargarArchivosJQuery.class);
    }
}
