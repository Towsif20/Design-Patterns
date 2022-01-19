public class Vanilla_shake extends Milkshake
{
    public Vanilla_shake()
    {
        super();

        ingredients.add("vanilla_flavoring");
        ingredients.add("jello");

        base_price = 190;
    }

    public String toString()
    {
        return "\nVanilla shake \n" + super.toString();
    }
}
