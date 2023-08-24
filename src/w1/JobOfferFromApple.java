package w1;

public class JobOfferFromApple {
    public static void main(String[] args) {
        String candidateName = "WeDevX Graduate";
        double salary = 180000.0;
        int stockOptions = 2340;
        int annualBonus = 15000;

        String offerLetter = "Dear " + candidateName +
                ",\nApple is delighted to offer you the position of Software Quality Engineer.\nYou will receive an annual salary of $" + salary +
                "\n" + stockOptions + " stock options and annual bonus of " + annualBonus;
        System.out.println(offerLetter);


        System.out.println();
        System.out.printf("Dear %s,\nApple is delighted to offer you the position of Software Quality Engineer.\nYou will receive an annual salary of $%s\n%s stock options and annual bonus of %s", candidateName, salary, stockOptions, annualBonus);

    }
}
