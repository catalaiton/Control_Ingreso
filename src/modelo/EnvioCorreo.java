
package modelo;

import java.util.Properties;
import javax.swing.JOptionPane;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author Arjuna
 */
public class EnvioCorreo {
    public  void transfer_to_email(String mensaje,String asunto){
        
        String correoEnvia = "lclaitonp@gmail.com";
        String contraseña = "fqoiyjnogbueikhb";
        String correo = "laitonlaura38@gmail.com";
        
        Properties objetoPEC = new Properties();
        
        objetoPEC.put("mail.smtp.host","smtp.gmail.com");
        objetoPEC.setProperty("mail.smtp.starttls.enable","true");
        objetoPEC.put("mail.smtp.port", "587");
        objetoPEC.setProperty("mail.smtp.port", "587");
        objetoPEC.put("mail.smtp.user", correoEnvia);
        objetoPEC.setProperty("mail.smtp.auth", "true");
        
        Session sesion = Session.getDefaultInstance(objetoPEC);
        MimeMessage mail = new MimeMessage(sesion);
        
        try{
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia,contraseña);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
            
            
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error en envio de correo....\n"+ex);
        }
        
        
    }
    
    public  void transfer_to_email_adjunto(String mensaje,String asunto) throws MessagingException{
        
        String correoEnvia = "lclaitonp@gmail.com";
        String contraseña = "fqoiyjnogbueikhb";
        String correo = "laitonlaura38@gmail.com";
        
        Properties objetoPEC = new Properties();
        
        objetoPEC.put("mail.smtp.host","smtp.gmail.com");
        objetoPEC.setProperty("mail.smtp.starttls.enable","true");
        objetoPEC.put("mail.smtp.port", "587");
        objetoPEC.setProperty("mail.smtp.port", "587");
        objetoPEC.put("mail.smtp.user", correoEnvia);
        objetoPEC.setProperty("mail.smtp.auth", "true");
        
        Session sesion = Session.getDefaultInstance(objetoPEC);
        
        BodyPart texto = new MimeBodyPart();
            texto.setText(mensaje);
        BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(new DataHandler(new FileDataSource("C:/Users/Arjuna/Documents/ProyIngreso/Ingresos.pdf")));
            adjunto.setFileName("Ingresos.pdf");
        MimeMultipart m = new MimeMultipart();
            m.addBodyPart(texto);
            m.addBodyPart(adjunto);
        
        
        MimeMessage mail = new MimeMessage(sesion);
        
        try{
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
            mail.setSubject(asunto);
            mail.setContent(m);
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia,contraseña);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error en envio de correo....\n"+ex);
        }
        
        
    }
}
