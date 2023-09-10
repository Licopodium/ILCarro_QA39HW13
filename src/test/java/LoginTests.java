import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import models.User;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void precondition(){
    if(isLogged()) logout();
    }

    @Test
    public void loginPositiveTest() {
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        User user = new User()
                .withEmail("Jannaqw@mail.com")
                .withPassword("$9873923");

        openLoginForm();
        fillLoginForm(user);
        submitLogin();
        Assert.assertTrue(isLoggedSuccess());
    }

    @Test
    public void loginPositiveTest1() {
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        User user = new User()
                .withEmail("Jannaqw@mail.com")
                .withPassword("$9873923");

        openLoginForm();
        fillLoginForm(user);
        submitLogin();
        Assert.assertTrue(isLoggedSuccess());
    }

    @AfterMethod
    public void postcondition(){
        clickOkButton();
    }

}

