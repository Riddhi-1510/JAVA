import javafx.scene.text.Text;

interface FileProcessor{
    void readFile();
    void writeFile();
}

class TextFileProcessor implements FileProcessor{
    @Override
    public void readFile(){
        System.out.println("TextFIle --> Read");
    }
    @Override
    public void writeFile(){
        System.out.println("TextFILe --> write");
    }
}

class CSVFileProcessor implements FileProcessor{
    @Override
    public void readFile(){
        System.out.println("CSVFIle --> Read");
    }
    @Override
    public void writeFile(){
        System.out.println("CSVFILe --> write");
    }
}
public class FileProcessing {
    public static void main(String[] args) {
            TextFileProcessor t = new TextFileProcessor();
            t.readFile();
            t.writeFile();
            
            CSVFileProcessor c = new CSVFileProcessor();
            c.readFile();
            c.writeFile();
    }
}

/*
Scenario 8: File Processing Application
Develop an interface called "FileProcessor" with methods like "readFile" and "writeFile." Implement classes like "TextFileProcessor" and "CSVFileProcessor" that provide specific implementations for these interface methods.
 */