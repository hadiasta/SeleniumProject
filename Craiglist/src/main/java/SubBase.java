import org.openqa.selenium.By;
import pageobject.Account;
import pageobject.HomePage;
import pageobject.Login;

import java.io.IOException;


public class SubBase extends Base {
    public String userNameFieldXPath = "#USERNAME";
    public String passwordFieldXpath = "#PASSWORD";
    public String testDataXpath = "C:\\Users\\sideeg\\Desktop\\Craiglist\\Craiglist\\src\\test\\TestData\\LoginInfo.xlsx";

    public SubBase() throws IOException {
        this.userNameFieldXPath = readFromExcel(this.testDataXpath, "Account", "B2");
        this.passwordFieldXpath = readFromExcel(this.testDataXpath, "Account", "C2");
    }

    public void loginToAccount() throws InterruptedException {
        driver.findElement(By.xpath(HomePage.loginLinkXPath)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(Login.userNameFieldXPath)).sendKeys(userNameFieldXPath);
        Thread.sleep(3000);
        driver.findElement(By.xpath(Login.passwordFieldXPath)).sendKeys(passwordFieldXpath);
        Thread.sleep(3000);
        driver.findElement(By.xpath(Login.loginButtonXPath)).click();
        Thread.sleep(3000);

    }

    public void logoutFromAccount() throws InterruptedException {
        driver.findElement(By.xpath(Account.LogoutButton)).click();
        Thread.sleep(3000);
    }

    public void FreeItemMethod() throws InterruptedException {

        //select free section
        driver.findElement(By.xpath("//*[@id=\"sss1\"]/li[2]/a/span")).click();
        Thread.sleep(3000);
        // selects first item
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[1]")).click();
        Thread.sleep(3000);
    }

