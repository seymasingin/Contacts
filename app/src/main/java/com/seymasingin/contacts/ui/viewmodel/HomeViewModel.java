package com.seymasingin.contacts.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import com.seymasingin.contacts.data.repo.ContactsRepository;

public class HomeViewModel extends ViewModel {

    private ContactsRepository crepo = new ContactsRepository();

    public void search(String word){
        crepo.search(word);
    }

    public void delete(int person_id){
        crepo.delete(person_id);
    }
}
