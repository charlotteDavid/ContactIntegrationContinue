package LPS2IMA.David.contact;

public class ContactService {
	
	private IContactDAO contactDAO;
	
	public ContactService() {
		contactDAO= new ContactDAO();
	}
	
	
	public void creerContact(String nom, String tel) throws ContactException {
		
		if(nom!=null) {
			if(nom.length()<3 || nom.length()>40){
				System.out.println("Le nom doit avoir au moins 3 caracteres et etre inferieur a 40 caracteres");
				throw new ContactException("Le nom doit etre compris entre 3 et 40 caraceteres");
			}
				
			
			if(nom.length()>=3 && nom.length()<=40) {
				if(this.contactDAO.isContactExiste(nom)) {
					
					throw new ContactException("Le nom existe deja");
				}
				else {
					Contact indi = new Contact(nom,tel);
					contactDAO.creerContact(indi);
					System.out.println("Contact Crée");
				}
			}
				
		}
		
		if(nom==null || nom.length()==0) {
			throw new ContactException("Le nom est obligatoire");
		}
		
				
	}
	
	
	public void supprimerContact(String nom) throws ContactException {
		if(!this.contactDAO.isContactExiste(nom)) {
			throw new ContactException("Ce contact n'existe pas");			
		}
		
		else {
			contactDAO.supprimerContact(nom);
		}
	}
	
	
}
