package com.java100.domain.users;

import java.time.Instant;

public class User {
    
    private String id;
    
    private String email;
    private String senhal;

    private Instant creatAt;
    private Instant updateAt;

    public User(String id, String email, String senhal, Instant creatAt, Instant updateAt) {
        this.id = id;
        this.email = email;
        this.senhal = senhal;
        this.creatAt = creatAt;
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return " User [id=" + id + ", email=" + email + ", senhal=" + senhal + 
            ", creatAt=" + creatAt + ", updateAt=" + updateAt + "]" ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenhal() {
        return senhal;
    }

    public void setSenhal(String senhal) {
        this.senhal = senhal;
    }

    public Instant getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(Instant creatAt) {
        this.creatAt = creatAt;
    }

    public Instant getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Instant updateAt) {
        this.updateAt = updateAt;
    }    
}
