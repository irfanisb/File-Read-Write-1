public class Main {
    public static void main(String[] args) {
      FileIO myFile = new FileIO();
      
      myFile.createFile("Hello.txt");
      myFile.readFile("Hello.txt");
      
    }
}