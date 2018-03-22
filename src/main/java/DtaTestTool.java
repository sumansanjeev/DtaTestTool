import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.datatorrent.apoxi.dta.DtaFileManager;

public class DtaTestTool {

  public static void main(String[] args) {
    if(args.length != 1) {
      showHelp();
      return;
    }

    DtaFileManager dtaFileManager = new DtaFileManager(args[0]);
    //System.out.println(dtaFileManager.toString());

    ObjectMapper objectMapper = new ObjectMapper();
    try {
      System.out.println(objectMapper.writeValueAsString(dtaFileManager));
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }

  }

  private static void showHelp() {
    System.out.println("Usage: java DtaTestTool <DAT-File-Path>");
  }
}
