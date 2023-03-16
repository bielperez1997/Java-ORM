package br.com.fiap.smartcities;

import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_Estabelecimento")

public class Estabelecimento {
		
		@Id
		@Column(name="cd_Estabelecimento")
		private int codigo;
		
		@Column(name="nm_Estabelecimento",nullable=false,length=50)
		private String nome;
		@CreationTimestamp
		@Column(name="dt_cadastroEstabelecimento")
		private Calendar dataCadastro;
		
		@UpdateTimestamp
		@Column(name="dt_Modificacao")
		private Calendar dataModificacao;
		
		public Estabelecimento() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Estabelecimento(int codigo, String nome, Calendar dataCadastro, Calendar dataModificacao) {
			super();
			this.codigo = codigo;
			this.nome = nome;
			this.dataCadastro = dataCadastro;
			this.dataModificacao = dataModificacao;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Calendar getDataCadastro() {
			return dataCadastro;
		}

		public void setDataCadastro(Calendar dataCadastro) {
			this.dataCadastro = dataCadastro;
		}

		public Calendar getDataModificacao() {
			return dataModificacao;
		}

		public void setDataModificacao(Calendar dataModificacao) {
			this.dataModificacao = dataModificacao;
		}
		
}
