package cc.smh.common.service;

import java.util.List;

import cc.smh.common.bean.BaseTO;
import cc.smh.common.exception.DaoException;

public interface BaseService {

	/**
	 * 保存实例
	 * 
	 * @param oTO
	 * @throws DaoException
	 */
	public void editSave(BaseTO oTO) throws DaoException;
	
	/**
	 * 修改实例
	 * 
	 * @param oTO
	 * @throws DaoException
	 */
	public void editUpdate(BaseTO oTO) throws DaoException;
	
	/**
	 * 保存或修改实例
	 * 
	 * @param oTO
	 * @throws DaoException
	 */
	public void edit(BaseTO oTO) throws DaoException;

	/**
	 * 删除实例
	 * 
	 * @param oTO
	 * @throws DaoException
	 */
	public void delete(BaseTO oTO) throws DaoException;
	public List<BaseTO> queryAll(String hql) throws DaoException;
}
