package ru.pyshinskiy.videostreaming.service;

import org.springframework.web.multipart.MultipartFile;
import ru.pyshinskiy.videostreaming.util.Range;

import java.util.List;
import java.util.UUID;

public interface VideoService {

    UUID save(MultipartFile video);

    DefaultVideoService.ChunkWithMetadata fetchChunk(UUID uuid, Range range);

}
