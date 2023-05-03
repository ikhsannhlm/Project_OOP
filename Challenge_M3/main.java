import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        user u1 = new user();
        u1.name="ikhsan";

        u1.ngeping();
        u1.ngechat("Haii semuanya");

        String[] pesan={"Haii", "Sebenernya", "Akutuh", "Mermaid-Man"};
        u1.ngespam(pesan);

        ArrayList<String> pesanarray=new ArrayList<>();
        pesanarray.add("Ada bintang jatuh");
        pesanarray.add("cepat masukk kerumah!");
        u1.spamarray(pesanarray, "luar rumah");
    }
}