package edu.lpallara.tpspringchantiers.models;

import com.fasterxml.jackson.annotation.JsonView;
import edu.lpallara.tpspringchantiers.views.UserView;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(UserView.class)
    protected Integer id;

    @Column(unique = true, length = 50)
    @Length(min = 3, max = 50, message = "Votre mail doit être valide")
    @NotNull(message = "Le mail est obligatoire")
    @JsonView(UserView.class)
    protected String email;

    @Column
    @NotNull(message = "Le mot de passe est obligatoire")
    @JsonView(UserView.class)
    protected String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @JsonView(UserView.class)
    protected Role role;

}