package cc.smh.common.dao.impl;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cc.smh.common.bean.BaseTO;
import cc.smh.common.dao.IBaseDao;
import cc.smh.common.exception.DaoException;



/**
 * DAO基类
 * @date 2011/04/07
 */
@Repository
public class BaseDao implements IBaseDao{
	
    @Autowired
	private SessionFactory sessionFactory;

	/**
	 * 保存实例
	 * 
	 * @param oTO
	 * @throws DaoException
	 */
	public void editSave(BaseTO oTO) throws DaoException {
		try {
			sessionFactory.getCurrentSession().save(oTO);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(this.getClass(), e.getMessage());
		}
	}

	/**
	 * 修改实例
	 * 
	 * @param oTO
	 * @throws DaoException
	 */
	public void editUpdate(BaseTO oTO) throws DaoException {
		try {
			sessionFactory.getCurrentSession().update(oTO);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(this.getClass(), e.getMessage());
		}
	}

	/**
	 * 保存或修改实例
	 * 
	 * @param oTO
	 * @throws DaoException
	 */
	public void edit(BaseTO oTO) throws DaoException {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(oTO);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(this.getClass(), e.getMessage());
		}
	}

	/**
	 * 删除实例
	 * 
	 * @param oTO
	 * @throws DaoException
	 */
	public void delete(BaseTO oTO) throws DaoException {
		try {
			sessionFactory.getCurrentSession().delete(oTO);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(this.getClass(), e.getMessage());
		}
	}

	@Override
	public List<BaseTO> queryAll(String hql) throws DaoException {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery(hql).list();
	}

	
}
