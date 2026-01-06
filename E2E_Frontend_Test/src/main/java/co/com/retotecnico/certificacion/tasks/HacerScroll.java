package co.com.retotecnico.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HacerScroll implements Task {

    private final int pixeles;

    public HacerScroll(int pixeles) {
        this.pixeles = pixeles;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        JavascriptExecutor js =
                (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();

        js.executeScript("window.scrollBy(0, arguments[0]);", pixeles);

    }

    public static HacerScroll vertical(int pixeles) {
        return instrumented(HacerScroll.class, pixeles);
    }
}
