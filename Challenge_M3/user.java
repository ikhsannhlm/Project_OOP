import java.util.ArrayList;
class user {
    String name;

    void ngeping(){
        System.out.println(this.name +" : "+"p");
    }

    void ngechat(String chat){
        System.out.println(this.name+" : "+ chat);
    }

    void ngespam(String[] chat){
        String gabunganchat=String.join(", ",chat);

        System.out.println("Ini spam, "+ gabunganchat);
    }

    void spamarray(ArrayList<String> chat, String tempat){
        String gabunganchat= String.join(", ", chat);
        System.out.println("dari "+tempat+", mau spam "+gabunganchat);
    }
}
