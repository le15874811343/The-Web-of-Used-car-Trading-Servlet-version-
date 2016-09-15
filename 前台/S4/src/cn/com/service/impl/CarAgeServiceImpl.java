package cn.com.service.impl;
import java.util.Map;

import cn.com.bean.*;
import cn.com.dao.impl.*;
import cn.com.dao.*;
import cn.com.service.*;
/**
 * 车龄信息服务实现类
 *@author  lej 
 */
public class CarAgeServiceImpl implements ICarAgeService {
	//车龄信息操作实现类的引用
  private ICarAgeDao carAgeDao=new CarAgeDaoImpl();
        /**
	 * 按热度获取车龄信息的服务
	 * @return Map<Integer,CarAge>
	 */
	@Override
	public Map<Integer, CarAge> getCarAgeByCount() {
		// TODO Auto-generated method stub
		return carAgeDao.getCarAgeByCount();
	}

}
