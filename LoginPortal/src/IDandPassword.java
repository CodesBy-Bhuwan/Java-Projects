import java.util.HashMap;
import javax.swing.*;
import java.util.*;

public class IDandPassword {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPassword(){
        // These are username and passwords
        logininfo.put("admin", "admin");
        logininfo.put("Myself", "meyou");
        logininfo.put("Adme", "asdf12");
    }
    protected HashMap getLogininfo() {
        return logininfo;
    }
}
