package edu.lpallara.tpspringchantiers.models;

import com.fasterxml.jackson.annotation.JsonView;
import edu.lpallara.tpspringchantiers.views.TacheView;
import edu.lpallara.tpspringchantiers.views.UserView;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Tache {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(TacheView.class)
    protected Integer id;

    @Column(length = 100)
    @Length(min = 3, max = 100, message = "Le nom de la tâche doit avoir entre 3 et 100 caractères")
    @NotNull(message = "Ce champ est obligatoire")
    @JsonView(TacheView.class)
    protected String name;

    @Column
    @JsonView(TacheView.class)
    protected int temps;

    @ManyToMany
    @JoinTable(
            name = "tache_consommable",
            joinColumns = @JoinColumn(name = "tache_id"),
            inverseJoinColumns = @JoinColumn(name = "consommable_id")
    )
    @JsonView(TacheView.class)
    protected List<Consommable> consommables = new ArrayList<>();
}