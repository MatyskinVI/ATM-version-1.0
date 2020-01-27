import com.Matyskin.screen.*;

public class UserInterfeceTest {
    public static void main(String[] args) {
        ShowBalanceScreen showBalanceScreen = new ShowBalanceScreen();
        InputMoneyScreen inputMoneyScreen = new InputMoneyScreen();
        ReturnCardScreen returnCardScreen = new ReturnCardScreen();
        SelectActionScreen selectActionScreen = new SelectActionScreen();
        PinCodeInputScreen pinCodeInputScreen = new PinCodeInputScreen();
        showBalanceScreen.showUserInterface();
        System.out.println("------------------------------------------------------ShowBalanceScreen is succesfull");
        inputMoneyScreen.showUserInterface();
        System.out.println("------------------------------------------------------InputMoneyScreen is succesfull");
        returnCardScreen.showUserInterface();
        System.out.println("------------------------------------------------------ReturnCardScreen is succesfull");
        selectActionScreen.showUserInterface();
        System.out.println("------------------------------------------------------SelectActionScreen is succesfull");
        pinCodeInputScreen.showUserInterface();
        System.out.println("------------------------------------------------------PinCodeInputScreen is succesfull");
    }
}
