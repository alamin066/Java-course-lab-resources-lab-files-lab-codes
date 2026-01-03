
class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}


public class Task4_id_066 {


    public static void checkEligibility(int age) throws UnderageException {
        if (age < 18) {
            throw new UnderageException("Age is less than 18. Not eligible to vote.");
        }
        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {
        int age = 13;

        try {
            checkEligibility(age);
        } catch (UnderageException e) {
            System.out.println(e.getMessage());
        }
    }
}
