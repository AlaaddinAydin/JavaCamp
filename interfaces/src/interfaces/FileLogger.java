package interfaces;

public class FileLogger implements Logger{

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Dosyaya loglandı: " + message);
	}

}
