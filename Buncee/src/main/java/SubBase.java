import org.openqa.selenium.By;

public class SubBase extends Base {
    



    public void loginToAccount() throws InterruptedException{

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/nav/div[2]/div[1]/a[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"input-username\"]")).sendKeys("write.alam@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Test@1234");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"btn-sign-in\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"header-profile-image\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"header-profile-image\"]")).click();
        Thread.sleep(3000);
    }

    public void logoutFromAccount() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"header-profile-image\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"reactjs-dashboard-generic\"]/div/div[1]/div[3]/div[4]/div[11]/a")).click();
        Thread.sleep(3000);
    }






}
