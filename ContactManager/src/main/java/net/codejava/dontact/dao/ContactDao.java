package net.codejava.dontact.dao;

import java.util.List;

import net.codejava.contact.Contact;

public interface ContactDao {

	
	    public int update(Contact contact);
     
	    
	     
	    public Contact get(Integer id);
	     
	    public List<Contact> list();

		public int save(Contact contact);

		public int  delete(Integer id);
	

}
