package com.viniciuspontes.cursomc.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(0, "Pendente"),
	QUITADO(1, "Quitado"),
	CANCELADO(2, "Cancelado");
	
    private Integer codigo;
    private String descricao;

    private EstadoPagamento(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static EstadoPagamento toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }
        for (EstadoPagamento estadoPagamento: EstadoPagamento.values()) {
            if (codigo.equals(estadoPagamento.getCodigo())) {
                return estadoPagamento;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + codigo);
    }
	

}
