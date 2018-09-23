import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AccountFeature extends SubBase {

    @Test
    public void login() throws Exception {

        loginToAccount();
        takeTheScreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test
    public void logout() throws InterruptedException {
        loginToAccount();
        logoutFromAccount();
    }








//    @Test
//    public void addAddress() throws InterruptedException {
//
//        loginToAccount();
//
//
//
//
//    }



//
//    @Test
//    public void changeName() throws InterruptedException {
//
//
//    }






}
