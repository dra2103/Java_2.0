import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {

        return "Hello, lovely to see you. How are you?";
    } 

    public String guestGreeting(String name) {
        String guestGreeting = String.format("Hello, %s. Lovely to see you.", name);

        return guestGreeting;
    }

    public String dateAnnouncement(){
        Date date = new Date();
        return "It is currently " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }

        if(conversation.indexOf("Alfred") > -1){
            return"At your service. As you wish, naturally";
        }

        return "Right. And with that I shall retire";
    }
}