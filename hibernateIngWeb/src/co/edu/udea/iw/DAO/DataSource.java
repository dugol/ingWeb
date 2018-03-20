package co.edu.udea.iw.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.edu.udea.iw.EXCEPTION.ClassException;

public class DataSource {

	public DataSource() {
		
	}
	
	public Session getSession() throws ClassException{
		SessionFactory sessionFactory=null;
		Configuration configuration=new Configuration();
		try {
			if(sessionFactory==null){
				configuration.configure("co/edu/udea/iw/DAO/hibernate.cfg.xml");
				sessionFactory=configuration.buildSessionFactory();
			}
			return sessionFactory.openSession();
			
		}catch(HibernateException e) {
			throw new ClassException(e);
		}
	}

}
