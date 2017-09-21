package LPS2IMA.David;

import java.io.IOException;

import LPS2IMA.David.contact.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ContactTest {

  @Test(expected = ContactException.class)
  public void testContactVide() throws ContactException {
    ContactService test = new ContactService();
    test.creerContact("", "0679352024");

  }

  @Test(expected = ContactException.class)
  public void testContact2Cara() throws ContactException {
    ContactService test1 = new ContactService();
    test1.creerContact("te", "0679352024");
  }

  @Test(expected = ContactException.class)
  public void testContact41Cara() throws ContactException {
    ContactService test2 = new ContactService();
    test2.creerContact("unnombeaucouptroplongquinepourrapasrentreerdanslabasededonnee",
        "0679352024");
  }

  @Test(expected = ContactException.class)
  public void testContactDouble() throws ContactException {
    ContactService test3 = new ContactService();
    test3.creerContact("charlotte", "0679352024");
    test3.creerContact("charlotte", "0679352024");

  }

  @Test
  public void testContact3carac() throws ContactException {
    ContactService test4 = new ContactService();
    test4.creerContact("cha", "0679352024");

  }

  @Test
  public void testContact40carac() throws ContactException {
    ContactService test4 = new ContactService();
    test4.creerContact("jechercherunprenomquicomporte40caractere", "0679352024");

  }

}
