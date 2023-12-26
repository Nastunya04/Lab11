package task2;

public class GiftGreeting implements MailCode {
    @Override
    public String generateText() {
        return "Congratulations, you won a Christmas gift!!!";
    }
}
