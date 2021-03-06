package com.github.Eddyosos.integracao20171.esus.transport;

import br.gov.saude.esus.transport.common.api.configuracaodestino.VersaoThrift;
import br.gov.saude.esus.transport.common.generated.thrift.DadoTransporteThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.transport.IDadoInstalacao;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.transport.IDadoTransporte;
import java.nio.ByteBuffer;
import java.util.UUID;
import org.apache.thrift.TException;

public class DadoTransporte implements IDadoTransporte {
    private DadoTransporteThrift instance;

    public DadoTransporte(DadoTransporteThrift instance) {
        this.instance = instance;
    }

    public DadoTransporte() {
        instance = new DadoTransporteThrift();
        
        //Define a versão do esusab como 2
        instance.setVersao(new VersaoThrift(2, 0, 0));
    }

    /**
     * Remove o conteúdo da instância.
     */
    @Override
    public void clear() {
        instance.clear();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return Código UUID
     */
    @Override
    public String getUuidDadoSerializado() {
        return instance.getUuidDadoSerializado();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * 
     * Presença obrigatória
     * Regras: É recomendado concatenar o CNES na frente do UUID, 
     * de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen)
     * do UUID são a limitação de 44 bytes do campo. Formato canônico
     * 
     * Tamanho mínimo: 36
     * Tamanho máximo: 44
     * 
     * @param uuidDadoSerializado Código UUID
     */
    @Override
    public void setUuidDadoSerializado(String uuidDadoSerializado) {
        instance.setUuidDadoSerializado(uuidDadoSerializado);
    }

    /**
     * Remove o UuidFicha
     */
    @Override
    public void unsetUuidDadoSerializado() {
        instance.unsetUuidDadoSerializado();
    }

    /**
     * Verifica se a ficha possui um uuid
     * @return True caso possua um uuid
     */
    @Override
    public boolean isSetUuidDadoSerializado() {
        return instance.isSetUuidDadoSerializado();
    }
    
    /**
     * Define se o uuid da ficha foi definido.
     * @param value True caso o uuid tenha sido definido.
     */
    @Override
    public void setUuidDadoSerializadoIsSet(boolean value) {
        instance.setUuidDadoSerializadoIsSet(value);
    }

    /**
     * Tipo/classe do objeto serializado através do TBinaryProtocol.
     * 
     * Os tipos podem ser:
     * 2  - Ficha de Cadastro Individual
     * 3  - Ficha de Cadastro Domiciliar	
     * 4  - Ficha de Atendimento Individual
     * 5  - Ficha de Atendimento Odontológico
     * 6  - Ficha de Atividade Coletiva
     * 7  - Ficha de Procedimentos
     * 8  - Ficha de Visita Domiciliar
     * 10 - Ficha de Atendimento Domiciliar
     * 11 - Ficha de Avaliação de Elegibilidade
     * 12 - Marcadores de Consumo Alimentar
     * 
     * @return Tipo/classe do objeto serializado através do TBinaryProtocol.
     */
    @Override
    public long getTipoDadoSerializado() {
        return instance.getTipoDadoSerializado();
    }

    /**
     * Define o tipo/classe do objeto serializado através do TBinaryProtocol.
     * 
     * Presença obrigatória.
     * 
     * Os tipos podem ser:
     * 2  - Ficha de Cadastro Individual
     * 3  - Ficha de Cadastro Domiciliar	
     * 4  - Ficha de Atendimento Individual
     * 5  - Ficha de Atendimento Odontológico
     * 6  - Ficha de Atividade Coletiva
     * 7  - Ficha de Procedimentos
     * 8  - Ficha de Visita Domiciliar
     * 10 - Ficha de Atendimento Domiciliar
     * 11 - Ficha de Avaliação de Elegibilidade
     * 12 - Marcadores de Consumo Alimentar
     * 
     * @param tipoDadoSerializado Tipo/classe do objeto serializado através do TBinaryProtocol.
     */
    @Override
    public void setTipoDadoSerializado(long tipoDadoSerializado) {
        instance.setTipoDadoSerializado(tipoDadoSerializado);
    }

    /**
     * Remove o tipo/classe do objeto serializado através do TBinaryProtocol.
     */
    @Override
    public void unsetTipoDadoSerializado() {
        instance.unsetTipoDadoSerializado();
    }

    /**
     * Verifica se o tipo/classe do objeto serializado através do TBinaryProtocol foi declarado.
     * @return True se tiver sido declarado, caso contrario False.
     */
    @Override
    public boolean isSetTipoDadoSerializado() {
        return instance.isSetTipoDadoSerializado();
    }

    /**
     * Declara que o tipo/classe do objeto serializado através do TBinaryProtocol foi inserido.
     * 
     * @param value True para delcarar que foi inserido, caso contrario False.
     */
    @Override
    public void setTipoDadoSerializadoIsSet(boolean value) {
        instance.setTipoDadoSerializadoIsSet(value);
    }

    /**
     * CNES da unidade de saúde.
     * 
     * @return Código CNES da unidade de saúde.
     */
    @Override
    public String getCnesDadoSerializado() {
        return instance.getCnesDadoSerializado();
    }

    /**
     * Define o CNES da unidade de saúde.
     * 
     * Presença obrigatória.
     * 
     * Tamanho deve ser 7.
     * 
     * @param cnesDadoSerializado Código CNES da unidade de saúde.
     */
    @Override
    public void setCnesDadoSerializado(String cnesDadoSerializado) {
        instance.setCnesDadoSerializado(cnesDadoSerializado);
    }

    /**
     * Remove o CNES da unidade de saúde.
     */
    @Override
    public void unsetCnesDadoSerializado() {
        instance.unsetCnesDadoSerializado();
    }

    /**
     * Verifica se o CNES da unidade de saúde foi declarado.
     * @return True se tiver sido declarado, caso contrario False.
     */
    @Override
    public boolean isSetCnesDadoSerializado() {
        return instance.isSetCnesDadoSerializado();
    }

    /**
     * Declara que o CNES da unidade de saúde foi inserido.
     * 
     * @param value True para declarar que foi inserido, False caso contrario.
     */
    @Override
    public void setCnesDadoSerializadoIsSet(boolean value) {
        instance.setCnesDadoSerializadoIsSet(value);
    }

    /**
     * Código IBGE do dado serializado.
     * 
     * @return Código IBGE do dado serializado através do TBinaryProtocol.
     */
    @Override
    public String getCodIbge() {
        return instance.getCodIbge();
    }

    /**
     * Define o código IBGE do dado serializado.
     * 
     * Presença obrigatória.
     * O tamanho deve ser 7.
     * 
     * @param codIbge Código IBGE do dado serializado através do TBinaryProtocol.
     */
    @Override
    public void setCodIbge(String codIbge) {
        instance.setCodIbge(codIbge);
    }

    /**
     * Remove o código IBGE do dado serializado.
     */
    @Override
    public void unsetCodIbge() {
        instance.unsetCodIbge();
    }

    /**
     * Verifica se o código IBGE do dado serializado foi declarado.
     * 
     * @return True caso tenha sido declarado, caso contrario False.
     */
    @Override
    public boolean isSetCodIbge() {
        return instance.isSetCodIbge();
    }

    /**
     * Declara que o código IBGE do dado serializado foi inserido.
     * 
     * @param value True para declarar que foi inserido, False caso o contrario.
     */
    @Override
    public void setCodIbgeIsSet(boolean value) {
        instance.setCodIbgeIsSet(value);
    }

    /**
     * INE da equipe que gerou a ficha.
     * 
     * @return Código INE da equipe que gerou a ficha.
     */
    @Override
    public String getIneDadoSerializado() {
        return instance.getIneDadoSerializado();
    }

    /**
     * Define o INE da equipe que gerou a ficha.
     * 
     * O tamanho deve ser 10.
     * 
     * @param ineDadoSerializado Código INE da equipe que gerou a ficha.
     */
    @Override
    public void setIneDadoSerializado(String ineDadoSerializado) {
        instance.setIneDadoSerializado(ineDadoSerializado);
    }

    /**
     * Remove o INE da equipe que gerou a ficha.
     */
    @Override
    public void unsetIneDadoSerializado() {
        instance.unsetIneDadoSerializado();
    }

    /**
     * Verifica se o INE da equipe que gerou a ficha foi declarado.
     * 
     * @return True caso tenha sido declarado, False caso contrario.
     */
    @Override
    public boolean isSetIneDadoSerializado() {
        return instance.isSetIneDadoSerializado();
    }

    /**
     * Declara que o INE da equipe que gerou a ficha foi inserido.
     * 
     * @param value True para declarar que foi inserido, False caso o contrario.
     */
    @Override
    public void setIneDadoSerializadoIsSet(boolean value) {
        instance.setIneDadoSerializadoIsSet(value);
    }

    /**
     * Número do lote para controle interno dos arquivos enviados.
     * 
     * @return Número do lote para controle interno dos arquivos enviados.
     */
    @Override
    public long getNumLote() {
        return instance.getNumLote();
    }

    /**
     * Define o número do lote para controle interno dos arquivos enviados.
     * 
     * @param numLote Número do lote para controle interno dos arquivos enviados.
     */
    @Override
    public void setNumLote(long numLote) {
        instance.setNumLote(numLote);
    }

    /**
     * Remove o número do lote.
     */
    @Override
    public void unsetNumLote() {
        instance.unsetNumLote();
    }

    /**
     * Verifica se o número do lote foi declarado.
     * 
     * @return True caso tenha sido declarado, caso contrario False.
     */
    @Override
    public boolean isSetNumLote() {
        return instance.isSetNumLote();
    }

    /**
     * Declara se o número do lote foi inserido.
     * 
     * @param value True para declarar que foi inserido, False caso contrario.
     */
    @Override
    public void setNumLoteIsSet(boolean value) {
        instance.setNumLoteIsSet(value);
    }

    /**
     * Dado serializado através do TBinaryProtocol a partir de uma ficha.
     * 
     * @return Dado serializado através do TBinaryProtocol a partir de uma ficha.
     */
    @Override
    public byte[] getDadoSerializado() {
        return instance.getDadoSerializado();
    }

    @Override
    public ByteBuffer bufferForDadoSerializado() {
        return instance.bufferForDadoSerializado();
    }

    /**
     * Define o dado serializado através do TBinaryProtocol a partir de uma ficha
     * 
     * Presença obrigatória.
     * 
     * @param dadoSerializado Dado serializado através do TBinaryProtocol a partir de uma ficha
     */
    @Override
    public void setDadoSerializado(byte[] dadoSerializado) {
        instance.setDadoSerializado(dadoSerializado);
    }

    /**
     * define o dado serializado
     * 
     * @param dadoSerializado Dado serializado.
     */
    @Override
    public void setDadoSerializado(ByteBuffer dadoSerializado) {
        instance.setDadoSerializado(dadoSerializado);
    }

    /**
     * Remove o dado serializado.
     */
    @Override
    public void unsetDadoSerializado() {
        instance.unsetDadoSerializado();
    }

    /**
     * Verifica se o dado serializado  foi declarado.
     * 
     * @return True caso tenha sido declarado, caso contrario False.
     */
    @Override
    public boolean isSetDadoSerializado() {
        return instance.isSetDadoSerializado();
    }

    /**
     * Declara que o dado serializado  foi inserido.
     * 
     * @param value True para declarar que foi inserido, caso contrario False.
     */
    @Override
    public void setDadoSerializadoIsSet(boolean value) {
        instance.setDadoSerializadoIsSet(value);
    }

    /**
     * Identifica a instalação que enviou o dado.
     * 
     * @return Identifica a instalação que enviou o dado.
     */
    @Override
    public IDadoInstalacao getRemetente() {
        return new DadoInstalacao(instance.getRemetente());
    }

    /**
     * Define a instalação que enviou o dado.
     * 
     * Presença obrigatória.
     * 
     * @param remetente instalação que enviou o dado.
     */
    @Override
    public void setRemetente(IDadoInstalacao remetente) {
        instance.setRemetente(remetente.getInstance());
    }

    /**
     * Remove a instalação que enviou o dado.
     */
    @Override
    public void unsetRemetente() {
        instance.unsetRemetente();
    }

    /**
     * Verifica se a instalação que enviou o dado foi declarada.
     * 
     * @return True caso tenha sido declarada.
     */
    @Override
    public boolean isSetRemetente() {
        return instance.isSetRemetente();
    }

    /**
     * Declara que a instalação que enviou o dado foi inserida.
     * 
     * @param value True para declarar que foi inserida, caso contrario False.
     */
    @Override
    public void setRemetenteIsSet(boolean value) {
        instance.setRemetenteIsSet(value);
    }

    /**
     * Identifica a instalação que cadastrou/digitou.
     * 
     * @return Instalação que cadastrou/digitou
     */
    @Override
    public IDadoInstalacao getOriginadora() {
        return new DadoInstalacao(instance.getOriginadora());
    }

    /**
     * Define instalação que cadastrou/digitou.
     * 
     * @param originadora Instalação que cadastrou/digitou.
     */
    @Override
    public void setOriginadora(IDadoInstalacao originadora) {
        instance.setOriginadora(originadora.getInstance());
    }

    /**
     * Remove a instalação que cadastrou/digitou.
     */
    @Override
    public void unsetOriginadora() {
        instance.unsetOriginadora();
    }

    /**
     * Verifica se a instalação que cadastrou/digitou foi declarada.
     * 
     * @return True caso tenha sido declarada, False caso contrario.
     */
    @Override
    public boolean isSetOriginadora() {
        return instance.isSetOriginadora();
    }

    /**
     * Declara que a instalação que cadastrou/digitou foi inserida.
     * 
     * @param value True para declarar que foi inserida, caso contrario False.
     */
    @Override
    public void setOriginadoraIsSet(boolean value) {
        instance.setOriginadoraIsSet(value);
    }

    @Override
    public boolean validates(){
        try {
            instance.validate();
        } catch (TException ex) {
            return false;
        }
        
        return validateUuidDadoSerializado() &&
                validateTipoDadoSerializado() &&
                validateCnesDadoSerializado() &&
                validateCodIbge() &&
                validateIneDadoSerializado() &&
                validateDadoSerializado() &&
                validateRemetente() &&
                validateOriginadora();
    }
    
    /**
     * Retorna a instância do thrift
     * @return Instância do thrift
     */
    public DadoTransporteThrift getInstance(){
        return this.instance;
    }
    
    /**
     * Valida UuidFicha.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter tamanho entre 36 e 44 (inclusivo)
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateUuidDadoSerializado(){
        final String var = instance.getUuidDadoSerializado();
        if(!instance.isSetUuidDadoSerializado() || 
                var.length() < 36 || 
                var.length() > 44) 
            return false;
        try {
            UUID.fromString(var.substring(0, 36));
        } catch(Exception ex){
            return false;
        }
        return true;
    }
    
    /**
     * Valida o tipo/classe do objeto serializado.
     * 
     * Presença obrigatória.
     * 
     * Os tipos podem ser:
     * 2  - Ficha de Cadastro Individual
     * 3  - Ficha de Cadastro Domiciliar	
     * 4  - Ficha de Atendimento Individual
     * 5  - Ficha de Atendimento Odontológico
     * 6  - Ficha de Atividade Coletiva
     * 7  - Ficha de Procedimentos
     * 8  - Ficha de Visita Domiciliar
     * 10 - Ficha de Atendimento Domiciliar
     * 11 - Ficha de Avaliação de Elegibilidade
     * 12 - Marcadores de Consumo Alimentar
     * 
     * @return True se estiver de acordo com as regras, caso contrario false.
     */
    @Override
    public boolean validateTipoDadoSerializado(){
        if( ! instance.isSetTipoDadoSerializado())return false;
        if(instance.getTipoDadoSerializado() < 2 || 
                instance.getTipoDadoSerializado() > 12 ||
                instance.getTipoDadoSerializado() == 9){
            return false;
        }
        
        return true;
    }
    
    /**
     * Valida o código CNES da unidade de saúde.
     * 
     * Presença obrigatória.
     * 
     * tamanho deve ser 7.
     * 
     * @return True se estiver de acordo com as regras, caso contrario False.
     */
    @Override
    public boolean validateCnesDadoSerializado(){
        if( ! instance.isSetCnesDadoSerializado()) return false;
        
        if(instance.getCnesDadoSerializado() == null || 
                instance.getCnesDadoSerializado().length() != 7) return false;
        
        return true;
        
    }
    
    /**
     * Valida o código CNES da unidade de saúde.
     * 
     * Presença obrigatória.
     * 
     * tamanho deve ser 7.
     * 
     * @return True se estiver de acordo com as regras, caso contrario False.
     */
    @Override
    public boolean validateCodIbge(){
        if( ! instance.isSetCodIbge()) return false;
        
        if(instance.getCodIbge() == null || 
                instance.getCodIbge().length() != 7) return false;
        
        return true;
        
    }
    
    /**
     * Valida o código INE da equipe que gerou a ficha.
     * 
     * tamanho deve ser 10.
     * 
     * @return True se estiver de acordo com as regras, caso contrario False.
     */
    @Override
    public boolean validateIneDadoSerializado(){
        
        if(instance.isSetCodIbge()) {
        
            if(instance.getCodIbge() == null || 
                instance.getCodIbge().length() != 10){
                
                return false;
            }
        }
        
        return true;
        
    }
    
    /**
     * Valida o dado serializado através do TBinaryProtocol a partir de uma ficha.
     * 
     * Presença obrigatória.
     * 
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    @Override
    public boolean validateDadoSerializado(){
        return instance.isSetDadoSerializado();
    }
    
    /**
     * Valida o identificador da instalação que enviou o dado.
     * 
     * Presença obrigatória.
     * 
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    @Override
    public boolean validateRemetente(){
        return instance.isSetRemetente() && this.getRemetente().validates();
    }
    
    /**
     * Valida o identificador da instalação que cadastrou/digitou..
     * 
     * Presença obrigatória.
     * 
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    @Override
    public boolean validateOriginadora(){
        return instance.isSetOriginadora() && this.getOriginadora().validates();
    }
    
    

}

