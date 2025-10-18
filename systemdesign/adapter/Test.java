package systemdesign.adapter;

import systemdesign.adapter.adapter_interface.ExternalBankExposedAPIHandler;

public class Test {
    public static void main(String[] args) {
        // Dependency inversion
        // Client is injecting the dependency
        int initialBalance = 1000;
        AxisBankExposedAPI axisBankExposedAPI = new AxisBankExposedAPI(initialBalance); // can be replaced with YesBank
        ExternalBankExposedAPIHandler externalExposedAPIHandler = new AxisBankExposedAPIHandler(axisBankExposedAPI); // right side can be changed to YesBank
        BankUPIService bankUPIService = new BankUPIService(externalExposedAPIHandler);
        bankUPIService.makePayment(10);
        System.out.println(bankUPIService.checkBalance());

    }
}
