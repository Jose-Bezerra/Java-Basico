package com.loiane.cursojava.diversos;

public class Lampada {

    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String[] tipos;
    private boolean tipoAbajur;
    private boolean estadoLampadada;

    public Lampada() {
    }

    public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses, String[] tipos, boolean tipoAbajur, boolean estadoLampadada) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.tipoAbajur = tipoAbajur;
        this.estadoLampadada = estadoLampadada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isTipoAbajur() { //Observe a diferença para o "Get" boolean
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public boolean isEstadoLampadada() {
        return estadoLampadada;
    }

    public void setEstadoLampadada(boolean estadoLampadada) {
        this.estadoLampadada = estadoLampadada;
    }

    public void ligar() {
        setEstadoLampadada(true);
    }

    public void desligar() {
        setEstadoLampadada(false);
    }

    public void mostrarEstado() {
        if (isEstadoLampadada()) {
            System.out.println("Lâmpada Ligada!");
        } else {
            System.out.println("Lampada Desligada");
        }
    }

    public void mudarEstado() {
        if (isEstadoLampadada()) {
            desligar();
        } else {
            ligar();
        }
    }


}
