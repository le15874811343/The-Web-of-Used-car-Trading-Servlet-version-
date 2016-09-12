package cn.com.service.impl;

import java.util.*;

import cn.com.bean.*;
import cn.com.dao.impl.*;
import cn.com.dao.*;
import cn.com.service.*;
/**
 * 行驶距离服务实现类
 *@author lej 
 */
public class DistanceServiceImpl implements IDistanceService {
	//行驶距离操作接口的引用
   private IDistanceDao distanceDao=new DistanceDaoImpl();
   /**
    * 
    * 按热度获取行驶距离信息的服务
    *@return Map<Integer,Distance> 
    */
	@Override
	public Map<Integer, Distance> getDistanceByCount() {
		// TODO Auto-generated method stub
		return distanceDao.getDistanceByCount();
	}

}
