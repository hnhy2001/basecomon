package com.example.basecomon.model;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EntityListeners({AuditingEntityListener.class})
public class BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "isActive")
    private int isActive = 1;

    @Column(name = "createDate")
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date createDate;

    @Column(name = "updateDate")
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date updateDate;
}
