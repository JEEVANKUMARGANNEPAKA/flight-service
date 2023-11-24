package com.jeevankumar.demo.dto;

import com.jeevankumar.demo.entiry.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingAcknowledgement {

    private String status;
    private Double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;
}
