package com.example.p01_contacts.ModuleContacts.ContactsModel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "contacts", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class ContactsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  String number;

}
