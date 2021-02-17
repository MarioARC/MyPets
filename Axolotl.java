public class Axolotl extends PetParent
{
  // instance variable
  private boolean hasRegenerated;
  // constructors
  public Axolotl(String name, boolean hasHair, String color, int cuteness, double friendliness, boolean hasRegenerated)
  {
    super(name, hasHair, color, cuteness, friendliness);
    this.hasRegenerated = hasRegenerated;
  }

  // overridden method
  public String dailyRoutine()
  {
    return super.getName() + " sleeps whenever, eats whenever, then floats.";
  }

  public String speak()
  {
    if(hasRegenerated)
    {
      return "gurgles";
    }
    else
    {
      return "bloop";
    }
  }

  // toString
  public String toString()
  {
    String output = super.toString();
    output += "\nhas it regenerated = " + hasRegenerated;
    return output;
  } // end toString
} // end class