    public void SearchCar() throws InterruptedException {

        //search for a car
        driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys("car");
        Thread.sleep(3000);
        // selects first car
        driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]")).click();
        Thread.sleep(3000);
        // selects first item
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[1]/a/div[1]/div/div[1]")).click();
        Thread.sleep(3000);
    }

    public void activitiesMethod() throws InterruptedException {
        // call log in method
        loginToAccount();
        // return to homepage
        driver.findElement(By.xpath("/html/body/article/header/a[1]")).click();
        Thread.sleep(3000);
        //select Activity from community section
        driver.findElement(By.xpath("//*[@id=\"ccc0\"]/li[1]/a")).click();
        Thread.sleep(3000);
        // selects first Activity
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[2]/p/a")).click();
        //email to a friend
        driver.findElement(By.xpath("/html/body/section/section/section/div[2]/p[4]/a")).click();
        Thread.sleep(3000);

    }

    public void housingM() throws InterruptedException {
        // call log in method
        loginToAccount();
        // return to homepage
        driver.findElement(By.xpath("/html/body/article/header/a[1]")).click();
        Thread.sleep(3000);
        //select hosing/appt
        driver.findElement(By.xpath("//*[@id=\"hhh0\"]/li[1]/a/span")).click();
        Thread.sleep(3000);
        // selects first house/appt
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[1]/a/div[1]/div/div[1]")).click();
        //email to a friend
        driver.findElement(By.xpath("/html/body/section/section/section/div[2]/p[4]/a")).click();
        Thread.sleep(3000);
    }

    public void searchDC() throws InterruptedException {
        // call log in method
//        loginToAccount();
        // return to homepage
//        driver.findElement(By.xpath("/html/body/article/header/a[1]")).click();
        Thread.sleep(3000);
        //select select US cities
        driver.findElement(By.xpath("//*[@id=\"rightbar\"]/ul/li[2]/h5")).click();
        Thread.sleep(3000);
        // selects DC
        driver.findElement(By.xpath("//*[@id=\"rightbar\"]/ul/li[2]/ul/li[23]/a")).click();
        Thread.sleep(3000);
    }

    public void searchCarDC() throws InterruptedException {

        searchDC();
        Thread.sleep(5000);
        //select car in the search box
        driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys("car");
        Thread.sleep(5000);
        // selects first car
        driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]")).click();
        Thread.sleep(5000);
        // selects first item
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[1]/a")).click();
        Thread.sleep(5000);
    }

    public void govJobM() throws InterruptedException {
        // selects gov job
        driver.findElement(By.xpath("//*[@id=\"jjj0\"]/li[12]/a/span")).click();
        Thread.sleep(3000);
        // selects first job
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[1]/p")).click();
        Thread.sleep(3000);
    }

    public void compGig() throws InterruptedException {
        // selects computer gig
        driver.findElement(By.xpath("//*[@id=\"ggg0\"]/li[1]/a/span")).click();
        Thread.sleep(3000);
        // selects first gig
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[1]")).click();
        Thread.sleep(3000);
    }

    public void legal() throws InterruptedException {
        // selects legal
        driver.findElement(By.xpath("//*[@id=\"bbb1\"]/li[2]/a/span")).click();
        Thread.sleep(3000);
        // selects first legal ad
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[1]")).click();
        Thread.sleep(3000);
    }

    public void politics() throws InterruptedException {
        // selects politics
        driver.findElement(By.xpath("//*[@id=\"ccc1\"]/li[5]/a/span")).click();
        Thread.sleep(3000);
        // selects first political ad
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[1]")).click();
        Thread.sleep(3000);
    }


    public void musicIns() throws InterruptedException {
        // selects music instrument
        driver.findElement(By.xpath("//*[@id=\"sss1\"]/li[12]/a/span")).click();
        Thread.sleep(3000);
        // selects first music post
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[2]/a/div[1]")).click();
        Thread.sleep(3000);
    }

    public void lostAndFound() throws InterruptedException {
        // selects lost&found
        driver.findElement(By.xpath("//*[@id=\"ccc1\"]/li[1]/a/span")).click();
        Thread.sleep(3000);
        // selects first item
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[1]/p/time")).click();
        Thread.sleep(3000);
    }

    public void aboutCraig() throws InterruptedException {
        // selects about craigslist
        driver.findElement(By.xpath("//*[@id=\"about_craigslist\"]/li[1]/a")).click();
        Thread.sleep(3000);
        // selects CL Help Pages
        driver.findElement(By.xpath("/html/body/div/section/table/tbody/tr[2]/td[1]/a")).click();
        Thread.sleep(3000);
        // how to post
        driver.findElement(By.xpath("/html/body/div/section/table/tbody/tr[1]/td[1]/ul/li[1]/a")).click();
        Thread.sleep(3000);
    }

    public void housingSwab() throws InterruptedException {
        // selects housing swab
        driver.findElement(By.xpath("//*[@id=\"hhh0\"]/li[1]")).click();
        Thread.sleep(3000);
        // selects first item
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[1]")).click();
        Thread.sleep(3000);
    }

    public void resumes() throws InterruptedException {
        // selects resumes
        driver.findElement(By.xpath("//*[@id=\"rrr\"]/h4/a/span")).click();
        Thread.sleep(3000);
        // selects reset
        driver.findElement(By.xpath("//*[@id=\"searchform\"]/div[2]/div/div[3]/a")).click();
        Thread.sleep(3000);
        // selects first item
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[1]/p/time")).click();
        Thread.sleep(3000);
    }

    public void laborMove() throws InterruptedException {
        // selects Services/ labor + move
        driver.findElement(By.xpath("//*[@id=\"bbb1\"]/li[1]")).click();
        Thread.sleep(3000);
        // selects first item
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[1]/p/time")).click();
        Thread.sleep(3000);
    }

    public void createPost() throws InterruptedException {
        // selects create a post
        driver.findElement(By.xpath("//*[@id=\"post\"]")).click();
        Thread.sleep(3000);
        // selects first item
        driver.findElement(By.xpath("/html/body/article/section/form/ul/li[1]/label/span[1]/input")).click();
        Thread.sleep(3000);
        // selects first item
        driver.findElement(By.xpath("//*[@id=\"new-edit\"]/div/label/label[1]/input")).click();
        Thread.sleep(3000);
        // selects continue button
        driver.findElement(By.xpath("//*[@id=\"new-edit\"]/div/div[3]/div/button")).click();
        Thread.sleep(3000);
    }

    public void craigConnects() throws InterruptedException {
        // selects connects
        driver.findElement(By.xpath("//*[@id=\"about_craigslist\"]/li[8]/a")).click();
        Thread.sleep(3000);
        // selects home tab
        driver.findElement(By.xpath("//*[@id=\"menu-item-6\"]/a")).click();
        Thread.sleep(3000);
    }

    public void gigsEvent() throws InterruptedException {
        // selects gigs event
        driver.findElement(By.xpath("//*[@id=\"ggg1\"]/li[1]/a/span")).click();
        Thread.sleep(3000);
        // selects first item
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[1]/p/time")).click();
        Thread.sleep(3000);
    }

    public void terms() throws InterruptedException {
        // selects terms
        driver.findElement(By.xpath("/html/body/div/footer/ul/li[7]/a")).click();
        Thread.sleep(3000);
        // selects about
        driver.findElement(By.xpath("/html/body/div/header/div/a[2]")).click();
        Thread.sleep(3000);
        // select using craigslist
        driver.findElement(By.xpath("/html/body/div/section/table/tbody/tr[2]/td[1]/a")).click();
        Thread.sleep(3000);
        // select how to post
        driver.findElement(By.xpath("/html/body/div/section/table/tbody/tr[1]/td[1]/ul/li[1]/a")).click();
        Thread.sleep(3000);
        //select the help tab
        driver.findElement(By.xpath("/html/body/div/header/nav/ul/li[2]/p/a")).click();
        Thread.sleep(3000);
    }

    public void safety() throws InterruptedException {
        // selects Safety
        driver.findElement(By.xpath("/html/body/div/footer/ul/li[3]")).click();
        Thread.sleep(3000);
        // selects first item personal safety
        driver.findElement(By.xpath("/html/body/div/section/p[1]/strong/a[1]")).click();
        Thread.sleep(3000);
        // avoiding scams
        driver.findElement(By.xpath("/html/body/div/section/p[1]/strong/a[1]")).click();
        Thread.sleep(3000);
    }

    public void feedback() throws InterruptedException {
        // selects feedback
        driver.findElement(By.xpath("/html/body/div/footer/ul/li[5]/a")).click();
        Thread.sleep(5000);
        // search for rating
        driver.findElement(By.xpath("//*[@id=\"SQ\"]")).sendKeys("rating");
        Thread.sleep(5000);
        // clicks search this form button
        driver.findElement(By.xpath("/html/body/div/div[2]/form/input[3]")).click();
        Thread.sleep(3000);
    }

    public void privacy() throws InterruptedException {
        // selects privacy
        driver.findElement(By.xpath("/html/body/div/footer/ul/li[4]/a")).click();
        Thread.sleep(3000);
        // selects terms of use
        driver.findElement(By.xpath("/html/body/div/section/section/p/a[1]")).click();
        Thread.sleep(3000);
    }

    public void eventCalendar() throws InterruptedException {
        // selects events/calendar
        driver.findElement(By.xpath("//*[@id=\"calban\"]/a")).click();
        Thread.sleep(3000);
        // selects the first event
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[1]/p/a")).click();
        Thread.sleep(3000);
    }
}

