class Main
{
  public static void main(String[] args)
  {
    PetParent blankPet = new PetParent("Bob", true, "yellow-purple", 2, 0.9);

    Dog piper = new Dog("Piper", true, "black and white", 10, 0.5, false, 8, "Australian Shephard");

    Axolotl matthew = new Axolotl("Matthew", false, "pink", 7, 0.7, true);

    blankPet.setName("Fluffy");
    System.out.println("Bob is now called " + blankPet.getName());
    System.out.println(piper.dailyRoutine());
    System.out.println(matthew.dailyRoutine());
    /*
    System.out.println(blankPet.toString());
    System.out.println("\n--------------------------\n");
    System.out.println(piper.toString());
    System.out.println("\n--------------------------\n");
    System.out.println(matthew.toString());
    */
  } // end main method
} // end Main class aka the Driver