package TResourceBundle.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
      System.out.println(Locale.getDefault());
      ResourceBundle bundle =  ResourceBundle.getBundle("message", new Locale("pt", "BR"));
    
    }

}
