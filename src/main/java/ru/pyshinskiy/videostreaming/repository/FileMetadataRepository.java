package ru.pyshinskiy.videostreaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pyshinskiy.videostreaming.entity.FileMetadataEntity;

public interface FileMetadataRepository extends JpaRepository<FileMetadataEntity,String>{
}

