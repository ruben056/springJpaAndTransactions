package be.rd.services.domain;

import java.util.List;


public interface IContactService {
	
	List<Contact> findAll();
	
	Contact getById(Long id);
	
	Contact save(Contact contact);
	
	long countAll();
	
}
