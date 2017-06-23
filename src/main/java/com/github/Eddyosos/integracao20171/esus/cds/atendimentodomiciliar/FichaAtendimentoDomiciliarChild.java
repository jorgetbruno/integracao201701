package com.github.Eddyosos.integracao20171.esus.cds.atendimentodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentodomiciliar.FichaAtendimentoDomiciliarChildThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;


public class FichaAtendimentoDomiciliarChild {
    FichaAtendimentoDomiciliarChildThrift instancia = new FichaAtendimentoDomiciliarChildThrift();
    
    protected FichaAtendimentoDomiciliarChild(FichaAtendimentoDomiciliarChildThrift fichaAtendimentoDomiciliarChildThrift){
        this.instancia = fichaAtendimentoDomiciliarChildThrift;
    }

    public FichaAtendimentoDomiciliarChild deepCopy() {
        return new FichaAtendimentoDomiciliarChild(instancia.deepCopy());
    }

    /**
     * Código do turno onde aconteceu o atendimento.
     * @return O código do turno onde aconteceu o atendimento.
     */
    public long getTurno() {
        return instancia.getTurno();
    }

    /**
     * Define o turno onde aconteceu o atendimento.
     * Presença obrigatória.
     * @param turno Código do turno onde aconteceu o atendimento.
     */
    public void setTurno(long turno) {
        instancia.setTurno(turno);
    }

    /**
     * Remove o código do turno.
     */
    public void unsetTurno() {
        instancia.unsetTurno();
    }

    /**
     * Verifica se foi notificada a inserção do código do turno do atendimento
     * @return True caso tenha sido notificada a inserção do turno.
     */
    public boolean isSetTurno() {
        return instancia.isSetTurno();
    }

    /**
     * Notifica a inserção do turno do atendimento.
     * @param value True caso deseje informar a inserção do turno.
     */
    public void setTurnoIsSet(boolean value) {
        instancia.setTurnoIsSet(value);
    }

    /**
     * Retorna o CNS do cidadão que participou da atividade.
     * @return CNS do cidadão que participou da atividade.
     */
    public String getCns() {
        return instancia.getCns();
    }

    /**
     * Define o CNS do cidadão que participou da atividade.
     * Presença Opcional.
     * @param cns CNS do cidadão que participou da atividade.
     */
    public void setCns(String cns) {
        instancia.setCns(cns);
    }

    /**
     * Remove o CNS do cidadão que participou da atividade.
     */
    public void unsetCns() {
        instancia.unsetCns();
    }

    /**
     * Verifica se o CNS do cidadão que participou da atividade doi informado.
     * @return True caso tenha sido informado.
     */
    public boolean isSetCns() {
        return instancia.isSetCns();
    }

    /**
     * Define se o CNS do cidadão que participou da atividade foi informado.
     * @param value True caso deseje informar que o cns foi informado.
     */
    public void setCnsIsSet(boolean value) {
        instancia.setCnsIsSet(value);
    }

    /**
     * Data de nascimento do cidadão.
     * @return Data de nascimento do cidadão.
     */
    public long getDataNascimento() {
        return instancia.getDataNascimento();
    }

    /**
     * Define a data de nascimento do cidadão.
     * 
     * Presença obrigatória.
     * Regras: Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.
     * 
     * @param dataNascimento Data de nascimento do cidadão.
     */
    public void setDataNascimento(long dataNascimento) {
        instancia.setDataNascimento(dataNascimento);
    }

    /**
     * Remove a data de nascimento do cidadão.
     */
    public void unsetDataNascimento() {
        instancia.unsetDataNascimento();
    }

    /**
     * Retorna se a data de nascimento do cidadão foi definida.
     * @return True caso a data de nascimento tenha sido definida.
     */
    public boolean isSetDataNascimento() {
        return instancia.isSetDataNascimento();
    }

    /**
     * Define se a data de nascimento do cidadão foi colocada.
     * @param value True caso deseje notificar que a data de nascimento foi colocada.
     */
    public void setDataNascimentoIsSet(boolean value) {
        instancia.setDataNascimentoIsSet(value);
    }
    
    /**
     * Retorna o sexo do cidadão.
     * @return Código do sexo do cidadão.
     */
    public long getSexo() {
        return instancia.getSexo();
    }

    /**
     * Define o sexo do cidadão.
     * 
     * Presença obrigatória.
     * 
     * @param sexo Código do sexo do cidadão.
     */
    public void setSexo(long sexo) {
        instancia.setSexo(sexo);
    }

