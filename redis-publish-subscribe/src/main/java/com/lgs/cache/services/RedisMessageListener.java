package com.lgs.cache.services;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

import java.io.UnsupportedEncodingException;

public class RedisMessageListener implements MessageListener {

	@Override
	public void onMessage(Message message, byte[] pattern) {
		try {
			System.out.println("====channel:====" + new String(message.getChannel()) + "\n====message:===="
					+ new String(message.getBody(), "utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}