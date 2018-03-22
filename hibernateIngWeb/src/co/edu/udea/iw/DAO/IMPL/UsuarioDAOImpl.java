package co.edu.udea.iw.DAO.IMPL;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import co.edu.udea.iw.DAO.DataSource;
import co.edu.udea.iw.DAO.UsuarioDAO;
import co.edu.udea.iw.DTO.Rol;
import co.edu.udea.iw.DTO.Usuario;
import co.edu.udea.iw.EXCEPTION.ClassException;

public class UsuarioDAOImpl implements UsuarioDAO {

	public UsuarioDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertar(Usuario usuario) throws ClassException {
		Session session=null;
		Transaction tx=null;
		DataSource ds=new DataSource();
		try {
			session=ds.getSession();
			tx=session.beginTransaction();
			session.save(usuario);
			tx.commit();
		}catch(HibernateException e) {
			throw new ClassException(e);
		}
		

	}

	@Override
	public void actualizar(Usuario usuario) throws ClassException {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Usuario usuario) throws ClassException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Usuario> obtener() throws ClassException {
		Session session=null;
		DataSource ds= new DataSource();
		List<Usuario> usuarios=null;
		try {
			session=ds.getSession();
			Criteria crit=session.createCriteria(Usuario.class)
					.addOrder(Order.asc("nombres"));
			usuarios=crit.list();
		}catch(HibernateException e) {
			throw new ClassException(e);
		}
		return usuarios;
	}

}
