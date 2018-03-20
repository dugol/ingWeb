package co.edu.udea.iw.DAO.IMPL;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import co.edu.udea.iw.DAO.DataSource;
import co.edu.udea.iw.DAO.RolDAO;
import co.edu.udea.iw.DTO.Ciudad;
import co.edu.udea.iw.DTO.Rol;
import co.edu.udea.iw.EXCEPTION.ClassException;

public class RolDAOImpl implements RolDAO {

	public RolDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertar(Rol rol) throws ClassException {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Rol rol) throws ClassException {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Rol rol) throws ClassException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Rol> obtener() throws ClassException {
		Session session=null;
		DataSource ds= new DataSource();
		List<Rol> roles=null;
		try {
			session=ds.getSession();
			Criteria crit=session.createCriteria(Rol.class)
					.addOrder(Order.asc("Nombre"));
			roles=crit.list();
		}catch(HibernateException e) {
			throw new ClassException();
		}
		return roles;
		
	}

}
