package com.company;

import java.io.BufferedWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static void printTag(BufferedWriter bw, String tag, String data, int NbTab,boolean open, boolean close) throws IOException {

        if(open)
            bw.write("\t".repeat(NbTab) + "<" + tag + ">\n");
        bw.write("\t".repeat(NbTab + 1) + data + "\n");
        if(close)
            bw.write("\t".repeat(NbTab) + "</" + tag  + ">\n");
    }
}
