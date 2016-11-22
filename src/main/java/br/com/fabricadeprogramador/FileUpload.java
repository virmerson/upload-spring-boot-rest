package br.com.fabricadeprogramador;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class FileUpload {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String fileName;

	@Lob
	private byte[] file;
	
	private String mimeType;

	public FileUpload(String fileName, byte[] file, String mimeType) {
		super();
		this.fileName = fileName;
		this.file = file;
		this.mimeType = mimeType;
	}
	
	public FileUpload() {
		// TODO Auto-generated constructor stub
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	
	
}
