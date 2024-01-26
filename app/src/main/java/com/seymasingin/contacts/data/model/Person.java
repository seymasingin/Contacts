package com.seymasingin.contacts.data.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity(tableName = "contacts")
public class Person implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name= "person_id")
    @NonNull
    private int person_id;
    @ColumnInfo(name= "person_name")
    @NonNull
    private String person_name;
    @ColumnInfo(name= "person_tel")
    @NonNull
    private String person_tel;

    public Person() {
    }

    public Person(int person_id, @NonNull String person_name, @NonNull String person_tel) {
        this.person_id = person_id;
        this.person_name = person_name;
        this.person_tel = person_tel;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public void setPerson_name(@NonNull String person_name) {
        this.person_name = person_name;
    }

    public void setPerson_tel(@NonNull String person_tel) {
        this.person_tel = person_tel;
    }

    public int getPerson_id() {
        return person_id;
    }

    @NonNull
    public String getPerson_name() {
        return person_name;
    }

    @NonNull
    public String getPerson_tel() {
        return person_tel;
    }
}
