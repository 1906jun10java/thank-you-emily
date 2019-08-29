package com.thankyou.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thankyou.beans.MessageBean;

@Repository
public interface MessageRepository extends JpaRepository<MessageBean, Integer> {
	
	public MessageBean getByName(String name);

}
