package com.ar.therapist.vendor.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ar.therapist.vendor.chat.Chat;
import com.ar.therapist.vendor.chat.ChatMessageService;
import com.ar.therapist.vendor.chat.ChatRequest;
import com.ar.therapist.vendor.entity.UserData;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class ChatMessageController {
	
	private final ChatMessageService chatService;

	// =============== CHAT CONTROLLER CALLS ==================
	@PostMapping("/create")
    public ResponseEntity<Chat> createChat(@RequestBody ChatRequest chatRequest) {
        Chat createdChat = chatService.createChat(chatRequest);
        return new ResponseEntity<>(createdChat, HttpStatus.CREATED);
    }
	
	@GetMapping("/by-roomId/{roomId}")
	public Chat getMessagesByRoomId(@PathVariable String roomId) {
		return chatService.findByRoomId(roomId);
	}

//	@GetMapping("/therapists/{userId}")
//	public List<TherapistUserDto> getTherapistsListByUserId(@PathVariable Long userId) {
//		return chatService.findTherapistsListByUserId(userId);
//	}

	@GetMapping("/users/{therapistId}")
	public List<UserData> getUsersListByTherapistId(@PathVariable Long therapistId) {
		System.err.println("============################## ::: "+therapistId);
		return chatService.findUsersListByTherapistId(therapistId);
	}

}