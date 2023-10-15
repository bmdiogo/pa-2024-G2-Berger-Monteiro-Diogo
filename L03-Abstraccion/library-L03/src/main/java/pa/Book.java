package pa;
/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Diogo)
 * @version (Insert today's date here.)
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages=bookPages;
        refNumber="";
        
    }

    // Add the methods here ...
    public String getAuthor() {
    	return author;
    	
    }
    public String getTitle() {
    	return title;
    }
    
    public int getPages() {
    	return pages;
    }
    
    public void setRefNumber(String ref) {
    	if (ref.length()<3) {
    		System.out.println("ERROR: El número de referencia del libro "+title+" debe contener al menos tres caracteres");
    	}
    	else {
    		refNumber=ref;
    	}
    }
    
    public String getRefNumber() {
    	return refNumber;
    }
    
    public void prestar() {
    	borrowed+=1;
    }
    public int getBorrowed() {
    	return borrowed;
    }
    
    public void printDetails() {
    	System.out.println("\n Detalles de " + title);
    	System.out.println("-----------------------");
    	System.out.println("--Autor: " +author);
    	System.out.println("--Título: " + title);
    	System.out.println("--Nº de páginas: "+pages);
    	System.out.println("--Nº referencia: ");
    	if (refNumber.length()== 0) {
    		System.out.println("ZZZZ");
    	}
    	else {
    		System.out.println(refNumber);
    	}
    	System.out.println("--Nº préstamos:"+ borrowed);
    	System.out.println("\n-----------------------");
    	
    	
    	
    }
    public void mostrarVecesPrestado() {
    System.out.println("\n El libro "+ title+" se ha prestado "+ borrowed+" veces." );
    }
    
}