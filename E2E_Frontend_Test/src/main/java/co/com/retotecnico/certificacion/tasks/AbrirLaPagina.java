package co.com.retotecnico.certificacion.tasks;


import co.com.retotecnico.certificacion.userinterfaces.InternetHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLaPagina {
    public static Performable principal() {
        return Open.url(InternetHomePage.URL);
    }
}