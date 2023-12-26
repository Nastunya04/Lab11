package task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private MailSender sender = new MailSender();
    private List<MailInfo> mailList = new ArrayList<>();

    public MailBox() {
        sender = new MailSender();
        mailList = new ArrayList<>();
    }

    public void addMailInfo(MailInfo info) {
        if (mailList.contains(info)) {
            System.out.println("Request already exists");
        } else {
            mailList.add(info);
        }
    }

    public void sendAllMails() {
        for (MailInfo mail : mailList) {
            sender.sendMail(mail);
        }
    }
}
