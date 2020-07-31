package com.tgt.strikers.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.validation.constraints.Email;

@Table("admin_info")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    @PrimaryKey
    @Email
    @Column("admin_email")
    private String admin_email;

    @Column("admin_firstname")
    private String admin_firstname;

    @Column("admin_lastname")
    private String admin_lastname;

    @Column("admin_password")
    private String admin_password;


}
