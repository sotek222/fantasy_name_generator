package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Generator {
  public Faction faction;

  public Generator(Faction inputFaction) {
    this.faction = inputFaction;
  }

  public void getOptions() throws IOException {
    System.out.println("The following options are available for that faction: ");
    switch (this.faction) {
    case The_Empire:
      short genderIndex = 0;
      for (Gender genderChoice : Gender.values()) {
        System.out.println(genderIndex + ". " + genderChoice);
        genderIndex++;
      }

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String optionsInput = reader.readLine();

      break;
    case Lizardmen:
      short lizardIndex = 0;
      for (LizardmenOptions lizardOption : LizardmenOptions.values()) {
        System.out.println(lizardIndex + ". " + lizardOption);
        lizardIndex++;
      }
      break;
    default:
      break;
    }
  }
}
