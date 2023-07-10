package com.github.StephanyMil.poo_2023_01.t18.xadez;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Adolf Anderssen");
        Jogador jogador2 = new Jogador("Lionel Kieseritzky");

        PartidaImortal partida = new PartidaImortal(jogador1, jogador2, "Partida de 1959");

        Lance lance1 = new Lance(jogador1, "e4 e5");
        Lance lance2 = new Lance(jogador2, "f4");
        Lance lance3 = new Lance(jogador1, "Bc4 Dh4+");
        Lance lance4 = new Lance(jogador2, "Rf1 b5?!");
        Lance lance5 = new Lance(jogador1, "Bxb5 Cf6 6. Cf3");
        Lance lance6 = new Lance(jogador1, "Dh6 7. d3");
        Lance lance7 = new Lance(jogador2, "Ch5");
        Lance lance8 = new Lance(jogador1, "Ch4 Dg5");
        Lance lance9 = new Lance(jogador2, "Cf5 c6");
        Lance lance10 = new Lance(jogador1, "g4 Cf6 11. Tg1!");
        Lance lance11 = new Lance(jogador2, "cxb5?");
        Lance lance12= new Lance(jogador1, "h4!");
        Lance lance13= new Lance(jogador2, "Dg6 13. h5 Dg5 14. Df3");
        Lance lance14= new Lance(jogador1, "Cg8");
        Lance lance15 = new Lance(jogador2, "Bxf4 Df6");
        Lance lance16 = new Lance(jogador1, "Cc3 Bc5");
        Lance lance17 = new Lance(jogador2, "Cd5");
        Lance lance18 = new Lance(jogador1, "Dxb2");
        Lance lance19 = new Lance(jogador2, "Bd6!!");
        Lance lance20 = new Lance(jogador1, "Bxg1?");
        Lance lance21 = new Lance(jogador2, "e5!");
        Lance lance22 = new Lance(jogador1, "Dxa1+ 20. Re2");
        Lance lance23 = new Lance(jogador2, "Ca6");
        Lance lance24 = new Lance(jogador1, "Cxg7+ Rd8 22. Df6+");
        Lance lance25 = new Lance(jogador2, "Cxf6 23. Be7# 1-0");

        partida.adicionarLance(lance1);
        partida.adicionarLance(lance2);
        partida.adicionarLance(lance3);
        partida.adicionarLance(lance4);
        partida.adicionarLance(lance5);
        partida.adicionarLance(lance6);
        partida.adicionarLance(lance7);
        partida.adicionarLance(lance8);
        partida.adicionarLance(lance9);
        partida.adicionarLance(lance10);
        partida.adicionarLance(lance11);
        partida.adicionarLance(lance12);
        partida.adicionarLance(lance13);
        partida.adicionarLance(lance14);
        partida.adicionarLance(lance15);
        partida.adicionarLance(lance16);
        partida.adicionarLance(lance17);
        partida.adicionarLance(lance18);
        partida.adicionarLance(lance19);
        partida.adicionarLance(lance20);
        partida.adicionarLance(lance21);
        partida.adicionarLance(lance22);
        partida.adicionarLance(lance23);
        partida.adicionarLance(lance24);
        partida.adicionarLance(lance25);

        partida.imprimirPartida();
    }
}
