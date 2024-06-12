package bank;
class Accounts {
    public String name;
    protected String email;
    private String password;

    //Getters and setters
    public String getPassword() {
        return this.password;
    }
    public void setPassword (String pass) {
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Accounts account1 = new Accounts();
            account1.name = "Hello";
            account1.email = "test@gmail.com";
            // account1.password = "1234";    //Shows error due to private
            account1.setPassword("abcd");
            System.out.println(account1.getPassword());
    }
}
