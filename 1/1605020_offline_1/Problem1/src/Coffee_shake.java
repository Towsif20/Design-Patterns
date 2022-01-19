public class Coffee_shake extends Milkshake
{
    public Coffee_shake()
    {
        super();

        ingredients.add("coffee");
        ingredients.add("jello");

        base_price = 230;
    }

    public String toString()
    {
        return "\nCoffe shake \n" + super.toString();
    }
}
