package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class MailService {
    private JavaMailSender javaMailSender;

    @Autowired
    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }
    
    public void sendEmail(String mailAddress,String message,String subject) throws MailException {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(mailAddress);
        mail.setFrom("dhruv.1610051@kiet.edu");
        mail.setSubject(subject);
        mail.setText(message);
        javaMailSender.send(mail);
    }
    
    public void sendEmailWithAttachment(String mailAddress) throws MailException, MessagingException {

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setTo(mailAddress);
        helper.setSubject("Testing Mail API with Attachment");
        helper.setText("Please find the attached document below.");

        FileSystemResource file = new FileSystemResource("/home/punisher/Desktop/Registration.pdf");
        helper.addAttachment(file.getFilename(), file);

        javaMailSender.send(mimeMessage);
    }

}
