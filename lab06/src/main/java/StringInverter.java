import java.lang.*;

public class StringInverter implements StringTransformer{
    private String str;
    public void execute(StringDrink drink) {
        str=drink.getText();
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        drink.setText(String.valueOf(sbr));

    }


    public void undo(StringDrink drink) {
        drink.setText(str);

    }

}

