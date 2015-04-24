package interfaces;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LectorFile {
	private File archivo;
	public LectorFile(File f){
		archivo = f;
	}
	public String leer(){
		String s = "";
		try(Scanner in = new Scanner(archivo);) {
			int contador = 1;
			while(in.hasNext()){
				s+=in.next()+" ";
				if(contador%5==0)s+="\n";
				contador++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}
}
