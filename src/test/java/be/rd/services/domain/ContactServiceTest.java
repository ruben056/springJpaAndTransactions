package be.rd.services.domain;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class ContactServiceTest {

	@Autowired
	private IContactService contactService;
	
	@Test
	public void testFindAll() {
		List<Contact> allContacts = contactService.findAll();
		for (Contact contact : allContacts) {
			System.out.println(contact);
		}
		Assert.assertFalse(allContacts.isEmpty());
		
		long cnt = contactService.countAll();
		
		Assert.assertTrue(Long.valueOf(cnt).intValue() == allContacts.size() );
		
		
		Contact rudy = new Contact();
		rudy.setBirthDate(new Date());
		rudy.setFirstName("rudy");
		rudy.setLastName("whoknows");
		contactService.save(rudy);
		allContacts = contactService.findAll();
		for (Contact contact : allContacts) {
			System.out.println(contact);
		}
		Assert.assertFalse(allContacts.isEmpty());
		
		cnt = contactService.countAll();
		
		Assert.assertTrue(Long.valueOf(cnt).intValue() == allContacts.size() );
	}
}
