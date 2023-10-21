import java.io.BufferedReader;
import java.io.FileReader;

public class ReadDisplay {

	public static void main(String[] args) {
		try(FileReader fr= new FileReader("/home/sunbeam/git push data/java/Assignment/assignment15/AssignmentQ3/File_Read_Write.txt")){
			try(BufferedReader br= new BufferedReader(fr)) {
				String line;
				while((line=br.readLine())!=null) {
					System.out.println(line);
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
