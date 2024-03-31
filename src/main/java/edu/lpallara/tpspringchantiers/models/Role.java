package edu.lpallara.tpspringchantiers.models;

import com.fasterxml.jackson.annotation.JsonView;
import edu.lpallara.tpspringchantiers.views.RoleView;
import edu.lpallara.tpspringchantiers.views.TacheView;
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
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(RoleView.class)
    protected Integer id;

    @Column(unique = true)
    @NotNull(message = "Ce champ est obligatoire")
    @JsonView(RoleView.class)
    protected String designation;
}