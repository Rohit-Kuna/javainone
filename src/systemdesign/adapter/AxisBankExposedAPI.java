package systemdesign.adapter;

// @Component -> Springboot
public class AxisBankExposedAPI {
    private int balance;

    public AxisBankExposedAPI(int initialBalance){
        this.balance = initialBalance;
    }

    public boolean payMoney(int amount) throws IllegalArgumentException {
        if(amount<balance){
            System.out.println(String.format("Payment of amount %d is processed successful", amount));
            balance-=amount;
            return true;
        } else {
            throw new IllegalArgumentException(String.format("The amount to be paid is more than your balance: %d", balance));
        }
    } 

    public int seeBalance(){
        return this.balance;
    }
}
