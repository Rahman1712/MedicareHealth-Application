package com.ar.therapist.gateway;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway/api/v1/auth")
public class TestController {
	
	@GetMapping("/authenticate")
	public ResponseEntity<?> logggin(){
		return  ResponseEntity.ok("Login  calallalalal");
	}

	@PostMapping("/authenticate")
	public ResponseEntity<?> authenticate(
			@RequestBody Object request) {
		System.err.println("GETREERR+++++++++++ TESTCCCC");
		
		System.err.println(request);
		Map<String, Object> map = new HashMap<>();
		map.put("id", 101);
		map.put("username", "rahman_user");
		map.put("token", "jwt_token_value");
		map.put("role", "ROLE_ADMIN");
		map.put("access_token", "ACCESS_TOKEN_JWT");
		
		return ResponseEntity.ok(map);
	}
	
}
