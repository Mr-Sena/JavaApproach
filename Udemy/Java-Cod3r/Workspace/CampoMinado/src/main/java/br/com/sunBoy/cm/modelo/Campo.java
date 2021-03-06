package br.com.sunBoy.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.sunBoy.cm.excecao.ExplosaoException;

public class Campo {

	private final int linha;
	private final int coluna;
	private boolean minado;
	private boolean aberto;
	private boolean marcado;
	
	private List<Campo> vizinhos = new ArrayList();
	
	public Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	
	public boolean adicionarVizinho(Campo vizinho) {
		
		boolean linhaDiferente = linha != vizinho.linha;
		
		boolean colunaDiferente = coluna != vizinho.coluna;
		
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;
		
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if (deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;  
		} else return false;
		
	}
	
	
	
	public void alternarMarcacao() {
		if (!aberto) {
			marcado = !marcado;
		}
	}
	
	
	public boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(vizinho -> vizinho.minado);
	}
	
	
	
	public boolean abrir() {
		if (!aberto && !marcado) {
			aberto = true;
			
			if(minado) {
				throw new ExplosaoException();
			}
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir() );
			}
			
			return true; 
		}
		
		return false;
	}
	
	
	public void minar() {
		minado = true;
	}
	
	
	
	
	public boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}
	
	public long minasNaVizinhanca() {
		
		return vizinhos.stream().filter(v -> v.minado).count();
		
	}
	
	
	public void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	
	
	
	public String toString() {
		if (marcado) return "x";
		else if (aberto && minado) return "*";
		else if (aberto && minasNaVizinhanca() > 0)
			return Long.toString(minasNaVizinhanca());
		else if(aberto) return " ";
		else return "?";
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	//Getters and Setters
	
	
	public boolean isMinado() {
		return minado;
	}


	public void setMinado(boolean minado) {
		this.minado = minado;
	}


	public List<Campo> getVizinhos() {
		return vizinhos;
	}


	public void setVizinhos(List<Campo> vizinhos) {
		this.vizinhos = vizinhos;
	}


	public int getLinha() {
		return linha;
	}


	public int getColuna() {
		return coluna;
	}
	
	
	
	
	public boolean isAberto() {
		return aberto;
	}
	public boolean isFechado() {
		return !isAberto();
	}
	
	


	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}


	public boolean isMarcado() {
		return marcado;
	}


	public void setMarcado(boolean marcado) {
		this.marcado = marcado;
	}


	
	
	
	
	
}
