package chegg_1;

import java.io.File;

public class FileUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("C:\\Users\\USER\\Desktop\\test");
		System.out.println(fileCount(str));

	}
	
	public static int fileCount(String root){
		File start = new File(root);
		if(start.list().length==0){
			return 0;
		}
		//count variable to count no. of files
		int count = 0;
		File[] arrayOfFiles = start.listFiles();
		for(File found: arrayOfFiles){
			if(found.isFile()){
				count++;
			}
			else{
				String folderRoot = found.getPath();
				count+=fileCount(folderRoot);
			}
		}
		
		return count;
	}

}
