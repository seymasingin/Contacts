package com.seymasingin.contacts.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.seymasingin.contacts.data.model.Person;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

@Dao
public interface ContactsDao {
    @Query("SELECT * FROM contacts")
    Single<List<Person>> allContacts();

    @Query("SELECT * FROM contacts WHERE person_name like '%' || :query || '%'")
    Single<List<Person>> searchContact(String query);

    @Delete
    Completable deleteContact(Person person);

    @Insert
    Completable addContact(Person person);

    @Update
    Completable updateContact(Person person);
}
