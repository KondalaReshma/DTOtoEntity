package com.dtoexample.dto;

import com.dtoexample.model.Location;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@EqualsAndHashCode
@Setter
@Getter
@Data
public class UserLocationDTO {
	
	
	private long userId;
	private String email;
	private String place;
	private double longitude;
	private double latitude;

}
