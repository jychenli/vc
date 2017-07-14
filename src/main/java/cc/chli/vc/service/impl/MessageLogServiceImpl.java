package cc.chli.vc.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.chli.vc.dao.MessageLogMapper;
import cc.chli.vc.model.MessageLog;
import cc.chli.vc.service.MessageLogService;

@Service
public class MessageLogServiceImpl implements  MessageLogService{
	
	 @Autowired
	private MessageLogMapper messageLogMapper;
	
	@Override
	public void  saveMessageLog(MessageLog record) {
		// TODO Auto-generated method stub
		messageLogMapper.insert(record);
	}
	
}