    /**
     * Remove o sexo do cidadão.
     */
    public void unsetSexo() {
        instancia.unsetSexo();
    }

    /**
     * Verifica se o sexo foi definido.
     * @return True caso o sexo tenha sido definido.
     */
    public boolean isSetSexo() {
        return instancia.isSetSexo();
    }

    /**
     * Retorna se o sexo do cidadão foi definido.
     * @param value True caso o sexo tenha sido definido.
     */
    public void setSexoIsSet(boolean value) {
        instancia.setSexoIsSet(value);
    }

    /**
     * Retorna o cógido do local onde o atendimento foi realizado.
     * @return Cógido do local onde o atendimento foi realizado.
     */
    public long getLocalAtendimento() {
        return instancia.getLocalAtendimento();
    }

    /**
     * Define o local onde o atendimento foi realizado.
     * 
     * Presença obrigatória.
     * 
     * @param localAtendimento Cógido do local onde o atendimento foi realizado.
     */
    public void setLocalAtendimento(long localAtendimento) {
        instancia.setLocalAtendimento(localAtendimento);
    }

    /**
     * Remove o local de atendimento.
     */
    public void unsetLocalAtendimento() {
        instancia.unsetLocalAtendimento();
    }

    /**
     * Verifica se o local de atendimento foi definido.
     * @return True caso o local de atendomento tenha sido definido.
     */
    public boolean isSetLocalAtendimento() {
        return instancia.isSetLocalAtendimento();
    }

    /**
     *Define se o local de atendimento foi inserido. 
     * @param value True caso desee informar que o local de atendimento foi inserido.
     */
    public void setLocalAtendimentoIsSet(boolean value) {
        instancia.setLocalAtendimentoIsSet(value);
    }

    /**
     * Retorna a modalidade AD do cidadão atendido.
     * @return Código da modalidade AD do cidadão atendido.
     */
    public long getAtencaoDomiciliarModalidade() {
        return instancia.getAtencaoDomiciliarModalidade();
    }

    /**
     * Define a modalidade AD do cidadão atendido.
     * 
     * Presença obrigatória.
     * Regras: Apenas as opções 1, 2 e 3 são aceitas.
     * 
     * @param atencaoDomiciliarModalidade Código da modalidade AD do cidadão atendido.
     */
    public void setAtencaoDomiciliarModalidade(long atencaoDomiciliarModalidade) {
        instancia.setAtencaoDomiciliarModalidade(atencaoDomiciliarModalidade);
    }

    /**
     * Remove a modalidade AD do cidadão atendido.
     */
    public void unsetAtencaoDomiciliarModalidade() {
        instancia.unsetAtencaoDomiciliarModalidade();
    }

    /**
     * Define se a modalidade AD do cidadão atendido foi inserida.
     * @return True caso a modalidade AD do cidadão atendido tenha sido inserida.
     */
    public boolean isSetAtencaoDomiciliarModalidade() {
        return instancia.isSetAtencaoDomiciliarModalidade();
    }

    /**
     * Define se a modalidade AD do cidadão atendido foi inserida.
     * @param value True caso a modalidade AD do cidadão atendido tenha sido inserida.
     */
    public void setAtencaoDomiciliarModalidadeIsSet(boolean value) {
        instancia.setAtencaoDomiciliarModalidadeIsSet(value);
    }

    /**
     * Retorna o ripo de atendimento.
     * @return Código do tipo de atendimento.
     */
    public long getTipoAtendimento() {
        return instancia.getTipoAtendimento();
    }

    /**
     * Define o tipo de atendimento.
     * 
     * Presença obrigatória.
     * Regras: Apenas as opções 7 e 8 são aceitas.
     * 
     * @param tipoAtendimento Código do tipo de atendimento.
     */
    public void setTipoAtendimento(long tipoAtendimento) {
        instancia.setTipoAtendimento(tipoAtendimento);
    }

    /**
     * Remove o tipo de atendimento.
     */
    public void unsetTipoAtendimento() {
        instancia.unsetTipoAtendimento();
    }

    /**
     * Verifica se o tipo de atendimento foi inserido.
     * @return True caso o tipo de atendimento tenha sido inserido.
     */
    public boolean isSetTipoAtendimento() {
        return instancia.isSetTipoAtendimento();
    }

    /**
     * Define se o tipo de atendimento foi inserido.
     * @param value True caso o tipo de atendimento tenha sido inserido.
     */
    public void setTipoAtendimentoIsSet(boolean value) {
        instancia.setTipoAtendimentoIsSet(value);
    }

