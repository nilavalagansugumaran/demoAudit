package com.example.demoaudit.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.ZonedDateTime;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Audit {

    @Id
    @GeneratedValue
    private Integer audit_id;

    @Column
    private String actor_id;

    @Column
    private String role;

    @Column
    private String audit_type;

    @Column
    private  String target_resource;

    @Column
    private  String outcome;

    @Column
    private ZonedDateTime timestamp;

    @Column
    private String updates;
}
