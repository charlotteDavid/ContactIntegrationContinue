package LPS2IMA.David.contact;

public interface IContactDAO {
	
	public void creerContact(Contact individu);
	
	public Contact recupererContact(String nom);

	public boolean isContactExiste (String nom);
	
	public void supprimerContact(String  nom);
	
	//public void supprimerContact(Contact  individu);
	
}