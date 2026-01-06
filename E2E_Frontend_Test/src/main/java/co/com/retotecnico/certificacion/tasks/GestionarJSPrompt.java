package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.JavaScriptAlertsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GestionarJSPrompt implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(JavaScriptAlertsPage.BTN_JS_PROMPT)
        );

        Alert alertAceptar = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
        alertAceptar.sendKeys("Accept the popup!!!");
        alertAceptar.accept();

        actor.attemptsTo(
                Click.on(JavaScriptAlertsPage.BTN_JS_PROMPT)
        );

        Alert alertCancelar = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
        alertCancelar.sendKeys("Don't Accept the popup!!!");
        alertCancelar.dismiss();
    }

    public static GestionarJSPrompt completo() {
        return instrumented(GestionarJSPrompt.class);
    }
}
