/* @author Ugur Dogrusoz
* this program does some calculations about human body elements and their amounts
* date: 2022 / 10 / 06
*/

public class Lab01_Q3 {
    public static void main(String[] args) {
      
      // Consts and Variables
      final double HUMANBODY_MASS_MAIN_6_EL_PERCENT = 98.6;
      final double HUMANBODY_MASS_SUB_EL_COUNT;
      final double HUMANBODY_MASS_SUB_EL_PERCENT;
      final double HUMANBODY_MASS_SUB_EL_COUNT_PERCENT;
      final double OXYGEN_MASS_PERCENT = 65;
      final double CARBON_MASS_PERCENT = 18.5;
      final double HYDROGEN_MASS_PERCENT = 10;
      final double NITROGEN_MASS_PERCENT = 3.2;
      final double CALCIUM_MASS_PERCENT = 1.5;
      final double PHOSPHORUS_MASS_PERCENT;
      final double MASS_OF_OXYGEN_70KG;
      final double MASS_OF_CARBON_70KG;

      
      double huamnBody_mass_kg = 70;
      // double humanBody_atom_count = (double)(7 * Math.pow(10, 27));
      double humanBody_atom_count = 7 * Math.pow(10, 27);
      // double humanBody_sub_el_atom_count;
      double oxygen_atom_count_percent = 24;
      double hydrogen_atom_count_percent = 62;
      double oxygen_atom_count;
      double hydrogen_atom_count;


      // What percentage of the mass of the human body is phosphorus?
      PHOSPHORUS_MASS_PERCENT = HUMANBODY_MASS_MAIN_6_EL_PERCENT - (OXYGEN_MASS_PERCENT + 
      CARBON_MASS_PERCENT + HYDROGEN_MASS_PERCENT + NITROGEN_MASS_PERCENT + CALCIUM_MASS_PERCENT);

      System.out.println("Phosphorus makes up " + PHOSPHORUS_MASS_PERCENT + " percent of the mass in the human body.");
      System.out.println();


      // What percentage of the mass of the human body are elements other than the ones specified?
      HUMANBODY_MASS_SUB_EL_PERCENT = 100 - HUMANBODY_MASS_MAIN_6_EL_PERCENT;

      HUMANBODY_MASS_SUB_EL_COUNT_PERCENT =  100 - (oxygen_atom_count_percent + hydrogen_atom_count_percent);
      HUMANBODY_MASS_SUB_EL_COUNT = humanBody_atom_count * HUMANBODY_MASS_SUB_EL_COUNT_PERCENT / 100;

      System.out.println("Elements other than oxygen, carbon, hydrogen, nitrogen, calcium and phosphorus make up " + 
      HUMANBODY_MASS_SUB_EL_PERCENT + " percent of the mass with an atom count of " + HUMANBODY_MASS_SUB_EL_COUNT);
      System.out.println();

      // For a 70kg person, what are the mass (as fractional numbers) and the number of atoms (as whole
      // numbers) of the elements with the highest two ratios?
      MASS_OF_OXYGEN_70KG = huamnBody_mass_kg * OXYGEN_MASS_PERCENT / 100;
      MASS_OF_CARBON_70KG = huamnBody_mass_kg * CARBON_MASS_PERCENT / 100;
      System.out.println("For a person of 70.0 kg the mass of the elements are:");
      System.out.println("Oxygen:" + MASS_OF_OXYGEN_70KG);
      System.out.println("Carbon:" + MASS_OF_CARBON_70KG);
      System.out.println();

      // oxygen_atom_count = (double) (humanBody_atom_count * oxygen_atom_count_percent / 100);
      // hydrogen_atom_count = (double) (humanBody_atom_count * hydrogen_atom_count_percent / 100);
      oxygen_atom_count = humanBody_atom_count * (oxygen_atom_count_percent / 100);
      hydrogen_atom_count = humanBody_atom_count * (hydrogen_atom_count_percent / 100);
      System.out.println("whereas the number of atoms of some elements in this person are:");
      System.out.println("Hydrogen: " + hydrogen_atom_count);
      System.out.println("Oxygen: " + oxygen_atom_count);
      
      



    }
    
}
