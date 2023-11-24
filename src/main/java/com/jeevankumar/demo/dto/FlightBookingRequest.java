package com.jeevankumar.demo.dto;

import com.jeevankumar.demo.entiry.PassengerInfo;
import com.jeevankumar.demo.entiry.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingRequest {

    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
