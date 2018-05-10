package co.edu.udea.iw.Restws;


import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.udea.iw.bl.ClienteBL;
import co.edu.udea.iw.bl.impl.ClienteBlimpl;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.ClienteServiceDTO;
import co.edu.udea.iw.exception.IWDaoException;

@Path("Cliente")
@Component
public class ClientService {

	@Autowired
	private ClienteBL clienteBlimpl;
	
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@GET
	public List<ClienteServiceDTO> obtener() throws RemoteException{
		
		List<ClienteServiceDTO> clientes=new ArrayList<>();
		List<Cliente> listaClientes=null;
		try{
			listaClientes=clienteBlimpl.obtener();
			
			for(Cliente cliente: listaClientes){
				ClienteServiceDTO clienteServiceDto=new ClienteServiceDTO();
				clienteServiceDto.setNombres(cliente.getNombres());
				clienteServiceDto.setApellidos(cliente.getApellidos());
				clienteServiceDto.setCedula(cliente.getCedula());
				clienteServiceDto.setCorreoElectronico(cliente.getCorreoElectronico());
				
				clientes.add(clienteServiceDto);
			}
		}catch(IWDaoException e){
			throw new RemoteException(e.getMessage());
		}
		return clientes;
		
		
	}
	
	@Produces(MediaType.TEXT_PLAIN)
	@POST
	public String guardarCliente(Cliente cliente){
		
		try{
			clienteBlimpl.insertar(cliente);
		}catch(IWDaoException e){
			return e.getMessage();
		}
		return "";
	}
}