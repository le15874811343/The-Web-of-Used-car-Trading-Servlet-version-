package cn.com.service.impl;
import java.util.List;
import java.util.Map;
import cn.com.bean.Trends;
import cn.com.dao.impl.*;
import cn.com.dao.*;
import cn.com.service.*;
/**
 * 公司动态消息服务实现类
 * @author
 */
public class TrendsServiceImpl implements ITrendsService,IPageDao{
	//公司动态消息操作实现类的引用
 private  TrendsDaoImpl trendsDao=new TrendsDaoImpl();
       /**
        * 获取指定条数的最新的动态消息集合的的服务
        * @param  rows 获取记录的条数
        * @return List<Trends> 
        */
	@Override
	public List<Trends> getITrendsByTime(Trends trends,int rows) {
		// TODO Auto-generated method stub
		return trendsDao.getITrendsByTime(trends,rows);
	}
	@Override
	public int queryMsgCount(Object object, int minPrice, int maxPrice,
			int minDis, int maxDis, int minAge, int maxAge) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Object> showMsgInfoList(int curPage, int rowsPrePage,
			Object object, String order, int minPrice, int maxPrice,
			int minDis, int maxDis, int minAge, int maxAge) {
		// TODO Auto-generated method stub
		return null;
	}
    /**
     * 按条件获取公司动态信息的记录总条数
     * @return int
     */	
	@Override
	public int queryPersonCarCount(Object object) {
		// TODO Auto-generated method stub
		return trendsDao.queryPersonCarCount(object);
	}
/**
 * 按条件分页获取公司动态消息信息
 * @param curPage 当前页数
 * @param rowsPrePage
 * @return Map<Long,Object>
 */	
	@Override
	public Map<Long, Object> showPersonCarList(int curPage, int rowsPrePage,
			Object object) {
		// TODO Auto-generated method stub
		return trendsDao.showPersonCarList(curPage, rowsPrePage, object);
	}
       /**
        * 按条件获取动态消息的服务
        * @return Trends 
        */
	@Override
	public Trends getTrendsByWhere(Trends trends) {
		// TODO Auto-generated method stub
		return trendsDao.getTrendsByWhere(trends);
	}
	/**
        * 添加动态消息的服务
        * @return boolean 
        */
	@Override
	public boolean addTrends(Trends trends) {
		// TODO Auto-generated method stub
		boolean flag=false;
		if(trendsDao.addTrends(trends)>0){
			flag=true;
		}
		return flag;
	}
	 /**
        * 删除动态消息的服务
        * @return boolean 
        */
	@Override
	public boolean deleteTrends(Trends trends) {
		// TODO Auto-generated method stub
		boolean flag=false;
		if(trendsDao.deleteTrends(trends)>0){
			flag=true;
		}
		return flag;
	}
       /**
        * 修改动态消息的服务
        * @return boolean 
        */
	@Override
	public boolean updateTrends(Trends trends) {
		// TODO Auto-generated method stub
		boolean flag=false;
		if(trendsDao.updateTrends(trends)>0){
			flag=true;
		}
		return flag;
	}

}
