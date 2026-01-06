package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.NotificationMessagesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarANotificationMessages implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NotificationMessagesPage.LINK_NOTIFICATION_MESSAGES)
        );
    }

    public static IngresarANotificationMessages ahora() {
        return instrumented(IngresarANotificationMessages.class);
    }
}
