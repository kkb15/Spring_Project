package net.codejava.dontact.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import net.codejava.contact.Contact;

class ContactDaoTest {
	private DriverManagerDataSource dataSource;
	private ContactDao dao;
	
	@BeforeEach
	void setupBeforeEach() {
		dataSource =new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/contactdb");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		
		dao=new ContactDaoImpl(dataSource);
	}

	@Test
	void testSave() {

		Contact contact =new Contact("Kamal","abc@gmail.com","afdf,CA","34353423");
		int result= dao.save(contact);
		
		assertTrue(result>0);
		
	}

	@Test
	void testUpdate() {
		Contact contact =new Contact(4,"Harish","harish@gmail.com","f,CA","343353");
        int result= dao.update(contact);
		
		assertTrue(result>0);
	}

	@Test
	void testDelete() {
		Integer id=2;
		int result=dao.delete(id);
		
		assertFalse(result>0);
		
	}

	@Test
	void testGet() {
		Integer id=1;
		Contact contact=dao.get(id);
		if(contact !=null) {
			System.out.println(contact);
		}
		
		assertNotNull(contact);
		
	}

	@Test
	void testList() {
		List<Contact> listContacts=dao.list();
		for(Contact aContact:listContacts) {
			System.out.println(aContact);
		}
		
		assertTrue(!listContacts.isEmpty());
	}

}
