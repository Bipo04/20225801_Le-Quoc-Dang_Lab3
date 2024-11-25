package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) throws IOException {
		String filename = "D:\\20225801_Le-Quoc-Dang_Lab3\\OtherProjects\\src\\test.txt";
		byte[] inputBytes = { 0 };
		long startTime, endTime;

		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		StringBuffer outputStringBuilder = new StringBuffer();
		for (byte b : inputBytes) {
			outputStringBuilder.append(Character.toString((char) b));
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}