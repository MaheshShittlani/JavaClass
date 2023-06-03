import java.io.Serializable;

public class Account implements Serializable{
    private int id;
    private String name;
    private String accountNumber;
    transient private String password;

    public Account(int id, String name, String accountNumber, String password) {
        this.id = id;
        this.name = name;
        this.accountNumber = accountNumber;
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        if(password == null) {
            return "XXXXX";
        }
        return password;
    }
}
