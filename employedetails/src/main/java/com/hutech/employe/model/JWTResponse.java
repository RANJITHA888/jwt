package com.hutech.employe.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class JWTResponse {

	private  final String jwtToken;

	public String getJwtToken() {
		return jwtToken;
	}


	public JWTResponse(String jwtToken) {
		super();
		this.jwtToken = jwtToken;
	}

	
}
