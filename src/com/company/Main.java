package com.company;

import java.util.Scanner;

class MegaByteConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megabytes=kiloBytes/1024;
        int RemainingKiloBytes=kiloBytes%1024;

        System.out.println(kiloBytes+" KB = "+megabytes+" MB and "+RemainingKiloBytes+" KB");
    }

}
