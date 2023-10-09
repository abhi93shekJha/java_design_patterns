package genrics;

public class GenericsMain {

    public static void main(String[] args){
        GenericsMain genericsMain = new GenericsMain();
        String str = "Test";
        genericsMain.usingGenerics(new Thread());
    }

    public <T extends Thread> T usingGenerics(T param){
        T var = param;
        return var;
    }
}
