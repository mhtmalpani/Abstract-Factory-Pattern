package main;

import factory.CardType;
import factory.CreditCard;
import factory.CreditCardFactory;
import factory.Validator;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        CreditCardFactory creditCardFactory;
        CreditCard creditCard;
        Validator validator;

        /*
          AMEX GOLD
         */
        creditCardFactory = CreditCardFactory.getCreditCardFactory(1000);
        creditCard = creditCardFactory.getCreditCard(CardType.GOLD);
        SOPL(String.valueOf(creditCard.getClass()));

        /*
          AMEX PLATINUM
         */
        creditCardFactory = CreditCardFactory.getCreditCardFactory(1000);
        creditCard = creditCardFactory.getCreditCard(CardType.PLATINUM);
        SOPL(String.valueOf(creditCard.getClass()));
        creditCard.setCardNumberLength(16);
        SOPL(String.valueOf(creditCard.getCardNumberLength()));



        /*
          VISA GOLD
         */
        creditCardFactory = CreditCardFactory.getCreditCardFactory(100);
        creditCard = creditCardFactory.getCreditCard(CardType.GOLD);
        validator = creditCardFactory.getValidator(CardType.GOLD);
        SOPL(String.valueOf(creditCard.getClass()));
        SOPL(String.valueOf(validator.getClass()));
        SOPL(String.valueOf(validator.isValid(creditCard)));


        /*
          VISA PLATINUM
         */
        creditCardFactory = CreditCardFactory.getCreditCardFactory(100);
        creditCard = creditCardFactory.getCreditCard(CardType.PLATINUM);
        validator = creditCardFactory.getValidator(CardType.PLATINUM);
        SOPL(String.valueOf(creditCard.getClass()));
        SOPL(String.valueOf(validator.getClass()));
        SOPL(String.valueOf(validator.isValid(creditCard)));
    }

    private static void SOPL(String data) {
        System.out.println(data);
    }

}
