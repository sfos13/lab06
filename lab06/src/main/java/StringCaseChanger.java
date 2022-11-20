import static java.lang.Character.isLowerCase;
import static java.lang.Character.toUpperCase;
import static java.lang.Character.toLowerCase;



public class StringCaseChanger implements StringTransformer{

    private String str;
    private int len;
    public void execute(StringDrink drink) {
        str=drink.getText();
        len=str.length();
        String s = "";

        for (int i=0;i<len;i++){
            char c = str.charAt(i);

            if (isLowerCase(c)){
                s+=toUpperCase(c);
             }
            else{
                s+=toLowerCase(c);

            }
            drink.setText(s);

        }

    }
    public void undo(StringDrink drink) {
        drink.setText(str);
    }


}
