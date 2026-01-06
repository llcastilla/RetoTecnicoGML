package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.SlowResourcesPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirSlowResources {
    public static Performable paginaPrincipal() {
        return Open.url(SlowResourcesPage.URL);
    }
}