    /**
     * Marcadores das situações presentes.
     * @return Quantidade dos marcadores das situações presentes.
     */
    public int getSituacoesPresentesSize() {
        return instancia.getSituacoesPresentesSize();
    }

    /**
     * Marcadores das situações presentes.
     * @return Marcadores das situações presentes.
     */
    public Iterator<Long> getSituacoesPresentesIterator() {
        return instancia.getSituacoesPresentesIterator();
    }

    /**
     * Insere um marcador das situações presentes.
     * @param elem Marcador das situações presentes.
     */
    public void addToSituacoesPresentes(long elem) {
        instancia.addToSituacoesPresentes(elem);
    }

    /**
     * Lista de marcadores das situações presentes.
     * @return Marcadores das situações presentes.
     */
    public List<Long> getSituacoesPresentes() {
        return instancia.getSituacoesPresentes();
    }

    /**
     * Insere uma lista de marcadores das situações presentes.
     * @param situacoesPresentes Marcadores das situações presentes.
     */
    public void setSituacoesPresentes(List<Long> situacoesPresentes) {
        instancia.setSituacoesPresentes(situacoesPresentes);
    }

    /**
     * Remove os marcadores das situações presentes.
     */
    public void unsetSituacoesPresentes() {
        instancia.unsetSituacoesPresentes();
    }

    /**
     * Verifica se os marcadores das situações presentes foram inseridos.
     * @return True caso os marcadores das situações presentes tenham sidos inseridos.
     */
    public boolean isSetSituacoesPresentes() {
        return instancia.isSetSituacoesPresentes();
    }

    /**
     * Define se os marcadores das situações presentes foram inseridos.
     * @param value True caso os marcadores das situações presentes tenham sidos inseridos.
     */
    public void setSituacoesPresentesIsSet(boolean value) {
        instancia.setSituacoesPresentesIsSet(value);
    }

    /**
     * Código do CID registrado no atendimento.
     * @return Código do CID registrado no atendimento.
     */
    public String getCid() {
        return instancia.getCid();
    }

    /**
     * Define o código do CID registrado do atendimento.
     * @param cid Código do CID registrado no atendimento.
     */
    public void setCid(String cid) {
        instancia.setCid(cid);
    }

    /**
     * Remove o código do CID registrado no atendimento.
     */
    public void unsetCid() {
        instancia.unsetCid();
    }

    /**
     * Verifica se o código do CID registrado no atendimento foi definido.
     * @return True case o código do CID registrado no atendimento tenha sido declarado.
     */
    public boolean isSetCid() {
        return instancia.isSetCid();
    }

    /**
     * Declara que o código do CID registrado no atendimento foi inserido.
     * @param value 
     */
    public void setCidIsSet(boolean value) {
        instancia.setCidIsSet(value);
    }

    /**
     * Código do CIAP registrado no atendimento.
     * @return código do CIAP registrado no atendimento.
     */
    public String getCiap() {
        return instancia.getCiap();
    }

    /**
     * Define o código do CIAP registrado no atendimento.
     * @param ciap Código do CIAP registrado no atendimento.
     */
    public void setCiap(String ciap) {
        instancia.setCiap(ciap);
    }

    /**
     * Remove o código do CIAP registrado no atendimento.
     */
    public void unsetCiap() {
        instancia.unsetCiap();
    }

    /**
     * Verifica se o código do CIAP foi registrado no atendimento
     * @return True caso o Código do CIAP tenha sido registrado no atendimento.
     */
    public boolean isSetCiap() {
        return instancia.isSetCiap();
    }

    /**
     * Declara que o código do CIAP foi registrado.
     * @param value True caso o código do CIAP tenha sido registrado.
     */
    public void setCiapIsSet(boolean value) {
        instancia.setCiapIsSet(value);
    }

    /**
     * Quantidade de procedimentos registrados no atendimento disponíveis na ficha.
     * @return Quantidade de procedimentos registrados no atendimento disponíveis na ficha.
     */
    public int getProcedimentosSize() {
        return instancia.getProcedimentosSize();
    }

    /**
     * Procedimentos registrados no atendimento disponíveis na ficha
     * @return Iterator com os procedimentos registrados no atendimento disponíveis na ficha
     */
    public Iterator<String> getProcedimentosIterator() {
        return instancia.getProcedimentosIterator();
    }

    /**
     * Adiciona um procedimento a lista de atendimentos da ficha.
     * Máximo: 21
     * @param elem Código do procedimento.
     */
    public void addToProcedimentos(String elem) {
        instancia.addToProcedimentos(elem);
    }

