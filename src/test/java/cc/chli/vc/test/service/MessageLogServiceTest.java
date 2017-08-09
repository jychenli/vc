package cc.chli.vc.test.service;

import java.util.Date;




import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cc.chli.vc.common.constants.MessageType;
import cc.chli.vc.common.util.StringUtilsExtend;
import cc.chli.vc.model.MessageLog;
import cc.chli.vc.service.MessageLogService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:spring-context.xml"})
@ActiveProfiles("test")
public class MessageLogServiceTest {
	
	 @Autowired
	private MessageLogService messageLogService;
	
	@Test
	public void testSaveMessageLog(){
		MessageLog record = new MessageLog();
		
		record.setId(StringUtilsExtend.getUUID());
		record.setTime(new Date());
		record.setContent("test");
		record.setIp("192.168.1.1");
		
		record.setType(MessageType.HEART_BEAT.getName());
		
		messageLogService.saveMessageLog(record);
		
	}
}
