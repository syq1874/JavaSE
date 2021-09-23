package d0923.Demo2;

public class Demo {
    public static void main(String[] args) {
        String s1="abc";
        String s2=new String();
        String s3=new String("abc");

        System.out.println(s1.length());

        System.out.println(s2.isEmpty());

        System.out.println(s1.charAt(0));

        System.out.println(s1.concat("123"));

        System.out.println(s1.equals(s3));

        System.out.println(s1.equalsIgnoreCase("ABC"));

        byte[] b= s1.getBytes();
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        String emial="xxxxxx.com";
        int index=emial.indexOf('@');
        if(index==-1){
            System.out.println("邮箱不合法");
        }else{
            System.out.println("邮箱合法");
        }

        //转大写
        String s4=s1.toUpperCase();
        System.out.println(s4);

        //转小写
        String s5=s4.toLowerCase();
        System.out.println(s5);

        //去除前后空白
        String username="  syq    ";
        System.out.println(username);
        String s6 =username.trim();
        System.out.println(s6);

        //截取
        String s7 =s1.substring(1);
        System.out.println(s7);
        String s8 =s1.substring(1,2);       //起始包括，结束不包括
        System.out.println(s8);

        //替换
        String s9="I,Love,You";
        String s10 =s9.replace(","," ");
        System.out.println(s10);
    }
}
