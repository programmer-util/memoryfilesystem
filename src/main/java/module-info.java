module com.github.marschall.memoryfilesystem {

  requires /* optional */ java.annotations.common;
  exports com.github.marschall.memoryfilesystem;
  provides java.nio.file.spi.FileSystemProvider
  with com.github.marschall.memoryfilesystem.MemoryFileSystemProvider;

}
