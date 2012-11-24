package tn.app.ctrl;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.app.model.User;


@ManagedBean(name="auth")
@SessionScoped
public class AuthCtrl {
	
	private User user;
	private List<User> users;

	public AuthCtrl() {
	}

	public User getUser() {
		if(user == null)
			user = new User();
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		if(users == null)
			users = new ArrayList<User>();
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public String addUser(){
		users.add(user);
		return "";
	}
	
	
	
	

}
