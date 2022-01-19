import java.util.List;
import java.util.ArrayList;

public class Milkshake
{
    ArrayList<String> ingredients;
    int base_price;
    int additional_price;
    boolean lactosFree;

    protected Milkshake()
    {
        ingredients = new ArrayList<>();
        ingredients.add("milk");
        ingredients.add("sugar");
        lactosFree = false;
        additional_price = 0;
    }

    public void updateAdditionalPrice(int extra)
    {
        additional_price += extra;
    }

   public int getTotalShakePrice()
   {
       return base_price + additional_price;
   }

    public void makeLactoseFree()
    {
        lactosFree = true;
        ingredients.set(0, "almond milk");

        updateAdditionalPrice(60);
    }

    @Override
    public String toString()
    {
        String result = "\ningredients=" + ingredients +
                "\nbase price=" + base_price;

        if(lactosFree)
            result  = result + "\nadditional price for taking lactose free shake " + additional_price ;

        return result;
    }
}
