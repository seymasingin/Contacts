package com.seymasingin.contacts.data.repo;

import android.util.Log;
import com.seymasingin.contacts.data.model.Person;
import java.util.ArrayList;

public class ContactsRepository {

    public void add(String person_name, String person_tel) {
        Log.e("Added", person_name + "-"+ person_tel);
    }

    public void refresh(int person_id, String person_name, String person_tel) {
        Log.e("added", person_name+"-"+ person_tel);
    }

    public void search(String word){
        Log.e("search", "search");
    }

    public void delete(int person_id){
        Log.e("Delete", String.valueOf(person_id));
    }

    public void getContacts() {
        ArrayList<Person> liste = new ArrayList<>();
        Person p1 = new Person(1, "Seyma", "111");
        Person p2 = new Person(2, "Elif", "111");
        Person p3 = new Person(3, "Kubra", "111");

        liste.add(p1);
        liste.add(p2);
        liste.add(p3);
    }
}
