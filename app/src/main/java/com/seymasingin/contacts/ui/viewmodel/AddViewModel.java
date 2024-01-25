package com.seymasingin.contacts.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import com.seymasingin.contacts.data.repo.ContactsRepository;

public class AddViewModel extends ViewModel {
    private ContactsRepository crepo = new ContactsRepository();

    public void add(String etName, String etTel) {
        crepo.add(etName,etTel);
    }
}
