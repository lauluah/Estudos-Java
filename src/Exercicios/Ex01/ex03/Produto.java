package Exercicios.Ex01.ex03;

import java.util.ArrayList;
import java.util.List;

public class Produto{
        public String codigo;
        public double precoUnitario = 0.0;
        public int quantidade;

        public Produto(String codigo, double precoUnitario, int quantidade) {
            this.codigo = codigo;
            this.precoUnitario = precoUnitario;
            if (quantidade < 0) {
                quantidade = 0;
            } else {
                this.quantidade = quantidade;
            }
        }
}