    /**
     * Retorna os procedimentos registrados no atendimento.
     * @return procedimentos registrados no atendimento.
     */
    public List<String> getProcedimentos() {
        return instancia.getProcedimentos();
    }

    /**
     * Define os procedimentos do atendimento.
     * Máximo: 21
     * @param procedimentos lista de procedimentos.
     */
    public void setProcedimentos(List<String> procedimentos) {
        instancia.setProcedimentos(procedimentos);
    }

    /**
     * Remove os procedimentos do atendimento.
     */
    public void unsetProcedimentos() {
        instancia.unsetProcedimentos();
    }

    /**
     * Verifica se o atendimento possui algum procedimento.
     * @return True caso o atendimento possua procedimentos.
     */
    public boolean isSetProcedimentos() {
        return instancia.isSetProcedimentos();
    }

    /**
     * Declara se o atendimento possui ou não procedimentos.
     * @param value True caso o atendimento possua procedimentos.
     */
    public void setProcedimentosIsSet(boolean value) {
        instancia.setProcedimentosIsSet(value);
    }

    /**
     * Quantidade de procedimentos SIGTAP registrados no atendimento.
     * @return Quantidade de procedimentos SIGTAP registrados no atendimento.
     */
    public int getOutrosProcedimentosSize() {
        return instancia.getOutrosProcedimentosSize();
    }

    /**
     * Procedimentos SIGTAP registrados no atendimento.
     * @return Um iterator contendo procedimentos SIGTAP registrados no atendimento.
     */
    public Iterator<String> getOutrosProcedimentosIterator() {
        return instancia.getOutrosProcedimentosIterator();
    }

    /**
     * Adiciona um procedimento SIGTAP ao atendimento.
     * Não podem conter procedimentos repetidos.
     * Não podem ser iguais aos procedimentos.
     * Máximo: 4
     * 
     * @param elem código do procedimento SIGTAP
     */
    public void addToOutrosProcedimentos(String elem) {
        instancia.addToOutrosProcedimentos(elem);
    }

    /**
     * Procedimentos SIGTAP registrados no atendimento.
     * @return Lista com os procedimentos SIGTAP do atendimento.
     */
    public List<String> getOutrosProcedimentos() {
        return instancia.getOutrosProcedimentos();
    }

    /**
     * Define os procedimentos SIGTAP do atendimento.
     * 
     * Não podem conter procedimentos repetidos.
     * Não podem ser iguais aos procedimentos.
     * Máximo: 4
     * 
     * @param outrosProcedimentos Lista contendo os códigos dos procedimentos SIGTAP do atendimento.
     */
    public void setOutrosProcedimentos(List<String> outrosProcedimentos) {
        instancia.setOutrosProcedimentos(outrosProcedimentos);
    }

    /**
     * Remove os procedimentos SIGTAP do atendimento.
     */
    public void unsetOutrosProcedimentos() {
        instancia.unsetOutrosProcedimentos();
    }

    /**
     * Verifica se foi declarado algum procedimento SIGTAP no atendimento.
     * @return True caso tenham sido declarados algum procedimento SIGTAP.
     */
    public boolean isSetOutrosProcedimentos() {
        return instancia.isSetOutrosProcedimentos();
    }

    /**
     * Declara que o atendimento possui procedimentos SIGTAP.
     * @param value True caso o atendimento possua procedimentos SIGTAP
     */
    public void setOutrosProcedimentosIsSet(boolean value) {
        instancia.setOutrosProcedimentosIsSet(value);
    }

    /**
     * Desfecho do atendimento do cidadão.
     * @return Código do desfecho do atendimento do cidadão.
     */
    public long getCondutaDesfecho() {
        return instancia.getCondutaDesfecho();
    }

    /**
     * Define o desfecho do atendimento do cidadão.
     * 
     * Regras: Não podem conter as opções 7 ou 8.
     * 
     * @param condutaDesfecho Código do desfecho do atendimento do cidadão.
     */
    public void setCondutaDesfecho(long condutaDesfecho) {
        instancia.setCondutaDesfecho(condutaDesfecho);
    }

    /**
     * Remove o desfecho do atendimento do cidadão.
     */
    public void unsetCondutaDesfecho() {
        instancia.unsetCondutaDesfecho();
    }

