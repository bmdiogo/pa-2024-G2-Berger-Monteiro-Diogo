package pa;

import pa.music.organizer.*;
public class PlayerListados {

	public static void main(String[] args) {
		
		MusicOrganizer prueba=new MusicOrganizer();
		String [] temas= {"tema1A", "tema2B","tema3A","tema4B", "tema5A", "tema6B","tema7B"};
		prueba.loadSongs("src/main/resources/mp3", ".mp3",temas);
		prueba.printAllFileNames();
		prueba.printAllTitleNames();
	}

}
