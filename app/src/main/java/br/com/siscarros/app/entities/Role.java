package br.com.siscarros.app.entities;

import javax.persistence.*;


@Entity
@Table(name="tbl_role")
public class Role {
	
    @Id
	private String role;


	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}



	

}
