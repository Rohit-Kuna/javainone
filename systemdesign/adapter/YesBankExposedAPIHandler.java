package systemdesign.adapter;

import systemdesign.adapter.adapter_interface.ExternalBankExposedAPIHandler;

public class YesBankExposedAPIHandler implements ExternalBankExposedAPIHandler{

    private final YesBankExposedAPI yesBankExposedAPI;

    YesBankExposedAPIHandler(YesBankExposedAPI yesBankExposedAPI){
        this.yesBankExposedAPI=yesBankExposedAPI;
    }

    @Override
    public boolean pay(int amount) {
        try {
            return yesBankExposedAPI.payAmount(amount);
        } catch(IllegalArgumentException e) {
            System.out.println("Payment failed");
            return false;
        }
    }

    @Override
    public int checkBalance() {
        return yesBankExposedAPI.viewBalance();
    }
}
