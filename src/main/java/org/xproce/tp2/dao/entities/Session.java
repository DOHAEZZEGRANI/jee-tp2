package org.xproce.tp2.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private Date date_debut;
    private Date date_fin;
    @ManyToMany(mappedBy = "sessions")
    private Collection<Student> students=new ArrayList<>();
    @ManyToOne
    private Course course;
}
