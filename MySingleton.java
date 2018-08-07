public class MySingleton {
    private static MySingleton INSTANCE =
            new MySingleton();
    protected MySingleton () {}

    public static MySingleton getInstance() {
        return INSTANCE;
    }
    public void sendMessage (String newEmail )
    {
        System.out.println("New Message" + newEmail);
    }
}

public class Main {
    public static void main(String[] args) {
        MySingleton.getInstance().sendMessage("Hello world");

    }

}

