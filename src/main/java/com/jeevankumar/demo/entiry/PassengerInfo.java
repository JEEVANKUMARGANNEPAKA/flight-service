package com.jeevankumar.demo.entiry;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "passengerInfo")
public class PassengerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pId;
    private String name;
    private String email;
    private String source;
    private String destination;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")
    private Date travelDate;
    private String pickTime;
    private String arrivalTime;
    private Double fare;
}
