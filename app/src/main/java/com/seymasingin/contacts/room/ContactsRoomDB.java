package com.seymasingin.contacts.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.seymasingin.contacts.data.model.Person;

@Database(entities = {Person.class}, version = 1)
public abstract class ContactsRoomDB extends RoomDatabase {
    public abstract ContactsDao getContactsdao();
}
