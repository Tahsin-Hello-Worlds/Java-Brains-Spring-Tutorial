package org.tahsin;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;


public class Circle implements Shape, ApplicationEventPublisherAware {
	
	private Point center;
	
	@Autowired
	private MessageSource messageSource;
	
	
	
	private ApplicationEventPublisher publisher;
	
	

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}



	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default Drawing Message", null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "Default Point Message", null));
		// System.out.println("Circle Point is : (" + center.getX() + ", " + center.getY() + ")");
		
		
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
		
		// System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Circle Destroyed");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}
	
}
