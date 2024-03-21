package org.xproce.tp2.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name ;
    private String prenom ;
    @ManyToMany
    private Collection<Session> sessions=new ArrayList<>();
}
