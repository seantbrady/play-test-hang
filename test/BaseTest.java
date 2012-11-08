import org.junit.After;
import org.junit.Before;
import play.test.FakeApplication;

import static play.test.Helpers.*;

public class BaseTest {

    protected FakeApplication application;

    @Before
    public void setUp() {
        application = fakeApplication();
        try {
            System.out.println("Starting app...");
            start(application);
            System.out.println("Started app...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        com.avaje.ebeaninternal.server.lib.EbeanShutdownHack.shutdownAllActiveEbeanServers();
        stop(application);
    }
}
