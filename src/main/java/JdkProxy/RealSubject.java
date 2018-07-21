package JdkProxy;

import java.util.HashMap;
import java.util.Hashtable;

public class RealSubject implements Subject {
    HashMap hashMap = new HashMap();
    Hashtable hashtable = new Hashtable();

    public void rent() {
        System.out.println("rent");
    }


    public void hello(String str) throws Exception {
        System.out.println("hello: " + str);
    }
}
