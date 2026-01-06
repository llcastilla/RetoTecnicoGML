package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.InfiniteScrollPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrAInfiniteScroll implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InfiniteScrollPage.LINK_INFINITE_SCROLL)
        );
    }

    public static IrAInfiniteScroll ahora() {
        return instrumented(IrAInfiniteScroll.class);
    }
}
