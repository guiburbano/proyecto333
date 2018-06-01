package com.example.santiago.proyectofinal.Modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ViveDigital
{

    @SerializedName("coordenadas_pvd_validadas")
    @Expose
    private ViveDigital coordenadasPvdValidadas;
    @SerializedName("departamento")
    @Expose
    private String departamento;
    @SerializedName("direcci_n_pvd")
    @Expose
    private String direcciNPvd;
    @SerializedName("ejecutor")
    @Expose
    private String ejecutor;
    @SerializedName("el_punto_ya_fue_donado_si_no")
    @Expose
    private String elPuntoYaFueDonadoSiNo;
    @SerializedName("escritura_de_donaci_n")
    @Expose
    private String escrituraDeDonaciN;
    @SerializedName("estado_actual_de_la_carpeta")
    @Expose
    private String estadoActualDeLaCarpeta;
    @SerializedName("fase")
    @Expose
    private String fase;
    @SerializedName("fecha_de_convenio")
    @Expose
    private String fechaDeConvenio;
    @SerializedName("horario_atenci_n_del_pvd")
    @Expose
    private String horarioAtenciNDelPvd;
    @SerializedName("id_beneficiario")
    @Expose
    private String idBeneficiario;
    @SerializedName("integrador_de_servicio")
    @Expose
    private String integradorDeServicio;
    @SerializedName("longitud")
    @Expose
    private String longitud;
    @SerializedName("municipio")
    @Expose
    private String municipio;
    @SerializedName("no_convenio")
    @Expose
    private String noConvenio;
    @SerializedName("regi_n")
    @Expose
    private String regiN;
    @SerializedName("resoluci_n_de_baja")
    @Expose
    private String resoluciNDeBaja;
    @SerializedName("tipo_de_beneficiario")
    @Expose
    private String tipoDeBeneficiario;
    @SerializedName("tipo_ejecutor")
    @Expose
    private String tipoEjecutor;
    @SerializedName("tipologia")
    @Expose
    private String tipologia;

    public ViveDigital getCoordenadasPvdValidadas() {
        return coordenadasPvdValidadas;
    }

    public void setCoordenadasPvdValidadas(ViveDigital coordenadasPvdValidadas) {
        this.coordenadasPvdValidadas = coordenadasPvdValidadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDirecciNPvd() {
        return direcciNPvd;
    }

    public void setDirecciNPvd(String direcciNPvd) {
        this.direcciNPvd = direcciNPvd;
    }

    public String getEjecutor() {
        return ejecutor;
    }

    public void setEjecutor(String ejecutor) {
        this.ejecutor = ejecutor;
    }

    public String getElPuntoYaFueDonadoSiNo() {
        return elPuntoYaFueDonadoSiNo;
    }

    public void setElPuntoYaFueDonadoSiNo(String elPuntoYaFueDonadoSiNo) {
        this.elPuntoYaFueDonadoSiNo = elPuntoYaFueDonadoSiNo;
    }

    public String getEscrituraDeDonaciN() {
        return escrituraDeDonaciN;
    }

    public void setEscrituraDeDonaciN(String escrituraDeDonaciN) {
        this.escrituraDeDonaciN = escrituraDeDonaciN;
    }

    public String getEstadoActualDeLaCarpeta() {
        return estadoActualDeLaCarpeta;
    }

    public void setEstadoActualDeLaCarpeta(String estadoActualDeLaCarpeta) {
        this.estadoActualDeLaCarpeta = estadoActualDeLaCarpeta;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getFechaDeConvenio() {
        return fechaDeConvenio;
    }

    public void setFechaDeConvenio(String fechaDeConvenio) {
        this.fechaDeConvenio = fechaDeConvenio;
    }

    public String getHorarioAtenciNDelPvd() {
        return horarioAtenciNDelPvd;
    }

    public void setHorarioAtenciNDelPvd(String horarioAtenciNDelPvd) {
        this.horarioAtenciNDelPvd = horarioAtenciNDelPvd;
    }

    public String getIdBeneficiario() {
        return idBeneficiario;
    }

    public void setIdBeneficiario(String idBeneficiario) {
        this.idBeneficiario = idBeneficiario;
    }

    public String getIntegradorDeServicio() {
        return integradorDeServicio;
    }

    public void setIntegradorDeServicio(String integradorDeServicio) {
        this.integradorDeServicio = integradorDeServicio;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNoConvenio() {
        return noConvenio;
    }

    public void setNoConvenio(String noConvenio) {
        this.noConvenio = noConvenio;
    }

    public String getRegiN() {
        return regiN;
    }

    public void setRegiN(String regiN) {
        this.regiN = regiN;
    }

    public String getResoluciNDeBaja() {
        return resoluciNDeBaja;
    }

    public void setResoluciNDeBaja(String resoluciNDeBaja) {
        this.resoluciNDeBaja = resoluciNDeBaja;
    }

    public String getTipoDeBeneficiario() {
        return tipoDeBeneficiario;
    }

    public void setTipoDeBeneficiario(String tipoDeBeneficiario) {
        this.tipoDeBeneficiario = tipoDeBeneficiario;
    }

    public String getTipoEjecutor() {
        return tipoEjecutor;
    }

    public void setTipoEjecutor(String tipoEjecutor) {
        this.tipoEjecutor = tipoEjecutor;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

}