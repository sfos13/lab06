import java.util.Iterator;
import java.util.List;

public class StringRecipe {
    List<StringTransformer> transformers;


    public StringRecipe(List<StringTransformer> transformers) {
        this.transformers=transformers;
    }

    public void mix(StringDrink drink) {
        Iterator var = this.transformers.iterator();
        while(var.hasNext()) {
            StringTransformer transformer = (StringTransformer)var.next();
            transformer.execute(drink);
        }


    }
}
