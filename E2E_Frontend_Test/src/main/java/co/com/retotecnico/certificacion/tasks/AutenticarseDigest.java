package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.DigestAuthPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class AutenticarseDigest {

    public static Performable conCredenciales() {
        return Open.url(DigestAuthPage.URL);
    }
}
