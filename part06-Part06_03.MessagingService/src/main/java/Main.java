
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService messages = new MessagingService();
        Message newMessage = new Message("Miro", "Kvo stava");
        Message message = new Message("Forko", "Epa, nishto!");
        messages.add(newMessage);
        messages.add(message);
        System.out.println(messages);
        
    }
}
