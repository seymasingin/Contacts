package com.seymasingin.contacts.di;

import com.seymasingin.contacts.data.repo.ContactsRepository;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    @Singleton
    @Provides
    public ContactsRepository provideContactsRepository() {
        return new ContactsRepository();
    }
}
