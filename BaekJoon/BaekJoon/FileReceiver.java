package BaekJoon;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class FileReceiver{
	public static final int DEFAULT_BUFFER_SIZE = 1024;
		public static void main(String[] args) {
			int Port = 9999;
			String File = "/Users/lusida/Desktop/보낸사진.png";
			
			try {
				ServerSocket server = new ServerSocket(Port);
				System.out.println("기다리는중 ~ (포트 : " + Port  + ")");
				Socket socket =server.accept();
				InetSocketAddress isaClient = (InetSocketAddress) socket.getRemoteSocketAddress();
				
				FileOutputStream fos = new FileOutputStream(File);
				InputStream is = socket.getInputStream();
				
				byte[] Buffer = new byte[DEFAULT_BUFFER_SIZE];
				int ReadByte;
				while((ReadByte = is.read(Buffer)) !=-1) {
					fos.write(Buffer,0,ReadByte);
				}
				
				is.close();
				fos.close();
				socket.close();
				server.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
}
