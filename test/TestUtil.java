import models.MyModel;
import org.joda.time.DateTime;

import static org.fest.assertions.Assertions.assertThat;

public class TestUtil {

    public static void doTest() {
        System.out.println("Doing test...");

        MyModel m = new MyModel();
        m.name = "Model #" + DateTime.now().getMillis();
        m.save();

        MyModel newM = MyModel.find.byId(m.id);
        System.out.println(newM.name);

        assertThat(true).isTrue();
    }
}
