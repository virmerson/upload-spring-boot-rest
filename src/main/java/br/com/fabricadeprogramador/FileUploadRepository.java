package br.com.fabricadeprogramador;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FileUploadRepository extends JpaRepository<FileUpload, Integer>{

	FileUpload findByFileName(String filename);

}
