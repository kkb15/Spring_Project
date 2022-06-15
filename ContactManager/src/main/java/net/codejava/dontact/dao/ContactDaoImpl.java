  package net.codejava.dontact.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import net.codejava.contact.Contact;

public class ContactDaoImpl implements ContactDao {
	private JdbcTemplate jdbcTemplate;
	 
	public ContactDaoImpl(DataSource dataSource) {
	    this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int save(Contact c) {
		String sql="Insert into contact(name,email,address,phone) values(?,?,?,?)";
		return  jdbcTemplate.update(sql,c.getName(),c.getEmail(),c.getAddress(),c.getTelephone());
		
	}

	@Override
	public int update(Contact c) {
		 String sql = "UPDATE contact SET name=?, email=?, address=?, "
                 + "phone=? WHERE contact_id=?";
     return jdbcTemplate.update(sql, c.getName(), c.getEmail(),
             c.getAddress(), c.getTelephone(), c.getId());
		
		
	}

	@Override
	public int delete(Integer id) {
		    String sql = "DELETE FROM contact WHERE contact_id="+id;
		 
		    return jdbcTemplate.update(sql);
		
	}

	@Override
	public Contact get(Integer id) {
		String sql="select* from contact where contact_id="+id;
		ResultSetExtractor<Contact> extractor =new ResultSetExtractor<Contact>() {

			@Override
			public Contact extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					String name=rs.getString("name");
					String email=rs.getString("email");
					String address=rs.getString("address");
					String telephone=rs.getString("phone");
					
					return new Contact(id,name,email,address,telephone);
				}
				return null;
			}
		};
		return jdbcTemplate.query(sql,extractor);
	}

	@Override
	public List<Contact> list() {
		String sql="SELECT* FROM contact";
		RowMapper<Contact> rowMapper =new RowMapper<Contact>() {

			

			@Override
			public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
				Integer id=rs.getInt("contact_id");
				String name=rs.getString("name");
				String email=rs.getString("email");
				String address=rs.getString("address");
				String telephone=rs.getString("phone");
				return new Contact(id,name,email,address,telephone);
			}
		};
		return jdbcTemplate.query(sql,rowMapper);
	}
}
