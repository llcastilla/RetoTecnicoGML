
package co.com.bancolombia;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class TestParallel {

    private static final int WORKERS = 1;

    @Test
    void testAll() {
        Results results = Runner.path()
                .reportDir("target/karate-reports")
                .outputJunitXml(true)
                .outputCucumberJson(true)
                .relativeTo(getClass())
                .parallel(WORKERS);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }
}
