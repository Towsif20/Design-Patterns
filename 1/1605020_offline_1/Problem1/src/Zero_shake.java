public class Zero_shake extends Milkshake
{
    public Zero_shake()
    {
        super();

        ingredients.set(1, "sweetener");
        ingredients.add("vanilla_flavoring");
        ingredients.add("sugar free jello");

        base_price = 240;
    }

    @Override
    public String toString()
    {
        return "\nZero_shake \n" + super.toString();
    }
}
