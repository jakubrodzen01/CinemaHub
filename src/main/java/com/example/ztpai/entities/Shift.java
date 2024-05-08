package com.example.ztpai.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.sql.Date;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shifts")
public class Shift {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
    private UUID id_shift;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
    @Column(name = "start_time")
    private String start_time;
    @Column(name = "end_time")
    private String end_time;
    @Column(name = "shift_date")
    private Date shift_date;
    @Enumerated(value = EnumType.STRING)
    private Place place;
}