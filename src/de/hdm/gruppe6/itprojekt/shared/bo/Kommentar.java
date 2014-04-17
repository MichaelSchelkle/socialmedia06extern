package de.hdm.gruppe6.itprojekt.shared.bo;

public class Kommentar extends BusinessObject{

	/**
	 * @author Özlem Gül, Michael Schelkle, Bharti Kumar
	 */
	private static final long serialVersionUID = 1L;
	
	private String text;
	
//Kontruktor	
public Kommentar(String text){
	this.setText(text);
}

public Kommentar(){
	}

//Getter und Setter
public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}
}
