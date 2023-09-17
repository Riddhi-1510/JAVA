public class Str11 {
    public static void main(String[] args) {
        String url = "https://www.google.com/search?q=youtube";
        if(url.substring(0, 5).equals("https")){
            System.out.println("Scheme : " + url.substring(0, 4));
        }
        int index = 0;
        if(url.substring(8, 12).equals("www.")){
            for(int i=13;i<url.length();i++){
                if(url.charAt(i)=='.'){
                    index = i;
                    break;
                }
            }
            if(url.substring(index, index+4).equals(".com")){
                System.out.println("Host : " + url.substring(8,index+4));
            }
        }
        String path = "";
        int i;
        for(i=index+4;i<url.length();i++){
            if(url.charAt(i)== '?'){
                break;
            }
            path = path + url.charAt(i);
        }
        System.out.println("Path : " + path);
        int j= i,flag = 0;
        String q = "";
        for(i=j;i<url.length();i++){
            if(url.charAt(i)=='?'){
                flag = 1;
                continue;
            }
            if(flag == 1){
                q = q + url.charAt(i);
            }
        }
        System.out.println("Query:" + q);
    }
    
}

/*
11. URL Parser: Design a program that parses a URL into its components (scheme, host, path, query, etc.) without using any string methods.
Example:
    Input: https://www.google.com/search?q=youtube

    Output:
    Scheme: https
    Host: www.google.com
    Path: /search
    Query: q=youtube
 */