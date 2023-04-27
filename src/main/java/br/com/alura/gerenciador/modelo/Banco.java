package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSenquencial = 1;
	
	 static {
	        Empresa empresa = new Empresa();
	        empresa.setId(chaveSenquencial++);
	        empresa.setNome("TecToy");
	        Empresa empresa2 = new Empresa();
	        empresa2.setId(chaveSenquencial++);
	        empresa2.setNome("Nintendo");
	        Empresa empresa3 = new Empresa();
	        empresa3.setNome("Sony");
	        
	        lista.add(empresa);
	        lista.add(empresa2);
	        lista.add(empresa3);

	    }
	
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSenquencial++);
		Banco.lista.add(empresa);//adiciona uma empresa nova
	}
	public List<Empresa> getEmpresas() {
		return Banco.lista; //devolve empresas
	}
	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
}
		
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				lista.remove(empresa);
			}
		}
   }
	public Empresa buscaEmpresaPelaId(Integer id) {
		
		for (Empresa empresa: lista) { 
	        if(empresa.getId() == id)  {
	            return empresa;
	        }

	    }
		
		return null;
	}
}
