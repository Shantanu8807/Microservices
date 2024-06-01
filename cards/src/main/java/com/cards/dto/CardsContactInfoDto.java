package com.cards.dto;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix="cards")
@Getter
@Setter
public class CardsContactInfoDto{
	
	String msg;
	Map<String,String> contactDetails;
	List<String> onCallSupport;
}