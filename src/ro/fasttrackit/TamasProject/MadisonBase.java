package ro.fasttrackit.TamasProject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

    public class MadisonBase {
        public MadisonBase() {
            open_Madison_Webpage();
        }

        public void open_Madison_Webpage(){
            Selenide.open("http://testfasttrackit.info/magento-test/");
        }

        public void open_Menu_Modal(){
            SelenideElement openMenu = $("a.skip-link.skip-account");
            openMenu.click();
        }

        public void open_Login_Modal(){
            open_Menu_Modal();
            SelenideElement clickLogin = $("a[title='Log In']");
            clickLogin.click();
        }

        public void open_Register_Modal(){
            open_Menu_Modal();
            SelenideElement clickRegister = $("a[title='Register']");
            clickRegister.click();
        }
    }

