import com.grailsrocks.functionaltest.BrowserTestCase

/**
 * Created by aistomin on 17.1.15.
 */
class SystemVariablesTest extends BrowserTestCase {

    void testSystemVariables() {
        post('/test')
        assertEquals(200, response.statusCode)
        // check that -Dtest_variable=test was applied correctly.
        assertEquals('test', System.getProperty('test_variable'))
    }
}
