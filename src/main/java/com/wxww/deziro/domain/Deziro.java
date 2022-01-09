package com.wxww.deziro.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

/**
 * @author eisuto
 */
@Table(name = "t_deziro")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Deziro{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "achieve_date")
    private LocalDate achieveDate;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "status")
    private String status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Deziro deziro = (Deziro) o;
        return id != null && Objects.equals(id, deziro.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}