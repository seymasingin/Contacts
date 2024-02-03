package com.seymasingin.contacts.data.repo;

import androidx.lifecycle.MutableLiveData;
import com.seymasingin.contacts.data.model.Person;
import com.seymasingin.contacts.room.ContactsDao;
import java.util.List;
import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ContactsRepository {

    private MutableLiveData<List<Person>> personList;
    private ContactsDao contactsDao;

    public ContactsRepository( ContactsDao contactsDao) {
        this.contactsDao = contactsDao;
        personList = new MutableLiveData();
    }

    public MutableLiveData<List<Person>> getPersonList(){
        return personList;
    }

    public void add(String person_name, String person_tel) {
        Person newPerson = new Person(0, person_name, person_tel);
        contactsDao.addContact(newPerson).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onComplete() {}

                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void refresh(int person_id, String person_name, String person_tel) {
        Person updatedPerson = new Person(person_id, person_name, person_tel);
        contactsDao.updateContact(updatedPerson).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onComplete() {}

                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void search(String word){
        contactsDao.searchContact(word).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<Person>>() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onSuccess(List<Person> people) {
                        personList.setValue(people);
                    }

                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void delete(int person_id){
        Person deletedPerson = new Person(person_id, "", "");
        contactsDao.deleteContact(deletedPerson).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onComplete() {
                        getContacts();
                    }

                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void getContacts() {
        contactsDao.allContacts().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<Person>>() {
            @Override
            public void onSubscribe(Disposable d) {}

            @Override
            public void onSuccess(List<Person> people) {
                personList.setValue(people);
            }

            @Override
            public void onError(Throwable e) {}
        });
    }
}
