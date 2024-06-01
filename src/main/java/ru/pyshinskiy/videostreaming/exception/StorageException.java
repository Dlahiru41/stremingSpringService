package ru.pyshinskiy.videostreaming.exception;

public class StorageException extends RuntimeException {

    public StorageException(Exception ex) {
        super(ex);
    }
}
