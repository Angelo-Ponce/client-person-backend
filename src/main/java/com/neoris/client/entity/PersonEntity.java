package com.neoris.client.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity(name="person")
@Data
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String identificacion;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 50)
    private String gender;

    @Column(nullable = false)
    private Integer age;

    @Column(length = 100)
    private String address;

    @Column(length = 15)
    private String phone;

    // AUDITABLE
    @Column(name ="created_by_user" ,nullable = false, length = 50)
    private String createdByUser;

    //@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "last_modified_by_user", length = 50)
    private String lastModifiedByUser;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_modified_date", length = 50)
    private Date lastModifiedDate;
}
