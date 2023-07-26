package com.example.p01_contacts.ModuleContacts.ContactsRepository;

import com.example.p01_contacts.ModuleContacts.ContactsModel.ContactsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepository extends JpaRepository<ContactsModel, Long> {

}
