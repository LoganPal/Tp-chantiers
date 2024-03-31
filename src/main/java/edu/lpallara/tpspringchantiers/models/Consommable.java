package edu.lpallara.tpspringchantiers.models;

import com.fasterxml.jackson.annotation.JsonView;
import edu.lpallara.tpspringchantiers.views.ConsommableView;
import edu.lpallara.tpspringchantiers.views.OperationView;
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
public class Consommable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(ConsommableView.class)
    protected Integer id;

    @Column(length = 100)
    @Length(min = 3, max = 100, message = "Le Consommable doit contenir entre 3 et 100 caractères")
    @NotNull(message = "Ce champ est obligatoire")
    @JsonView(ConsommableView.class)
    protected String name;
}