    /**
     * Verifica se foi declarado o desfecho do atendimento do cidadão.
     * @return True caso o desfecho do atendimento do cidadão tenha sido informado.
     */
    public boolean isSetCondutaDesfecho() {
        return instancia.isSetCondutaDesfecho();
    }

    /**
     * Declara se o desfecho do atendimento do cidadão foi informado.
     * @param value True caso queira informar que o desfecho do atendimento do cidadão foi informado.
     */
    public void setCondutaDesfechoIsSet(boolean value) {
        instancia.setCondutaDesfechoIsSet(value);
    }

    /**
     * Verifica se a família irá receber acompanhamento pós-óbito.
     * @return True caso a família for receber acompanhamento pós-óbito.
     */
    public boolean isStatusInicioAcompanhamentoPosObito() {
        return instancia.isStatusInicioAcompanhamentoPosObito();
    }

    /**
     * Define se a família irá receber acompanhamento pós-óbito.
     * @param statusInicioAcompanhamentoPosObito True caso a familia va receber acompanhamento pós-óbito.
     */
    public void setStatusInicioAcompanhamentoPosObito(boolean statusInicioAcompanhamentoPosObito) {
        instancia.setStatusInicioAcompanhamentoPosObito(statusInicioAcompanhamentoPosObito);
    }

    /**
     * Remove o status de acompanhamento pós-óbito.
     */
    public void unsetStatusInicioAcompanhamentoPosObito() {
        instancia.unsetStatusInicioAcompanhamentoPosObito();
    }

    /**
     * Verifica se o status de acompanhamento pós-óbito foi declarado.
     * @return True caso o status de acompanhamento pós-óbito tenha sido declarado.
     */
    public boolean isSetStatusInicioAcompanhamentoPosObito() {
        return instancia.isSetStatusInicioAcompanhamentoPosObito();
    }

    /**
     * Declara se o status de acompanhamento pós-óbito foi informado.
     * @param value True caso o status de acompanhamento pós-óbito tenha sido declarado
     */
    public void setStatusInicioAcompanhamentoPosObitoIsSet(boolean value) {
        instancia.setStatusInicioAcompanhamentoPosObitoIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return instancia.equals(that);
    }

    public boolean equals(FichaAtendimentoDomiciliarChild that) {
        return instancia.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return instancia.hashCode();
    }

    public int compareTo(FichaAtendimentoDomiciliarChild other) {
        return instancia.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return instancia.toString();
    }

    public boolean validate()  {
        try {
            instancia.validate();
        } catch (TException ex) {
            
        }
        return false;
    }
    
    /**
     * Retorna um instancia thrift do objeto.
     * @return FichaAtendimentoDomiciliarChildThrift
     */
    protected FichaAtendimentoDomiciliarChildThrift getInstance(){
        return instancia;
    }
    
    /**
     * Código do turno onde aconteceu o atendimento.
     * @return True caso o turno tenha sido informado.
     */
    public boolean validateTurno(){
        return this.isSetTurno();
    }
    
