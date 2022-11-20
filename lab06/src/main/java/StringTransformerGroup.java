import java.util.Iterator;
import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    List<StringTransformer> transformers;

    public StringTransformerGroup(List<StringTransformer> transformers) {
        this.transformers=transformers;
    }


    public void execute(StringDrink drink) {
        Iterator var = this.transformers.iterator();
        while(var.hasNext()) {
            StringTransformer transformer = (StringTransformer)var.next();
            transformer.execute(drink);
        }

    }

    public void undo(StringDrink drink) {
        Iterator var = this.transformers.iterator();

        while(var.hasNext()) {
            StringTransformer transformer = (StringTransformer)var.next();
            transformer.undo(drink);
        }


    }
}
