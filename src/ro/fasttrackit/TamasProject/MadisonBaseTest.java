package ro.fasttrackit.TamasProject;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class MadisonBaseTest extends tamasProject.MadisonBase {
    @Test
    public void can_open_menu_modal(){
        open_Menu_Modal();
    }

    @Test
    public void can_open_login_modal(){
        open_Login_Modal();
    }

    @Test
    public void can_open_register_modal(){
        open_Register_Modal();
    }

    @Test
    public void can_login_with_valid_credentials(){
        tamasProject.LoginMadison loginMadison = new tamasProject.LoginMadison();
        open_Login_Modal();
        loginMadison.questionMessage();
        loginMadison.notificationMessage();
        loginMadison.inputEmail("simo_attilatamas@yahoo.com");
        loginMadison.isInputEmailVisible();
        loginMadison.inputPassword("kolozsvar");
        loginMadison.isInputPasswordVisible();
        loginMadison.isLoginButtonEnabled();
        loginMadison.clickLoginButton();
    }

    @Test
    public void can_register_an_account(){
        tamasProject.RegisterMadison registerMadison = new tamasProject.RegisterMadison();
        open_Register_Modal();
        registerMadison.registerSectionLabel();
        registerMadison.registerNotificationMessage();
        registerMadison.inputFirstName("Simo");
        registerMadison.isFirstNameVisible();
        registerMadison.inputLastName("Attila Tamas");
        registerMadison.isLastNameVisible();
        registerMadison.inputEmail("simo_tamas2007@yahoo.com");
        registerMadison.isEmailVisible();
        registerMadison.inputPassword("realmadrid");
        registerMadison.inputConfirmPassword("realmadrid");
        registerMadison.arePasswordAndConfirmPasswordVisible();
        registerMadison.notConfirmRegisterClickBack();
        sleep(5000);


    }


}

