package co.edu.udea.iw.dao.hibernate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dao.HibernateSessionFactory;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.IWDaoException;

public class ClienteDAOHibernate implements ClienteDAO {

	@Override
	public Cliente insertar(Cliente cliente) throws IWDaoException {
		
		Transaction tx = null;
		Session session = null;
		try{
			session = HibernateSessionFactory.getInstancia().getSession();
			
			tx = session.beginTransaction();
			session.save(cliente);
			tx.commit();
			
			
		}catch(HibernateException e){
			throw new IWDaoException(e);
		}finally{
			session.close();
		}
		
		return cliente;
	}

	@Override
	public Cliente modificar(Cliente cliente) throws IWDaoException {
		Transaction tx = null;
		Session session = null;
		try{
			session = HibernateSessionFactory.getInstancia().getSession();
			
			tx = session.beginTransaction();
			session.update(cliente);
			tx.commit();
			
			
		}catch(HibernateException e){
			throw new IWDaoException(e);
		}finally{
			session.close();
		}
		
		return cliente;
	}

	@Override
	public void eliminar(Cliente cliente) throws IWDaoException {
		Transaction tx = null;
		Session session = null;
		try{
			session = HibernateSessionFactory.getInstancia().getSession();
			
			tx = session.beginTransaction();
			cliente.setEliminado(true);
			cliente.setFechaEliminacion(new Date());
			session.update(cliente);
			tx.commit();
			
			
		}catch(HibernateException e){
			throw new IWDaoException(e);
		}finally{
			session.close();
		}
	}

	@Override
	public List<Cliente> obtener() throws IWDaoException {
		List<Cliente> clientes = new ArrayList<Cliente>();
		Session session = null;
		try{
			session = HibernateSessionFactory.getInstancia().getSession();
			
			Criteria criteria = session.createCriteria(Cliente.class);
			
			clientes = criteria.list();
			
		}catch(HibernateException e){
			throw new IWDaoException(e);
		}finally{
//			session.close();
		}
		
		return clientes;
	}

	@Override
	public Cliente obtener(String cedula) throws IWDaoException {
		Cliente cliente = null;
		Session session = null;
		try{
			session = HibernateSessionFactory.getInstancia().getSession();
			
			cliente = (Cliente)session.load(Cliente.class, cedula);
			
		}catch(HibernateException e){
			throw new IWDaoException(e);
		}finally{
			session.close();
		}
		
		return cliente;
	}

}
