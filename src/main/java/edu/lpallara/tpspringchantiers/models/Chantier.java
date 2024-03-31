package edu.lpallara.tpspringchantiers.models;

import com.fasterxml.jackson.annotation.JsonView;
import edu.lpallara.tpspringchantiers.views.ChantierView;
import edu.lpallara.tpspringchantiers.views.ConsommableView;
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
public class Chantier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(ChantierView.class)
    protected Integer id;

    @Column(length = 50)
    @Length(min = 3, max = 50, message = "Le nom doit contenir entre 3 et 50 caractères")
    @NotNull(message = "Le nom du chantier n'est pas spécifié")
    @JsonView(ChantierView.class)
    protected String name;

    @Column(length = 100)
    @Length(min = 5, max = 150, message = "L'adress doit contenir entre 3 et 100 caractères")
    @NotNull(message = "L'adress du chantier n'est pas spécifié")
    @JsonView(ChantierView.class)
    protected String adresse;

    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonView(ChantierView.class)
    protected User client;

    @ManyToOne
    @JoinColumn(name = "ouvrier_id")
    @JsonView(ChantierView.class)
    protected User ouvrier;

    @OneToMany(mappedBy = "chantier")
    @JsonView(ChantierView.class)
    protected List<Operation> operations = new ArrayList<>();
}