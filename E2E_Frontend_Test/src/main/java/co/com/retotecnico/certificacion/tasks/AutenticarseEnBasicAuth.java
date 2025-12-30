package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.BasicAuthPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class AutenticarseEnBasicAuth {
    public static Performable conCredencialesCorrectas() {
        return Open.url(BasicAuthPage.URL);
    }
}