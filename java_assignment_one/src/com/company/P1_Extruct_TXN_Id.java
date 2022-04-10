/*1. Extract the transaction ID from the HTML body
<html>
<title>Test</title>
<body>
Your trnx is successful. Trnx Id is: TXN123456
</body>
</html>*/


package com.company;

public class P1_Extruct_TXN_Id {
    public static void main(String[] args) {
        String str = "<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";
        str = str.replaceAll("[^\\d]", " ");
//            System.out.println(str);
        str = str.trim();
//            System.out.println(str);
        System.out.println("The Trnx ID is TXN"+str);

    }
}
