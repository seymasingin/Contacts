package com.seymasingin.contacts.data.model;

import java.io.Serializable;

public class Person implements Serializable {
    private int person_id;
    private String person_name;
    private String person_tel;
    public Person(int person_id, String person_name, String person_tel) {
        this.person_id = person_id;
        this.person_name = person_name;
        this.person_tel = person_tel;
    }
    public Person() {
    }
    public int getPerson_id() {
        return person_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public String getPerson_tel() {
        return person_tel;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public void setPerson_tel(String person_tel) {
        this.person_tel = person_tel;
    }
}
