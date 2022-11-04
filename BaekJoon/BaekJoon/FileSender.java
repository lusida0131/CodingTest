package BaekJoon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class FileSender {
	public static final int DEFAULT_BUFFER_SIZE = 1024;
	public static void main(String[] args) {
		String IP = "LocalHost";
		int Port = 9999;
		String FileName = "/Users/lusida/Desktop/스크린샷 2022-09-01 오후 7.30.29.png";
		
		File file = new File(FileName);
		if(!file.exists()) {
			System.out.println("File not Exist.");
			System.exit(0);
		}
		long fileSize = file.length(); //파일 길이 
		//long TotalReadByte = 0;
		byte [] Buffer = new byte[DEFAULT_BUFFER_SIZE];
		int ReadByte;
		
		try {
			FileInputStream fis = new FileInputStream(file);
			Socket socket = new Socket(IP, Port);
			if(!socket.isConnected()){
				System.out.println("연결이 안되었습니다..");
				System.exit(0);
				}
			
			OutputStream os =socket.getOutputStream();
			while ((ReadByte = fis.read(Buffer)) >0) {
				os.write(Buffer, 0, ReadByte);
				//TotalReadByte += ReadByte;
				
				System.out.println("----------------------------------------------------");
				System.out.println("전송 취소를 하려면 q를 입력하고 Enter를 누르세요.");
				System.out.println("----------------------------------------------------");
				
				Scanner sc = new Scanner(System.in);
				String cancel = sc.nextLine();
				if(cancel.equals("q")) {
					try {
						Thread.sleep(1000);
						
					} catch (InterruptedException e) {
						e.printStackTrace();
						System.out.println("파일전송이 취소 되었습니다.");
					}
					break;
				}	
				sc.close();
				}
			
			System.out.println("파일 전송이 되었습니다..");
			fis.close();
			os.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
    }
}