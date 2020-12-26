package com.telusko.demorest2;


public interface INotificationTemplateDataAccessLayer {
	void Create(NotificationTemplate t);
	void Update(int id,NotificationTemplate t);
	NotificationTemplate Read(int id);
	
	void Delete(int templateID);
}
