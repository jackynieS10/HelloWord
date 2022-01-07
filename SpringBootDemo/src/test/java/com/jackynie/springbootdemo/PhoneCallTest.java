package com.jackynie.springbootdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jackynie.entity.PhoneCall;
import com.jackynie.mapper.PhoneCallMapper;
import com.jackynie.util.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@SpringBootTest
public class PhoneCallTest {

	@Resource
	private PhoneCallMapper phoneCallMapper;

	@Test
	public void findPhoneCall() {
		List<PhoneCall> userList = this.phoneCallMapper.selectList(null);
		System.err.println(userList);

		for (PhoneCall pcll : userList) {
			System.err.println(pcll.getPhoneId() + " " + pcll.getPhoneName() + " " + pcll.getPhoneType() + " "
					+ pcll.getPhoneBrand() + " " + pcll.getPhoneCpu() + " " + pcll.getPhoneMemory() + " "
					+ DateUtil.dateFormat(pcll.getPublicDate()));
		}
	}

	/**
	 * 添加手机信息
	 * @throws Exception 
	 */
	public void addPhoneCall() throws Exception {
		for (int i = 1; i <= 36; i++) {
			PhoneCall pcl = new PhoneCall();
			pcl.setPhoneName("test_" + i);
			pcl.setPhoneType("智能机");
			pcl.setPhoneBrand("三星");
			pcl.setPhoneCpu("猎户坐");
			pcl.setPhoneMemory("16G");
			Date date = new Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DATE, i);
			pcl.setPublicDate(cal.getTime());
			this.phoneCallMapper.insert(pcl);
			this.findPhoneCallByDate();

		}

	}

	/**
	 * 根据时间段查询用户信息 GE 大于等于 LE 小于等于
	 */
	public void findPhoneCallByDate() throws Exception {

		QueryWrapper<PhoneCall> query = new QueryWrapper<PhoneCall>();
		String startDateStr = "2022-01-20 00:00:00";
		String endDateStr = "2022-02-06 23:59:59";
		query.ge("public_date", DateUtil.StringToDate(startDateStr));
		query.le("public_date", DateUtil.StringToDate(endDateStr));
		List<PhoneCall> phoneCallList = this.phoneCallMapper.selectList(query);
		System.err.println(phoneCallList);
		for (PhoneCall pcll : phoneCallList) {
			System.err.println(pcll.getPhoneId() + " " + pcll.getPhoneName() + " " + pcll.getPhoneType() + " "
					+ pcll.getPhoneBrand() + " " + pcll.getPhoneCpu() + " " + pcll.getPhoneMemory() + " "
					+ DateUtil.dateFormat(pcll.getPublicDate()));
		}
	}

	public void deletePhoneCallById() throws Exception {

		int result = this.phoneCallMapper.deleteById(10048);

		System.err.println("result : " + result);

		Map<String, Object> wwww = new ConcurrentHashMap<String, Object>();
		wwww.put(null, wwww);

	}

	/**
	 * 
	 * @throws Exception
	 */
	public void updatePhoneCallById() throws Exception {

		PhoneCall phoneCall = this.phoneCallMapper.selectById(10047);
		if (null != phoneCall) {
			phoneCall.setPhoneBrand("索爱");
			this.phoneCallMapper.updateById(phoneCall);
		}

		List<String> tempList = new ArrayList<String>();
		tempList.add("1");
		tempList.add("2");
		tempList.add("3");
		System.out.println("HelloWords" + "wwww");
		for (int i = 0; i < tempList.size(); i++) {
			System.out.println(tempList);
		}

		StringBuffer sb = new StringBuffer();


	}

}
