public class Solution {
    public String replaceSpace(StringBuffer str) {
    	String temp=str.toString();
        char[] strChar=temp.toCharArray();
        StringBuffer result=new StringBuffer();
        for(int i=0;i<strChar.length;i++)
 			{
            if(strChar[i]==' ')
                {
                result.append("%20");
            }
            else
                {
                result.append(strChar[i]);
            }
        }
                    return result.toString();
    }
}