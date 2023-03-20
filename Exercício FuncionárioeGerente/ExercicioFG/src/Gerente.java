public class Gerente extends Funcionario {
        private int senha = 1485;
        private int FuncionariosGerenciados;
        
        public int getSenha() {
			return senha;
		}
		public void setSenha(int senha) {
			this.senha = senha;
		}
		public int getFuncionariosGerenciados() {
			return FuncionariosGerenciados;
		}
		public void setFuncionariosGerenciados(int funcionariosGerenciados) {
			FuncionariosGerenciados = funcionariosGerenciados;
		}
		@Override
		public double getBonificacao() {
			return salario = salario + (salario * 0.15);
		}
		public boolean acesso(int senha) {
            if (this.senha == senha) {
                System.out.println("Acesso Permitido");
                return true;
            } else {
               System.out.println("Acesso Negado");
                return false;
            }
        }
    }
