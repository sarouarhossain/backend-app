package com.test.app.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Entity
@Data
public class UserTable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String userName;
    private String email;
    private String password;

    @CreationTimestamp
    private ZonedDateTime createdAt;
}
