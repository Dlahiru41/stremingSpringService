package ru.pyshinskiy.videostreaming.entity;

import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.Id;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileMetadataEntity {
    @Id
    private String id;
    private long size;
    private String httpContentType;
}