package ro.fasttrackit.TamasProject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


    public final class RegisterMadison {

        private SelenideElement registerLabel = $("div.page-title h1");
        private SelenideElement registerNotification = $("div.fieldset p.form-instructions");
        private SelenideElement inputFirstName = $("div.input-box input#firstname");
        private SelenideElement inputLastName = $("div.input-box input#lastname");
        private SelenideElement inputEmail = $("div.input-box input#email_address");
        private SelenideElement inputPassword = $("div.input-box input#password");
        private SelenideElement confirmPassword = $("div.input-box input#confirmation");
        private SelenideElement backButton = $("a.back-link");

        public void registerSectionLabel() {
            registerLabel.shouldBe(Condition.visible);
            registerLabel.shouldHave(Condition.exactText("CREATE AN ACCOUNT"));
        }

        public void registerNotificationMessage(){
            registerNotification.shouldBe(Condition.visible);
            registerNotification.
                    shouldHave(Condition.exactText("Please enter the following information to create your account."));
        }

        public void inputFirstName(String input){
            inputFirstName.sendKeys(input);
        }

        public void isFirstNameVisible(){
            inputFirstName.shouldBe(Condition.visible);
        }

        public void inputLastName(String input){
            inputLastName.sendKeys(input);
        }

        public void isLastNameVisible(){
            inputLastName.shouldBe(Condition.visible);
        }

        public void inputEmail(String input){
            inputEmail.sendKeys(input);
        }

        public void isEmailVisible(){
            inputEmail.shouldBe(Condition.visible);
        }

        public void inputPassword(String input){
            inputPassword.sendKeys(input);
        }

        public void inputConfirmPassword(String input){
            confirmPassword.sendKeys(input);
        }

        public void arePasswordAndConfirmPasswordVisible(){
            inputPassword.shouldBe(Condition.visible);
            confirmPassword.shouldBe(Condition.visible);
        }

        public void notConfirmRegisterClickBack(){
            backButton.shouldBe(Condition.enabled);
            backButton.click();
        }
}

