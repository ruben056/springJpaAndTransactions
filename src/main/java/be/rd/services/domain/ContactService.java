package be.rd.services.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.rd.services.repository.ContactRepository;

@Repository
@Service
public class ContactService implements IContactService {

	@Autowired
	private ContactRepository contactRepo;

	@Transactional
	public List<Contact> findAll() {
		Iterator<Contact> it = contactRepo.findAll().iterator();
		List<Contact> result = toList(it);
		return result;
	}

	private List<Contact> toList(Iterator<Contact> it) {
		List<Contact> result = new ArrayList<Contact>();
		while(it.hasNext()){
			result.add(it.next());
		}
		return result;
	}

	@Transactional
	public Contact getById(Long id) {
		Contact result = contactRepo.findOne(id);
		return result;
	}

	@Transactional
	public Contact save(Contact contact) {
		return contactRepo.save(contact);
	}

	@Transactional
	public long countAll() {
		return contactRepo.count();
	}

}
