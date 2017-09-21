package LPS2IMA.David.contact;
/**
 * @author Charlotte
 *
 */
public class Contact {

  /**
  * Attribut nom sous forme deString.
  */
  private String nom;
  /**
   * Attribut tel sous forme de String.
   */
  private String tel;

  /**
   * @param nom nom du contact
   * @param tel tel du contact
   */
  public Contact(String nom, String tel) {
    this.nom = nom;
    this.tel = tel;

  }

  /**
   * @return nom
   */
  public String getNom() {
    return nom;
  }

  /**
   * @param nom nom du contact
   */

  public void setNom(String nom) {
    this.nom = nom;
  }

  /**
   * @return tel
   */
  public String getTel() {
    return tel;
  }

  /**
   * @param tel
   *          telephone du contact
   */
  public void setTel(String tel) {
    this.tel = tel;
  }

}
