package co.edu.udea.iw.util.encode;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * Clase que ofrece utilidades para el cifrado de datos
 * @author Grupo 4
 * @version 1.0
 */
public class Cifrar {
	
	public static final String CHARSET = "UTF8";
	public static final String ENC_ALGORITM_NAME = "MD5";
	
	/**
	 * Recibe un mensaje y lo retorna ya encriptado
	 * @param message Mensaje a ser encriptado
	 * @return Mensaje encriptado
	 */
	public String encrypt(String message) {
		try {
			byte[] defaultBytes = message.getBytes(CHARSET);
			MessageDigest algorithm = MessageDigest.getInstance(ENC_ALGORITM_NAME);
			algorithm.reset();
			byte[] messageDigest = algorithm.digest(defaultBytes);
			return new String(Base64Coder.encode(messageDigest));
		} catch(NoSuchAlgorithmException nsae){
			nsae.printStackTrace();
		    return message;
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
			return message;
		} 
	}

}