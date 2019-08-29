package com.thankyou.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thankyou.beans.MessageBean;
import com.thankyou.repository.MessageRepository;

@Service
public class MessageService {

	private MessageRepository messageRepository;
	
	@Autowired
	public MessageService(MessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}
	
	public List<MessageBean> allMessages() {
		return this.messageRepository.findAll();
	}
	
	public MessageBean getMessageByName(String name) {
		return this.messageRepository.getByName(name);
	}

}
