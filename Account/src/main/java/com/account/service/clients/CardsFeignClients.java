package com.account.service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.account.dto.CardsDto;

import jakarta.validation.constraints.Pattern;

@FeignClient("cards")
public interface CardsFeignClients {
	
	@GetMapping("/fetch")
	public ResponseEntity<CardsDto> fetchCardDetails(
			@RequestParam @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits") String mobileNumber);
	
	
}
