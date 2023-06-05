/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programa��o Orientada a Objetos
 * Prof. Fausto Maranh�o Ayres
 **********************************/

public class Produto {
		private String nome;
		private double preco;
		private Prateleira prateleira;
		private Fabricante fabricante;
	
		public Produto(String nome, double preco) {
			super();
			this.nome = nome;
			this.preco = preco;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public double getPreco() {
			return preco;
		}
		
		public void setPreco(double preco) {
			this.preco = preco;
		}		
		
		//---------------------------------------
		public Prateleira getPrateleira() {
			return prateleira;
		}
		public void setPrateleira(Prateleira prateleira) {
			this.prateleira = prateleira;
		}
		
		public Fabricante getFabricante() {
			return fabricante;
		}

		public void setFabricante(Fabricante fabricante) {
			this.fabricante = fabricante;
		}

		@Override
		public String toString() {
			String texto = "nome=" + nome + ", preco=" + preco ;
			
			if (prateleira == null)
				texto += ", sem prateleira";
			else
				texto += ", prateleira=" + prateleira.getId();
			
			return texto;
					
		}

	
}
