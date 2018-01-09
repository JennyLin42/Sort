package Delete;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Delete_working {
	static void copyFile(File srcFile, File desFile) throws IOException{
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(desFile);
		
		byte[]buff = new byte[20*1024];
		int temp;
		while((temp = fis.read(buff, 0, buff.length)) != -1){
			fos.write(buff, 0, temp);
			//fos.close();
		}
		fos.close();
		fis.close();
		
	}
	static String[] listDirectory(File dir)throws IOException{
      if(!dir.exists()){
          throw new IllegalArgumentException("Ŀ¼:"+dir+"������");
      }
      if(!dir.isDirectory()){
          throw new IllegalArgumentException(dir+"����Ŀ¼");
      }
      
      String [] filenames = dir.list();
      return filenames;
	}
	
	static void showTime(String srcFile) throws IOException{
		String [] filenames = listDirectory(new File(srcFile));
		String sNew = srcFile+"\\new\\";
		if(!new File(sNew).exists()){
			new File(sNew).mkdir();
		}
		int i =1;
		for (String string : filenames) {
			String delete_Working = "";
			//if(string.contains("_working")){
				delete_Working = string.replace("_working", "");
				System.out.println("******"+(i++)+"*******");
				System.out.println("----before:"+string+"-------");
				System.out.println("----after:"+delete_Working+"----------");
				System.out.println("*****************");
				copyFile(new File(srcFile+string),
						new File(sNew+delete_Working));
			//}
		}
	}
	
	public static void main(String[] args) throws IOException {
		showTime("C:\\Users\\LINJE2\\Desktop\\rename\\");
	}
}

