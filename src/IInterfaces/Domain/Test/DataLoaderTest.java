package IInterfaces.Domain.Test;

import IInterfaces.Domain.DataBaseLoader;
import IInterfaces.Domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();

        fileLoader.remove();
        dataBaseLoader.remove();

        fileLoader.checkPermission();
        dataBaseLoader.checkPermission();
    }
}
