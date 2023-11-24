package com.jeevankumar.demo.repository;

import com.jeevankumar.demo.entiry.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
