package com.example.p01_contacts.ModuleContacts.ContactsController;


import com.example.p01_contacts.ModuleContacts.ContactsModel.ContactsModel;
import com.example.p01_contacts.ModuleContacts.ContactsService.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contacts")
public class ContactsController {

    private ContactsService contactsService;
    public ContactsController(ContactsService contactsService){
        this.contactsService = contactsService;
    }

    @GetMapping
    public ResponseEntity<List<ContactsModel>> getAllContacts(){
        List<ContactsModel> allContacts = contactsService.findAllContacts();
        return ResponseEntity.ok(allContacts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactsModel> getContactById(@PathVariable Long id){
        Optional<ContactsModel> contact = contactsService.findOneContact(id);

        if(contact.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(contact.get());
    }

    @PostMapping
    public ResponseEntity<ContactsModel> createContact(@RequestBody ContactsModel contact){
        ContactsModel newContact = contactsService.addContact(contact);
        return ResponseEntity.ok(newContact);
    }


}
