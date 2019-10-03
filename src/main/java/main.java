import cssselectortoxpath.utilities.CssElementCombinatorPairsToXpath;
import cssselectortoxpath.utilities.CssSelectorToXPathConverterException;

public class main extends CssElementCombinatorPairsToXpath {

    public static void main(String[] args) throws CssSelectorToXPathConverterException{
        main obj = new main();
        String csscode=".m-tab__pane--active>.m-btn-group.m-t-50>a[title='Tümünü Gör']"; //There is where you put css
        System.out.println(obj.testCss(csscode));//There is where you take xpath
    }

    public String  testCss(String css) throws CssSelectorToXPathConverterException {

        String xpath=birlestir(convertCssSelectorToXpath(css),trimedPart(css)); //This is xpath
        System.out.println(xpath+" xpath olarak yazıldı");
        return xpath;

    }

    public String convertCssSelectorToXpath(String cssSelector) throws CssSelectorToXPathConverterException
    {
        return new CssElementCombinatorPairsToXpath().convertCssSelectorStringToXpathString(trimedcss(cssSelector));
    }

    public String trimedPart(String cssSelector){
        String trim0,trim1;
        String trimedPart="d";
        for (int i=0; i<=cssSelector.length()-1; i++)
        {
            if (cssSelector.substring(i,i+1).contains("'") || cssSelector.substring(i,i+1).contains("\"")){
                for (int k=i+1 ; k<=cssSelector.length()-1; k++){
                    if (cssSelector.substring(k,k+1).contains("'")||cssSelector.substring(k,k+1).contains("\"")){
                        trimedPart=cssSelector.substring(i+1,k);
                        trim0=cssSelector.substring(0,i+1);
                        trim1=cssSelector.substring(k,cssSelector.length());
                        cssSelector=trim0.concat("a");
                        cssSelector=cssSelector.concat(trim1);
                        break;
                    }
                }
            }
        }
        System.out.println(trimedPart+" trimedpart");
        return trimedPart;
    }
    public String trimedcss(String cssSelector){
        String trim0,trim1;
        for (int i=0; i<=cssSelector.length()-1; i++)
        {
            if (cssSelector.substring(i,i+1).contains("'") || cssSelector.substring(i,i+1).contains("\"")){
                for (int k=i+1 ; k<=cssSelector.length()-1; k++){
                    if (cssSelector.substring(k,k+1).contains("'")||cssSelector.substring(k,k+1).contains("\"")){
                        System.out.println(i+"k="+k);
                        System.out.println(cssSelector.substring(i+1,k));
                        trim0=cssSelector.substring(0,i+1);
                        trim1=cssSelector.substring(k,cssSelector.length());
                        cssSelector=trim0.concat("znkldk1");
                        cssSelector=cssSelector.concat(trim1);
                        break;
                    }
                }
            }
        }
        return cssSelector;
    }
    public String birlestir(String cssSelector,String trimedPart){
        String trim0,trim1;
        for (int i=0; i<=cssSelector.length()-1; i++)
        {
            if (cssSelector.substring(i,i+7).contains("znkldk1")){
                        trim0=cssSelector.substring(0,i);
                        trim1=cssSelector.substring(i+7,cssSelector.length());
                        cssSelector=trim0.concat(trimedPart);
                        cssSelector=cssSelector.concat(trim1);
                        System.out.println(cssSelector);
                        break;
                    }
        }
        return cssSelector;
    }
}