package cn.com.service;

import java.util.Map;

import cn.com.bean.CarInfo;
import cn.com.bean.ProcedureInfo;
/**
 * 手续信息服务接口
 * @author lej
 */
public interface IProcedureInfoService {
  /**
   * 
   * 获取所有手续信息的服务
   *@return Map<Long,ProcedureInfo> 
   */
	public Map<Long, ProcedureInfo> getAllProcedureInfo();
  /**
   * 
   * 根据编号获取手续信息的服务
   *@return ProcedureInfo
   */
	public ProcedureInfo getProcedureInfoById(CarInfo carInfo);
  /**
   * 
   * 添加手续信息的服务
   *@return boolean
   */
	public boolean addProcedureInfo(ProcedureInfo procedureInfo);
  /**
   * 
   * 修改手续信息的服务
   *@return  boolean
   */
	public boolean updateProcedureInfo(ProcedureInfo procedureInfo);
/**
 * 根据车主编号删除手续信息的服务
 *@return boolean  
 */
	public boolean deleteprocedureinfouser(ProcedureInfo p);
/**
 * 根据车编号删除手续信息的服务
 *@return boolean  
 */
	public boolean deletecidprocedureinfouser(ProcedureInfo p);
/**
 * 
 * 检查是否还有与某车主编号关联的手续信息的服务
 * @return boolean
 */
	public boolean checkprocedureinfouser(ProcedureInfo p);
/**
 * 
 * 检查是否还有与某车编号关联的手续信息的服务
 * @return boolean
 */
	public boolean checkcidprocedureinfouser(ProcedureInfo p);
}
