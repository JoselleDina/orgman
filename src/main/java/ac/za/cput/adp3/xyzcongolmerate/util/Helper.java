package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        System.out.println(aClass.getSimpleName());
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String result="";
        String className = getClassName(aClass);

        for(int i=0;i<className.length();i++){
       // System.out.println(className.charAt(i));
        if(Character.isUpperCase(className.charAt(i)))
        {
            result+=className.charAt(i);
        }
        }
        return result;
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line 17 [throw new UnsupportedOperationException("Not yet supported!");]
         * 2. Get the capitalized letter(s) from the className and return it.
         */
    }
}
