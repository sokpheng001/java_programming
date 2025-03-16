package oopLesson;

interface Service{
    default void  test(){};
    void convertRielToDollar(Double riel);
    void convertDollarToRiel(Double dollar);
}
class CurrencyExchange implements Service{
    @Override
    public void convertRielToDollar(Double riel) {
        System.out.println("Result of dollar: " + (riel/4000));
    }
    @Override
    public void convertDollarToRiel(Double dollar) {
        System.out.println("Result in riel: " + (dollar*4000));
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
//        Service currencyExchange = new CurrencyExchange();
        CurrencyExchange currencyExchange = new CurrencyExchange();
        currencyExchange.convertDollarToRiel(34d);
        currencyExchange.convertRielToDollar(50000d);
    }
}
