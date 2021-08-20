package ro.fasttrackit.TamasProject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public final class LoginMadison {
    private SelenideElement inputEmail = $("div.input-box #email");
    private SelenideElement inputPassword = $("div.input-box #pass");
    private SelenideElement loginButton = $("div.buttons-set #send2");
    private SelenideElement loginQuestion = $("div.content.fieldset h2");
    private SelenideElement loginNotification = $("div.content.fieldset p.form-instructions");


    public void questionMessage(){
        loginQuestion.shouldBe(Condition.visible);
        loginQuestion.shouldHave(Condition.exactText("ALREADY REGISTERED?"));
    }

    public void notificationMessage(){
        loginNotification.shouldBe(Condition.visible);
        loginNotification.shouldHave(Condition.exactText("If you have an account with us, please log in."));
    }

    public void inputEmail(String input){
        inputEmail.sendKeys(input);
    }

    public void isInputEmailVisible(){
        inputEmail.shouldBe(Condition.visible);
    }

    public void inputPassword(String input){
        inputPassword.sendKeys(input);
    }

    public void isInputPasswordVisible(){
        inputPassword.shouldBe(Condition.visible);
    }

    public void isLoginButtonEnabled(){
        loginButton.shouldBe(Condition.enabled);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
}

