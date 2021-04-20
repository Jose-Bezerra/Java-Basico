package com.loiane.cursojava.diversos;

public class JogoDaVelha {

    private char[][] tabuleiroJogo;
    private int jogada;

    public JogoDaVelha() {
        tabuleiroJogo = new char[3][3];
        jogada = 1;
    }

    public char[][] getTabuleiroJogo() {
        return tabuleiroJogo;
    }

    public void setTabuleiroJogo(char[][] tabuleiroJogo) {
        this.tabuleiroJogo = tabuleiroJogo;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public boolean validarJogada(int linha, int coluna, char sinal) {
        if (tabuleiroJogo[linha][coluna] == 'X' || tabuleiroJogo[linha][coluna] == 'O') {
            return false;
        } else { //jogada válida
            tabuleiroJogo[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }

    public void imprimirTabuleiro() {
        for (int i = 0; i < tabuleiroJogo.length; i++) {
            for (int j = 0; j < tabuleiroJogo[i].length; j++) {
                System.out.print(tabuleiroJogo[i][j] + "  |  ");
            }
            System.out.println();
        }
    }

    public boolean verificarGanhador(char sinal) {
        if ((tabuleiroJogo[0][0] == sinal && tabuleiroJogo[0][1] == sinal && tabuleiroJogo[0][2] == sinal) ||
                (tabuleiroJogo[1][0] == sinal && tabuleiroJogo[1][1] == sinal && tabuleiroJogo[1][2] == sinal) ||
                (tabuleiroJogo[2][0] == sinal && tabuleiroJogo[2][1] == sinal && tabuleiroJogo[2][2] == sinal) ||
                (tabuleiroJogo[0][0] == sinal && tabuleiroJogo[1][0] == sinal && tabuleiroJogo[2][0] == sinal) ||
                (tabuleiroJogo[0][1] == sinal && tabuleiroJogo[1][1] == sinal && tabuleiroJogo[2][1] == sinal) ||
                (tabuleiroJogo[0][2] == sinal && tabuleiroJogo[1][2] == sinal && tabuleiroJogo[2][2] == sinal) ||
                (tabuleiroJogo[0][0] == sinal && tabuleiroJogo[1][1] == sinal && tabuleiroJogo[2][2] == sinal) ||
                (tabuleiroJogo[0][2] == sinal && tabuleiroJogo[1][1] == sinal && tabuleiroJogo[2][0] == sinal)) {
            return true;
        }
        return false;
    }

    public boolean vezJogador1() {
        if (jogada % 2 == 1) {
            return true;
        }
        return false;
    }

}
