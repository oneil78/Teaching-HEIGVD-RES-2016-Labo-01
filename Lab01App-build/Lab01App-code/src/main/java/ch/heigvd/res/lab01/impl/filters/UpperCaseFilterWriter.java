package ch.heigvd.res.lab01.impl.filters;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Olivier Liechti
 */
public class UpperCaseFilterWriter extends FilterWriter {
  
  public UpperCaseFilterWriter(Writer wrappedWriter) {
    super(wrappedWriter);
  }

  @Override
  public void write(String str, int off, int len) throws IOException {
     String upperCase = str.toUpperCase();

     super.write(upperCase, off, len);
  }

  @Override
  public void write(char[] cbuf, int off, int len) throws IOException {
     char[] upperCase = new char[cbuf.length];

     for(int i = 0; i < cbuf.length; i++) {
        upperCase[i] = Character.toUpperCase(cbuf[i]);
     }
     super.write(upperCase, off, len);
  }

  @Override
  public void write(int c) throws IOException {
     super.write(Character.toUpperCase(c));
  }

}
