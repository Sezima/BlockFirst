package w1;

public class MeetingInvitation {
    public static void main(String[] args) {
        String inviter = "Steve Jobs";
        String invitee = "WeDevx Student";
        String topic = "Apple Pay Planning";
        String invitationEmail = "Dear " + invitee + ", \n" + inviter +
                " is inviting you to " + topic + "meeting.";
        System.out.println(invitationEmail);
    }
}
