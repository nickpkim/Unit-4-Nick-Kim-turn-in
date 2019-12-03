import java.text.DecimalFormat;
public class Bank{
    private DecimalFormat fmt = new DecimalFormat(".00");
    private int accNum;
    private String name;
    private String email;
    private String pass;
    private double balance;
    public Bank(int newAccNum, String newName, String newEmail, String newPass, double newBalance){
        accNum = newAccNum;
        name = newName;
        email = newEmail;
        pass = newPass;
        balance = newBalance;
    }
    /*public int getAccNum(){
      return accNum;
    }
    public String getName(){
      return name;
    }
    public String getEmail(){
      return email;
    }
    public String getPass(){
      return pass;
    }
    public double getMuni(){
      return muni;
    }*/
    public void setPass(String newPass){
      pass = newPass;
    }
    public void deposit(double $){
      balance += $;
      System.out.println("\nDeposited: $"+fmt.format($)+"\n");
    }
    public void withdraw(double $){
      balance -= $;
      System.out.println("\nWithdrew: $"+fmt.format($)+"\n");
    }
    public void getAcc(){
      String str = "";
      str += "Account #: "+accNum+"\n";
      str += "Owner: "+name+"\n";
      str += "E-mail: "+email+"\n";
      str += "Balance: "+fmt.format(balance)+"\n";
      System.out.println(str);
    }
    public String toString(){
      String str = "";
      str += "Account #: "+accNum+"\n";
      str += "Owner: "+name+"\n";
      str += "E-mail: "+email+"\n";
      str += "Balance: "+fmt.format(balance)+"\n";
      return str;
    }
}
