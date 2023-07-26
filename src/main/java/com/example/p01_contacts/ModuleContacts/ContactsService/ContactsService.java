package com.example.p01_contacts.ModuleContacts.ContactsService;

import com.example.p01_contacts.ModuleContacts.ContactsModel.ContactsModel;
import com.example.p01_contacts.ModuleContacts.ContactsRepository.ContactsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactsService implements ContactsInterface{

    //Dependency Injection:
    private final ContactsRepository contactsRepository;
    public ContactsService(ContactsRepository contactsRepository){
        this.contactsRepository = contactsRepository;
    }

    //Create Contact
    @Override
    public ContactsModel addContact(ContactsModel contact) {
        ContactsModel contact1 = contactsRepository.save(contact);

        if(!contact1.equals(null)){
            return null;
        }
        return contact1;
    }

    //Get All Contacts
    @Override
    public List<ContactsModel> findAllContacts() {
        return (List<ContactsModel>) contactsRepository.findAll();
    }

    //Get one contact
    @Override
    public Optional<ContactsModel> findOneContact(Long id) {
        return contactsRepository.findById(id);
    }

    //Delete One Contact
    @Override
    public int deleteContact() {
        return 0;
    }

    //Update One Contact
    @Override
    public int updateContact() {
        return 0;
    }
}
