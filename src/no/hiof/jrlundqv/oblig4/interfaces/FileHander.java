package no.hiof.jrlundqv.oblig4.interfaces;

import java.io.IOException;
import java.util.ArrayList;

public interface FileHander<T> {
    void writeObjectsToFile(ArrayList<T> arrayList, String filePath) throws IOException;
    ArrayList<T> readObjectsFromFile(String filePath) throws IOException;
}
