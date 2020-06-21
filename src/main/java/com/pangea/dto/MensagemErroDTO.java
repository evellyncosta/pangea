package com.pangea.dto;
import java.util.Date;
import java.util.List;

public class MensagemErroDTO {
	 private List<String> mensagens;

	    private Date dataErro;

	    public List<String> getMensagens() {
	        return mensagens;
	    }

	    public void setMensagens(List<String> mensagens) {
	        this.mensagens = mensagens;
	    }

	    public Date getDataErro() {
	        return dataErro;
	    }

	    public void setDataErro(Date dataErro) {
	        this.dataErro = dataErro;
	    }

	    public static MensagemErroDTO build(List<String> mensagem){

	    	MensagemErroDTO mensagemErroDTO = new MensagemErroDTO();
	    	mensagemErroDTO.setMensagens(mensagem);
	    	mensagemErroDTO.setDataErro(new Date());

	        return mensagemErroDTO;

	    }

}
