package com.tgt.strikers.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.validation.constraints.Email;

@Table("scorer_info")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Scorer {

    @PrimaryKey
    @Email
    @Column("scorer_email")
    private String scorer_email;

    @Column("scorer_firstname")
    private String scorer_firstname;

    @Column("scorer_lastname")
    private String scorer_lastname;

    @Column("scorer_password")
    private String scorer_password;


}
