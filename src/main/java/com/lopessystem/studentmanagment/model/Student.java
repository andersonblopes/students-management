package com.lopessystem.studentmanagment.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;

/**
 * The type Student.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    /**
     * The Id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * The First name.
     */
    @Column(name = "first_name")
    private String firstName;

    /**
     * The Last name.
     */
    @Column(name = "last_name")
    private String lastName;

    /**
     * The Email.
     */
    @Column(name = "email")
    private String email;

    /**
     * The Created at.
     */
    @CreationTimestamp
    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    /**
     * The Active.
     */
    @Column(name = "active")
    private Boolean active = Boolean.TRUE;
}
