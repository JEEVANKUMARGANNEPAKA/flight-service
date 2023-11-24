package com.jeevankumar.demo.util;

import com.jeevankumar.demo.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String,Double> paymentMap=new HashMap<>();
    static {
        paymentMap.put("acc1",12000.0);
        paymentMap.put("acc2",10000.0);
        paymentMap.put("acc3",5000.0);
    }
    public static boolean validateCreditLimit(String accNO,Double paidAmount){
        if(paidAmount>paymentMap.get(accNO)){
            throw new InsufficientAmountException("insufficent fund..........!");
        }else {
            return true;
        }
    }
}
