package com.sysnormal.commons.core.utils_core;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {

    public String readFile(String path) throws IOException {
        return Files.readString(Path.of(path));
    }

}
