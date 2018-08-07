package MySingleton;

/**
 * Created by Yulya.Maksymiv_qa on 07.08.2018.
 */
public class MySingleton {
    private static MySingleton INSTANCE =
            new MySingleton();
    private MySingleton () {}

    public static MySingleton getInstance() {
        return INSTANCE;
    }
    public void sendMessage (String newEmail )
    {
        System.out.println("New Message" + newEmail);
    }
}


