package com.jeevankumar.demo.service;

import com.jeevankumar.demo.dto.FlightBookingAcknowledgement;
import com.jeevankumar.demo.dto.FlightBookingRequest;
import com.jeevankumar.demo.entiry.PassengerInfo;
import com.jeevankumar.demo.entiry.PaymentInfo;
import com.jeevankumar.demo.repository.PassengerInfoRepository;
import com.jeevankumar.demo.repository.PaymentInfoRepository;
import com.jeevankumar.demo.util.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingServie {
    @Autowired
   private PassengerInfoRepository passengerInfoRepository;
    @Autowired
   private PaymentInfoRepository paymentInfoRepository;
    @Transactional
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request){
        PassengerInfo passengerInfo1=request.getPassengerInfo();
     passengerInfoRepository.save(passengerInfo1);
        PaymentInfo paymentInfo=request.getPaymentInfo();
        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo1.getFare());
        paymentInfo.setPassengerId(passengerInfo1.getPId());
        paymentInfo.setAmount(passengerInfo1.getFare());
     passengerInfoRepository.save(passengerInfo1);
        return new FlightBookingAcknowledgement
                ("success",passengerInfo1.getFare(),
                        UUID.randomUUID().toString().split("_")[0],
                        passengerInfo1);
    }

}
