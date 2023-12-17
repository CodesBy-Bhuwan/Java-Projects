import javax.swing.*;
public class Main {
    
    public static void main(String[] args){

        IDandPassword iDandPassword = new IDandPassword();

        LoginPortal loginPortal = new LoginPortal(iDandPassword.getLoginInfo());

    }
}
