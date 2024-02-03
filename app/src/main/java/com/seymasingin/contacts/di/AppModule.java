package com.seymasingin.contacts.di;

import android.content.Context;

import androidx.room.Room;

import com.seymasingin.contacts.data.repo.ContactsRepository;
import com.seymasingin.contacts.room.ContactsDao;
import com.seymasingin.contacts.room.ContactsRoomDB;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    @Singleton
    @Provides
    public ContactsRepository provideContactsRepository(ContactsDao contactsDao) {
        return new ContactsRepository(contactsDao);
    }
    @Singleton
    @Provides
    public ContactsDao provideContactsDao(@ApplicationContext Context context) {
        ContactsRoomDB db = Room.databaseBuilder(context, ContactsRoomDB.class,"contacts")
                .build();
        return db.getContactsdao();
    }
}
