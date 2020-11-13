
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TirstTest {

    @Test
    public void openGooglePage() {
        open("http://google.com");
    }
}
