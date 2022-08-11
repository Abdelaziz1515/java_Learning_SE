package factory;

public class BankFactory implements IbankFactory {

    @Override
    public iBank Getbank(String bank) {
        switch (bank){
            case "123456":return new BankA();
            case "111222":return new BankB();
        }
        return null;


    }
}
