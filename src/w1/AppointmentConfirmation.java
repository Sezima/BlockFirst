package w1;

public class AppointmentConfirmation {
    public static void main(String[] args) {
        boolean isConfirmed = true;
        if (isConfirmed){
            System.out.println("You have an appointment at 13:45, do you confirm it? Enter true/false\n" +
                    "Appointment status: Confirmed! See you Soon.");
        } else{
            System.out.println("You have an appointment at 13:45, do you confirm it? Enter true/false\n" +
                    "Appointment status: Not confirmed Please confirm your appointment as soon as possible.");
        }
    }
}
