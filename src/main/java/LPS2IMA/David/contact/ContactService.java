package LPS2IMA.David.contact;
/**
 * 
 * @author Charlotte
 *
 */
public class ContactService {
  /**
   * Attributs.
   */
  private IContactDAO contactDAO;
  /**
   * Constructeur.
   */
  public ContactService() {
    contactDAO = new ContactDAO();
  }
  /**
   * @param nom nom du contact
   * @param tel tel du contact
   * @throws ContactException exception en cas d'erreur de creation de contact
   */
  public void creerContact(String nom, String tel) throws ContactException {

    if (nom != null) {
      if (nom.length() < 3 || nom.length() > 40) {
        throw new ContactException("Le nom doit etre compris entre 3 et 40 caraceteres");
      }

      if (nom.length() >= 3 && nom.length() <= 40) {
        if (this.contactDAO.isContactExiste(nom)) {

          throw new ContactException("Le nom existe deja");
        } else {
          Contact indi = new Contact(nom, tel);
          contactDAO.creerContact(indi);
          System.out.println("Contact Crée");
        }
      }

    }

    if (nom == null || nom.length() == 0) {
      throw new ContactException("Le nom est obligatoire");
    }

  }
  /**
   * 
   * @param nom nom du contact
   * @throws ContactException
   */
  public void supprimerContact(String nom) throws ContactException {
    if (!this.contactDAO.isContactExiste(nom)) {
      throw new ContactException("Ce contact n'existe pas");
    }

    else {
      contactDAO.supprimerContact(nom);
    }
  }

}
