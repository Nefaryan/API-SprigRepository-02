package co.develhope.CrudRestAPI.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Table
@Entity
public class ProgrammingLanguages {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = true)
    private LocalDate firstAppearance;
    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguages(Long id, String name, LocalDate firstAppearance, String inventor) {
        this.id = id;
        this.name = name;
        this.firstAppearance = firstAppearance;
        this.inventor = inventor;
    }

    public ProgrammingLanguages() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(LocalDate firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }

    public Long getId() {
        return id;}

    public void setId(Long id) {
        this.id = id;}
}