package com.pabu5h.evs2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "last_reading")
public class LastReadingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String meter_sn;
    @Column
    private Float last_reading_kwh;
    @Column
    private LocalDateTime last_reading_timestamp;
    @Column
    private Float credit_balance;
    @Column
    private Float overused_kwh;
    @Column
    private Long offer_id;


}
