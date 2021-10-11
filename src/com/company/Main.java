package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            BufferedReader br = OpenBuffRe();
            BufferedWriter bw = OpenBuffWr();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void printTag(BufferedWriter bw, String tag, String data, int NbTab,boolean simple, boolean open, boolean close) throws IOException {
        if(simple)
            bw.write("\t".repeat(NbTab) + "<" + tag + "> " + data + " </" + tag + ">\n");
        else{
            if (open)
                bw.write("\t".repeat(NbTab) + "<" + tag + ">\n");
            bw.write("\t".repeat(NbTab + 1) + data + "\n");
            if (close)
                bw.write("\t".repeat(NbTab) + "</" + tag + ">\n");
        }
    }
    public static BufferedWriter OpenBuffWr() throws IOException {

        File file = new File("XML_Modifier.txt");
        return new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
    }
    public static BufferedReader OpenBuffRe() throws IOException {

        return new BufferedReader(new FileReader(".\\.\\.\\Fichier\\1000movies.txt"));
    }
}
