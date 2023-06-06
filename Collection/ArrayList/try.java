import java.io.*;
class TestExe{
	public static void main(String args[]) throws IOException{
		Runtime runtime=Runtime.getRuntime();
		Process p=runtime.exec("calc");
		p.waitFor();
	}
}