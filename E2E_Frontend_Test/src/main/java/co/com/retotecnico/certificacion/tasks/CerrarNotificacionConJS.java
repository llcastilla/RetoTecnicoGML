package co.com.retotecnico.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CerrarNotificacionConJS implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        JavascriptExecutor js =
                (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();

        String script =
                "var btn = document.querySelector(\"button[class*='tox-notification__dismiss']\");" +
                        "if (btn) { btn.click(); return 'Notificación cerrada'; }" +
                        "else { return 'No existe notificación'; }";

        Object resultado = js.executeScript(script);

        System.out.println("Resultado JS: " + resultado);
    }

    public static CerrarNotificacionConJS ahora() {
        return instrumented(CerrarNotificacionConJS.class);
    }
}
