package co.edu.udea.iw.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.iw.dao.HibernateSessionFactory;
import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.IWDaoException;

public class UsuarioDAOHibernate implements UsuarioDAO{
	
	@Override
	public List<Usuario> obtener() throws IWDaoException {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		try{
			Session session = HibernateSessionFactory.getInstancia().getSession();
			
			Criteria criteria = session.createCriteria(Usuario.class);
			
			usuarios = criteria.list();
		}catch(HibernateException e){
			throw new IWDaoException(e);
		}
		
		return usuarios;
	}

	@Override
	public Usuario obtener(String login) throws IWDaoException {
		Usuario usuario = null;

		try{
			Session session = HibernateSessionFactory.getInstancia().getSession();
			
			//get trae nulo si el objeto no existe- load trae una exception
			usuario = (Usuario)session.load(Usuario.class, login);

		}catch(HibernateException e){
			throw new IWDaoException(e);
		}
		
		return usuario;
	}

}
