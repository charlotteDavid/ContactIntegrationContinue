package LPS2IMA.David;

import org.easymock.Capture;
import org.easymock.EasyMock;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;

import LPS2IMA.David.contact.Contact;
import LPS2IMA.David.contact.ContactException;
import LPS2IMA.David.contact.ContactService;
import LPS2IMA.David.contact.IContactDAO;
import junit.framework.Assert;

public class MockFailTest extends MockTest {

	
	
	@TestSubject
	private ContactService service = new ContactService();
	
	@Mock
	private IContactDAO dao;
	
	@Test(expected = ContactException.class)
	public void testCreerContactErr() throws ContactException{
		//System.out.println("Test Cas erreur si le nom existe deja");
		//Phaze d'enregistrement(Record)
		String nom ="ContactOk";
		String tel="0679352024";
		EasyMock.expect(dao.isContactExiste(nom)).andReturn(true);
		
		
		
		//Fin de l'enregistrement 
		replayAll();
		
		//Appelde la methode
		service.creerContact(nom, tel);
		
		//Verification
		verifyAll();
		
	
	}
	
	@Test
	public void testCreerContactCasValide() throws ContactException {
		//Phaze d'enregistrement(Record)
		String nom ="ContactValide";
		String tel="0679352024";
		EasyMock.expect(dao.isContactExiste(nom)).andReturn(false);
		
		Capture<Contact> capture = EasyMock.newCapture();
		dao.creerContact(EasyMock.capture(capture));
		
		//Fin de l'enregistrement 
		replayAll();
		
		//Appelde la methode
		service.creerContact(nom, tel);
		
		//Verification
		verifyAll();
		
		Contact contact = capture.getValue();
		Assert.assertEquals(contact.getNom(), nom);
		Assert.assertEquals(contact.getTel(), tel);
		
	
		
	}
	
	@Test(expected = ContactException.class)
	public void testSupprimerContact() throws ContactException{
		//Phaze d'enregistrement(Record)
		String nom ="Contact";
		String tel="0679352024";
		EasyMock.expect(dao.isContactExiste(nom)).andReturn(false);
		
		//Fin de l'enregistrement 
		replayAll();
		
		//Appel de la methode
		
		service.supprimerContact(nom);
		
		//Verification
		verifyAll();
		
	}
	
	
}
