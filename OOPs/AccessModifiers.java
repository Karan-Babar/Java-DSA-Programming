package OOPs;

public class AccessModifiers {
    
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "karan"; 
        System.out.println(myAcc.userName);
        // myAcc.password = "karan@123"; // password not accessible.
        myAcc.setPassword("karan@123"); //you can set the password but not access.
    }
}

class BankAccount{
    public String userName; //Accessible for any one
    private String password; //only Accessible for class

    public void setPassword(String pwd){
        password = pwd;
    }
}
 