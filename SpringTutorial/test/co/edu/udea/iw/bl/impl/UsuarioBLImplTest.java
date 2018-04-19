package co.edu.udea.iw.bl.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.iw.bl.UsuarioBL;
import co.edu.udea.iw.exception.IWDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:SpringBeanConfigurationFile.xml")
@Transactional
public class UsuarioBLImplTest {
	
	@Autowired
	UsuarioBL usuarioBL;

	@Test
	public void test(){
		try {
			usuarioBL.autenticar("dugol", "123456789");
		}catch(IWDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}

}
