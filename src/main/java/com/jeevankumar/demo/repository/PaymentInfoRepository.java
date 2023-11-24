package com.jeevankumar.demo.repository;

import com.jeevankumar.demo.entiry.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {

}
