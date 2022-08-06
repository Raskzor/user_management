package com.project.presistence.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "simanis_mst_user")
public class SimanisMstUser {
    @Id
    @Column(name = "USER_ID", nullable = false)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @Column(name = "USERNAME", length = 10)
    private String username;

    @Column(name = "USER_PASSWORD", length = 100)
    private String userPassword;

    @Column(name = "MOB_PHONE", length = 15)
    private String mobPhone;

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    @Column(name = "CREATED_BY", length = 50)
    private String createdBy;

    @Column(name = "CREATION_DATE")
    private LocalDate creationDate;

    @Column(name = "LAST_UPDATED_BY", length = 50)
    private String lastUpdatedBy;

    @Column(name = "LAST_UPDATED_DATE")
    private LocalDate lastUpdatedDate;

    @OneToMany(mappedBy = "user")
    private Set<SimanisTrnUserResponsibility> simanisTrnUserResponsibilities = new LinkedHashSet<>();
}