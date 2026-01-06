package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.StatusCodesPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirStatusCodes {
    public static Performable paginaPrincipal() {
        return Open.url(StatusCodesPage.URL);
    }
}
