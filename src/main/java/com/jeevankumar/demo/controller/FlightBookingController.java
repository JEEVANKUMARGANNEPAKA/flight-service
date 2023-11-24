package com.jeevankumar.demo.controller;

import com.jeevankumar.demo.dto.FlightBookingAcknowledgement;
import com.jeevankumar.demo.dto.FlightBookingRequest;
import com.jeevankumar.demo.service.FlightBookingServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookFlightTicket")
public class FlightBookingController {
    @Autowired
    private FlightBookingServie servie;

    @PostMapping
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
        return servie.bookFlightTicket(request);

    }


}
