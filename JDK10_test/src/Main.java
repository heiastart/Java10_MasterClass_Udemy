public class Main {

    public static void main(String[] args) {

        //System.out.println("Hello World!");
        ProcessHandle currProcess = ProcessHandle.current();
        ProcessHandle.Info currProcessInfo = currProcess.info();
        System.out.println("PID: " + currProcess.pid());
        //System.out.println("Info: " + currProcessInfo);
        System.out.println(currProcess.hashCode());
    }
}
