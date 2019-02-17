import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AccountFeature extends SubBase {

    public AccountFeature() throws IOException {
    }

    @Test(priority = 1, enabled = false)
    public void login() throws Exception {
        try {
            loginToAccount();
        } catch (Exception e) {
            takeTheScreenshot(new Object() {
            }.getClass().getEnclosingMethod().getName());
        } finally {

        }
    }

    @Test(priority = 2, enabled = true)
    public void logout() throws InterruptedException {
        loginToAccount();
        logoutFromAccount();
        System.out.println("This is the logout page testcase");
    }


    @Test(priority = 3, enabled = false)
    public void free() throws InterruptedException {
        FreeItemMethod();

    }


    @Test(priority = 4, enabled = false)
    public void searchTest() throws InterruptedException {
        SearchCar();

    }

    @Test(priority = 5, enabled = false)
    public void activitiesTest() throws InterruptedException {
        activitiesMethod();

    }

    @Test(priority = 6, enabled = false)
    public void houseTest() throws InterruptedException {
        housingM();

    }

    @Test(priority = 7, enabled = false)
    public void SearchDCTest() throws InterruptedException {
        searchDC();

    }

    @Test(priority = 8, enabled = false)
    //public void searchCarDCTest() throws InterruptedException {
        public void searchCarDCTest() throws Exception {

        try {
            searchCarDC();
        } catch (Exception e) {
            takeTheScreenshot(new Object() {
            }.getClass().getEnclosingMethod().getName());
        } finally {

        }

    }

    @Test(priority = 9, enabled = false)
    public void govJobTest() throws InterruptedException {
        govJobM();

    }

    @Test(priority = 10, enabled = false)
    public void compGigTest() throws InterruptedException {
        compGig();

    }

    @Test(priority = 11, enabled = false)
    public void legalTest() throws InterruptedException {
        legal();

    }

    @Test(priority = 12, enabled = false)
    public void musicTest() throws InterruptedException {
        musicIns();

    }

    @Test(priority = 13, enabled = false)
    public void foundALost() throws InterruptedException {
        lostAndFound();

    }

    @Test(priority = 14, enabled = false)
    public void aboyCraiglistTest() throws InterruptedException {
        aboutCraig();

    }

    @Test(priority = 15, enabled = false)
    public void housingSwabTest() throws InterruptedException {
        housingSwab();

    }

    @Test(priority = 16, enabled = false)
    public void resumesTest() throws InterruptedException {
        resumes();

    }

    @Test(priority = 17, enabled = false)
    public void laborMoveTest() throws InterruptedException {
        laborMove();
    }

    @Test(priority = 18, enabled = false)
    public void jobPostTest() throws InterruptedException {
        createPost();
    }

    @Test(priority = 19, enabled = false)
    public void connectsTest() throws InterruptedException {
        craigConnects();
    }

    @Test(priority = 20, enabled = false)
    public void gigsEventTest() throws InterruptedException {
        gigsEvent();
    }

    @Test(priority = 21, enabled = false)
    public void termsTest() throws InterruptedException {
        terms();
    }

    @Test(priority = 22, enabled = false)
    public void safetyTest() throws InterruptedException {
        safety();
    }

    @Test(priority = 23, enabled = false)
    //public void feedbackTest() throws InterruptedException {

        public void feedbackTest() throws Exception {

            try {
                feedback();

            } catch (Exception e) {
                takeTheScreenshot(new Object() {
                }.getClass().getEnclosingMethod().getName());
            } finally {
//        try {
//            feedback();
//            Assert.assertEquals(driver.getTitle(), assert1);
//            takeTheScreenshot(new Object() {
//            }.getClass().getEnclosingMethod().getName());
//
//            Assert.assertEquals(driver.getTitle(), assert2);
//        } catch (Exception e) {
//
//            Assert.fail();
//
//
//            takeTheScreenshot(new Object() {
//            }.getClass().getEnclosingMethod().getName());
//
//        } finally {



            }
        }

        @Test(priority = 24, enabled = false)
        public void privacyTest () throws InterruptedException {
            privacy();

        }

        @Test(priority = 25, enabled = false)
        public void eventCalendarTest () throws InterruptedException {
            eventCalendar();

        }


    }
