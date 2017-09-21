package LPS2IMA.David.contact;

import java.util.ArrayList;

/**
 * @author Charlotte
 *
 */
public class ContactDAO implements IContactDAO {
  /**
   * Attributs une liste de contacts.
   */
  private ArrayList<Contact> contacts;

  /**
   */
  public ContactDAO() {
    this.contacts = new ArrayList<Contact>();
  }

  /**
   * Methode qui creer un contact.
   * @param individu
   */
  public void creerContact(Contact individu) {
    contacts.add(individu);
  }

  /**
   * Methode qui permet de recuperer un contact avec som nom.
   * @param nom
   * @return trouve
   */
  public Contact recupererContact(String nom) {
    Contact trouve = null;
    for (int i = 0; i < contacts.size(); i++) {
      if (contacts.get(i).getNom().equals(nom)) {
        trouve = contacts.get(i);
      }
    }

    return trouve;
  }

  /**
   * @param nom
   * @return rep
   */
  public boolean isContactExiste(String nom) {
    boolean rep = false;
    for (int i = 0; i < contacts.size(); i++) {
      if (contacts.get(i).getNom().equals(nom)) {
        rep = true;
      }
    }

    return rep;
  }

  /**
   * Metode qui permet de supprimer un contact à partir de son nom.
   * @param nom
   *          nom du contact
   */
  public void supprimerContact(String nom) {
    for (int i = 0; i < contacts.size(); i++) {
      if (contacts.get(i).getNom().equals(nom)) {
        contacts.remove(i);
      }
    }
  }

}
