import java.util.List;

import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dao.hibernate.ClienteDAOHibernate;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.IWDaoException;


public class ProbarCliente {

	public static void main(String[] args) {
		
		ClienteDAO clienteDao = null;
		
		try{
			clienteDao = new ClienteDAOHibernate();
			
			List<Cliente> clientes = clienteDao.obtener();
			for(Cliente cliente : clientes){
				System.out.println("Identificacion: " + cliente.getCedula());
				System.out.println("Nombres: " + cliente.getNombres() + " " + cliente.getApellidos());
				System.out.println("Nombre usuario crea: " + cliente.getUsuarioCrea().getNombres() + " " + cliente.getUsuarioCrea().getApellidos());
				System.out.println("Rol usuario crea: " + cliente.getUsuarioCrea().getRol().getNombre());
			}
			
		}catch (IWDaoException e){
			System.out.println(e.getMessage());
		}

	}

}