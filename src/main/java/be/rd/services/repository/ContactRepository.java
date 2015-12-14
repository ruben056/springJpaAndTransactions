package be.rd.services.repository;

import org.springframework.data.repository.CrudRepository;

import be.rd.services.domain.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {

}
