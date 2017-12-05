package co.simplon.gestionstock.utilisateur;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;

public class Sauvegarde implements Serializable {

	Sauvegarde codeParc;
	String code;

	public void sauvegarde(String code) {
	ObjectOutputStream oos;{
// , StandardCharsets.UTF_8
	try
	{
		oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Sauvegarde.txt"))));
//		oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Sauvegarde.txt"), StandardCharsets.UTF_8));
		oos.writeObject(codeParc);
		oos.close();
	}

	catch(
	IOException e)
	{
		e.printStackTrace();
	}

	ObjectInputStream ois;

	try
	{
		ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("Sauvegarde.txt"))));
		codeParc = (Sauvegarde) ois.readObject();
		ois.close();
	}catch(
	IOException l)
	{
		l.printStackTrace();
	}catch(
	ClassNotFoundException e2)
	{
		e2.printStackTrace();
	}

}
	}
}