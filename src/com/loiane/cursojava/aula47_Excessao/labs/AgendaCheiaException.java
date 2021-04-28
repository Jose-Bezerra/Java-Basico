package com.loiane.cursojava.aula47_Excessao.labs;

public class AgendaCheiaException extends  Exception{

    @Override
    public String getMessage() {
        return "Agenda já está cheia!";
    }
}
