package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.SecureFileDownloadPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirSecureFileDownload {
    public static Performable pagina() {
        return Open.url(SecureFileDownloadPage.URL);
    }
}
