package pa;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 * A class to model a simple mail item. The item has sender and recipient
 * addresses and a message string.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MailItem implements Serializable {
    private static final long serialVersionUID = 1234567L;
	// The sender of the item.
    private String from;
    // The intended recipient.
    private String to;
    // The text of the message.
    private String message;


    
    public MailItem(){}
    
    /**
     * Create a mail item from sender to the given recipient,
     * containing the given message.
     * @param from The sender of this item.
     * @param to The intended recipient of this item.
     * @param message The text of the message to be sent.
     */
    public MailItem(String from, String to, String message)
    {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    /**
     * @return The sender of this message.
     */
    public String getFrom()
    {
        return from;
    }

    /**
     * @return The intended recipient of this message.
     */
    public String getTo()
    {
        return to;
    }

    /**
     * @return The text of the message.
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Print this mail message to the text terminal.
     */
    public void print()
    {
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Message: " + message);
        System.out.println();
    }
    public void writeToDisk() {
        try (FileOutputStream fileOut = new FileOutputStream("fichero.txt");
             ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {
            objOut.writeObject(this); // Debes pasar una instancia específica de MailItem, en este caso, 'this'
        } catch (Exception e) {
            e.printStackTrace();
        }
    }}