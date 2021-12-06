package actividad04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
	private String username;
	private String password;
	static private File archivo = new File("datos_login.txt");
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return "Usuario: "+this.username + " - Contraseña: " + this.password;
	}
	
	public void saveUser() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
			oos.writeObject(this);
			oos.close();
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static public User getUser() {
		//LEER EL ARCHIVO
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
			User user = (User) ois.readObject();
			ois.close();
			return user;
		} catch (FileNotFoundException e) {
			e.getMessage();
		}catch (IOException e) {
			e.getMessage();
		}catch (ClassNotFoundException e) {
			e.getMessage();
		}catch (Exception e) {
			e.printStackTrace();
		} return null;
	}
}
