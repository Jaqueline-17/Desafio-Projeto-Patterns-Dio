package dio.padroes.Facade;

import dio.padroes.Subsistema1Crm.CrmService;
import dio.padroes.Subsistema2Cep.CepApi;

public class Facade {
    
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
