package com.thankyou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thankyou.beans.MessageBean;
import com.thankyou.services.MessageService;

@RestController
@RequestMapping(value="/gratitude")
public class MessageController {

	private MessageService messageService;
	
	@Autowired
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	
	@RequestMapping(value="/all") 
	public ResponseEntity<List<MessageBean>> getAllMessages() {
		return new ResponseEntity<>(messageService.allMessages(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/{name}")
	public ResponseEntity<MessageBean> getMessageByName(@PathVariable String name) {
		return new ResponseEntity<MessageBean>(messageService.getMessageByName(name), HttpStatus.OK);
	}
}
