package com.example.jwtspring.entity;

import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHORITY")
@Getter
@Setter
@ToString
public class Authority {
    @Id
    @Column(name = "NAME", length = 50)
    @NotNull
    private String name;

}