    /**
     * CNS do cidadão que participou da atividade.
     * @return True Caso não tenha sido informado e caso tenha sido informado corretamente.
     */
    public boolean validateCns(){
        if(this.isSetCns()){
            if(this.getCns().length() > 15 || this.getCns().length() < 15){
                
                return false;
            }
            if(instancia.getCns().charAt(0) == '1' || instancia.getCns().charAt(0) == '2'){
                return validaCnsIniUmDois(instancia.getCns());
            }else if(instancia.getCns().charAt(0) == '7' || instancia.getCns().charAt(0) == '8' || instancia.getCns().charAt(0) == '9'){
                return validaCnsIniSeteOitoNove(instancia.getCns());
            }else{
                return false;
            }
                
        }
        
        return true;
    }
        /**
     * Codigo fornecido pelo governo
     * Rotina de validação de Números do cns que iniciam com “1” ou “2” 
     * Observações:
     * 
     * 1) Não existe máscara para o CNS nem para o Número Provisório. O número que aparece no cartão de forma separada (898  0000  0004  3208) deverá ser digitado sem as separações.
     * 2) O 16º número que aparece no Cartão é o número da via do cartão, não é deverá ser digitado.
     * @param cns
     * @return True caso o cns seja valido
     */
    public boolean validaCnsIniUmDois(String cns){
        if (cns.trim().length() != 15){
            return(false);
        }

        float soma;
        float resto, dv;
        String pis = new String("");
        String resultado = new String("");
        pis = cns.substring(0,11);

        soma = ((Integer.valueOf(pis.substring(0,1)).intValue()) * 15) +
               ((Integer.valueOf(pis.substring(1,2)).intValue()) * 14) +
               ((Integer.valueOf(pis.substring(2,3)).intValue()) * 13) +
               ((Integer.valueOf(pis.substring(3,4)).intValue()) * 12) +
               ((Integer.valueOf(pis.substring(4,5)).intValue()) * 11) +
               ((Integer.valueOf(pis.substring(5,6)).intValue()) * 10) +
               ((Integer.valueOf(pis.substring(6,7)).intValue()) * 9) +
               ((Integer.valueOf(pis.substring(7,8)).intValue()) * 8) +
               ((Integer.valueOf(pis.substring(8,9)).intValue()) * 7) +
               ((Integer.valueOf(pis.substring(9,10)).intValue()) * 6) +
               ((Integer.valueOf(pis.substring(10,11)).intValue()) * 5);

        resto = soma % 11;
        dv = 11 - resto;

        if (dv == 11){
            dv = 0;
        }

        if (dv == 10){
            soma = ((Integer.valueOf(pis.substring(0,1)).intValue()) * 15) +
                   ((Integer.valueOf(pis.substring(1,2)).intValue()) * 14) +
                   ((Integer.valueOf(pis.substring(2,3)).intValue()) * 13) +
                   ((Integer.valueOf(pis.substring(3,4)).intValue()) * 12) +
                   ((Integer.valueOf(pis.substring(4,5)).intValue()) * 11) +
                   ((Integer.valueOf(pis.substring(5,6)).intValue()) * 10) +
                   ((Integer.valueOf(pis.substring(6,7)).intValue()) * 9) +
                   ((Integer.valueOf(pis.substring(7,8)).intValue()) * 8) +
                   ((Integer.valueOf(pis.substring(8,9)).intValue()) * 7) +
                   ((Integer.valueOf(pis.substring(9,10)).intValue()) * 6) +
                   ((Integer.valueOf(pis.substring(10,11)).intValue()) * 5) + 2;

            resto = soma % 11;
            dv = 11 - resto;
            resultado = pis + "001" + String.valueOf((int)dv);
        }else {
            resultado = pis + "000" + String.valueOf((int)dv);
        }

        if (! cns.equals(resultado)){
            return(false);
        }else {
        
            return(true);
        }
    }
    /**
     * Codigo fornecido pelo governo
     * Rotina de validação de Números que iniciam com “7”, “8” ou “9”
     * Observações:
     * 
     * 1) Não existe máscara para o CNS nem para o Número Provisório. O número que aparece no cartão de forma separada (898  0000  0004  3208) deverá ser digitado sem as separações.
     * 2) O 16º número que aparece no Cartão é o número da via do cartão, não é deverá ser digitado.
     * @param cns
     * @return True caso o cns seja valido
     */
    public boolean validaCnsIniSeteOitoNove(String cns){
        if (cns.trim().length() != 15){
            return(false);
        }

        float dv;
        float resto,soma;

        soma = ((Integer.valueOf(cns.substring(0,1)).intValue()) * 15) +
               ((Integer.valueOf(cns.substring(1,2)).intValue()) * 14) +
               ((Integer.valueOf(cns.substring(2,3)).intValue()) * 13) +
               ((Integer.valueOf(cns.substring(3,4)).intValue()) * 12) +
               ((Integer.valueOf(cns.substring(4,5)).intValue()) * 11) +
               ((Integer.valueOf(cns.substring(5,6)).intValue()) * 10) +
               ((Integer.valueOf(cns.substring(6,7)).intValue()) * 9) +
               ((Integer.valueOf(cns.substring(7,8)).intValue()) * 8) +
               ((Integer.valueOf(cns.substring(8,9)).intValue()) * 7) +
               ((Integer.valueOf(cns.substring(9,10)).intValue()) * 6) +
               ((Integer.valueOf(cns.substring(10,11)).intValue()) * 5) +
               ((Integer.valueOf(cns.substring(11,12)).intValue()) * 4) +
               ((Integer.valueOf(cns.substring(12,13)).intValue()) * 3) +
               ((Integer.valueOf(cns.substring(13,14)).intValue()) * 2) +
               ((Integer.valueOf(cns.substring(14,15)).intValue()) * 1);

        resto = soma % 11;

        if (resto != 0){
            return(false);
        }else {
        
            return(true);
        }
    }
    
    public boolean validateDataNascimento(){
        return instancia.isSetDataNascimento() && 
    }
    
    public boolean validateSexo(){
        return instancia.isSetSexo();
    }

}

