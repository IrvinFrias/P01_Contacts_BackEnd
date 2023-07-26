package com.example.p01_contacts.ModuleContacts.ContactsService;

import com.example.p01_contacts.ModuleContacts.ContactsModel.ContactsModel;
import java.util.List;
import java.util.Optional;

public interface ContactsInterface {
    public ContactsModel addContact(ContactsModel contact);
    public List<ContactsModel> findAllContacts();
    public Optional findOneContact(Long id);
    public int deleteContact();
    public int updateContact();
}
