package pa;
import pa.network.NewsFeed;
import pa.network.MessagePost;
import pa.network.PhotoPost;
public class Demo1 {

	public static void main(String[] args) {
		NewsFeed obj1=new NewsFeed();
		MessagePost msg1= new MessagePost("Mario","Me voy a la Uni");
		obj1.addMessagePost(msg1);
		PhotoPost ph1= new PhotoPost("Juan","src/main/resources/imagenes/leopardo.jpeg","Leopardo enfadado");
		obj1.addPhotoPost(ph1);
		obj1.show();

	}

}
