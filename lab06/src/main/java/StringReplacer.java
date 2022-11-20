import static java.lang.Character.*;

public class StringReplacer implements StringTransformer {
    private char a;
    private char x;

    private String str;
    private int len;

    public StringReplacer(char a, char x) {
        this.a=a;
        this.x=x;
    }

    public void execute(StringDrink drink) {
        str=drink.getText();
        len=str.length();
        String s = "";

        for (int i=0;i<len;i++) {
            char c = str.charAt(i);

            if (c == a) {
                s += x;
            } else {
                s += c;

            }
            drink.setText(s);
        }


    }

    public void undo(StringDrink drink) {
        drink.setText(str);

    }
}
