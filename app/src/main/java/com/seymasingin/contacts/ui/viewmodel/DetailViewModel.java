package com.seymasingin.contacts.ui.viewmodel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.seymasingin.contacts.data.repo.ContactsRepository;

public class DetailViewModel extends ViewModel {

    private ContactsRepository crepo = new ContactsRepository();

    public void refresh(int person_id, String person_name, String person_tel) {
        crepo.refresh(person_id, person_name,person_tel);
    }
}
