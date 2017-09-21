package LPS2IMA.David.contact;
import java.util.ArrayList;

public class ContactDAO implements IContactDAO{

	private ArrayList<Contact> contacts;

	public ContactDAO() {
		this.contacts =new ArrayList<Contact>();
	}
	
	
	public void creerContact(Contact individu) {
		contacts.add(individu);
	}
	
	public Contact recupererContact(String nom) {
		Contact trouve =null;
		for (int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).getNom().equals(nom)) {
				trouve=contacts.get(i);
			}
		}
		
		return trouve;
	}
	
	
	public boolean isContactExiste (String nom) {
		boolean rep= false;
		for (int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).getNom().equals(nom)) {
				rep=true;
			}			
		}
		
		return rep;
	}



	public void supprimerContact(String nom) {		
		for (int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).getNom().equals(nom)) {
				contacts.remove(i);
			}
		
		}
	
	}



	



	
	
}
