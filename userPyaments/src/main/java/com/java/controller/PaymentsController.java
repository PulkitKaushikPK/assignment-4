package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.models.Payment;
import com.java.service.PaymentService;

/**
 * @author Pulkit Kaushik
 * @description- This controller is for handling payment related APIs
 */
@RestController
@RequestMapping("/payment")
public class PaymentsController {
	
	@Autowired
	private PaymentService paymentService;
	
	/**
	 * @param- Payment Object
	 * @return- ResponseEntity<Object>
	 * @description- This API is to save an payment details.
	 */
	@PostMapping("/pay") 
	public ResponseEntity<Object> savePayment(@RequestBody Payment payment){

		return paymentService.savePayment(payment);
	}
	
	/**
	 * @param- id(Long)
	 * @return- ResponseEntity<Object>
	 * @description- This API is to get payment details by id.
	 */
	@GetMapping("/{id}") 
	public ResponseEntity<Object> getPaymentDetails(@PathVariable("id") Long id){

		return paymentService.getPaymentDetails(id);
	}

}
