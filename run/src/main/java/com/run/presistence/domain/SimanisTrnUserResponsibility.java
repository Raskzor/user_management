package com.run.presistence.domain;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "simanis_trn_user_responsibility")
public class SimanisTrnUserResponsibility {
    @Id
    @Column(name = "USER_RESP_ID", nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private SimanisMstUser user;

}