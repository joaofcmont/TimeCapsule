package com.timecapsule.timecapsule;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class TimeCapsule {

    @Id
    private Integer id;
    private String name;
    private String messages;

    public TimeCapsule(){
    }

    public TimeCapsule(Integer id){}

    public TimeCapsule(Integer id, String name, String messages){
        this.id=id;
        this.name=name;
        this.messages=messages;
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getMessages(){
        return this.messages;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMessages(String messages){
        this.messages=messages;
    }

    @Override
    public String toString() {
        return "TimeCapsule{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", messages='" + messages + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeCapsule that = (TimeCapsule) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(messages, that.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, messages);
    }
}
