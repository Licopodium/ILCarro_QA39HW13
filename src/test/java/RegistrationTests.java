import models.User;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

@Test
    public void registrationPositive(){
    int i = (int)(System.currentTimeMillis()/1000)%3600;

    User user = new User()
            .withName("Janna")
            .withLastName("Qween")
            .withEmail("Jannaqw_" + i + "@mail.com")
            .withPassword("$9873923");

    openRegistrationForm();
    fillRegistrationForm(user);
    submitRegistration();
}
}