import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.datatorrent.apoxi.dta.DtaPackage;

public class DtaTestTool {

  public static void main(String[] args) {
    if(args.length != 1) {
      showHelp();
      return;
    }

    DtaPackage dtaPackage = new DtaPackage(args[0]);
    //System.out.println(dtaFileManager.toString());

    ObjectMapper objectMapper = new ObjectMapper();
    try {
      System.out.println(objectMapper.writeValueAsString(dtaPackage));
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }

  }

  private static void showHelp() {
    System.out.println("Usage: java DtaTestTool <DAT-File-Path>");
  }
}
