package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.DynamicLoadingPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class RegresarADynamicLoading {

    public static Performable ahora() {
        return Open.url(DynamicLoadingPage.URL);
    }
}
