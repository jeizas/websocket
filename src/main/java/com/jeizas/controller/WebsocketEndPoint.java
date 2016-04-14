package com.jeizas.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;


/**
 * 用户通讯聊天控制器类
 * @author jeizas
 *2014年12月27日下午6:56:46
 */
@RequestMapping("websocket")
public class WebsocketEndPoint extends TextWebSocketHandler {

	Logger logger = Logger.getLogger(WebsocketEndPoint.class);
		
	@Override
	protected void handleTextMessage(WebSocketSession session,
			TextMessage message) throws Exception {
		super.handleTextMessage(session, message);
		logger.info("session:"+session+",message:"+message+"");
		session.sendMessage(message);
	}
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("Connection Establied!");
	}
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		System.out.println("Connection Closed！");
	}
	

}
