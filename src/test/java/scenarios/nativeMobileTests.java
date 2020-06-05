package scenarios;

import org.testng.annotations.Test;
import setup.BaseTest;

public class nativeMobileTests extends BaseTest {

    @Test(groups = {"native"}, description = "This simple test just click on the Sign In button")
    public void simpleNativeTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException, InterruptedException {

        getPo().getWelement("registerButton").click();
        getPo().getWelement("registrationEmail").sendKeys("sunset33@com");
        getPo().getWelement("registrationUserName").sendKeys("allex");
        getPo().getWelement("registrationPassword").sendKeys("8765421!");
        getPo().getWelement("registrationConfirmPassword").sendKeys("8765421!");
        getPo().getWelement("registerNewAccountButton").click();
        getPo().getWelement("loginEmail").sendKeys("sunset33@com");
        getPo().getWelement("loginPassword").sendKeys("8765421!");
        getPo().getWelement("signInButton").click();
        String pageText = getPo().getWelement("pageText").getText();
        System.out.println(pageText);
        Thread.sleep(10000);

        assert (pageText.equals("BudgetActivity"));
        System.out.println("Simple Android native test done");

    }

}
