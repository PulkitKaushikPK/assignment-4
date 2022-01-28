package com.java.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.java.models.Payment;
import com.java.repository.PaymentRepository;

/**
 * @author Pulkit Kaushik
 * @description- This is service implementation class for our Payment Controller
 */
@Service
public class PaymentService {
	
	 @Autowired
	 private RestTemplate restTemplate;
	 
	 @Autowired
	  private PaymentRepository paymentRepository;
	 
public ResponseEntity<Object> savePayment(Payment cart) {
		 
		Payment newcart=paymentRepository.save(cart);		 
	    return new ResponseEntity<>(newcart,HttpStatus.OK);
	    }

public ResponseEntity<Object> getPaymentDetails(Long id) {
	Optional<Payment> details= paymentRepository.findById(id);
	return new ResponseEntity<>(details,HttpStatus.OK);

}

}
