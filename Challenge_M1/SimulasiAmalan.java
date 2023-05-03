class SimulasiAmalan{
    public static void main(String[] args) {
        Manusia m1 = new Manusia();
        m1.nama="ikhsan";

        Manusia m2=new Manusia();
        m2.nama="si a";

        m1.StatusAmal();
        m1.Amalan("baik");
        m1.StatusAmal();
        m1.Amalan("baik");
        m1.StatusAmal();
        m1.Amalan("baik");
        m1.StatusAmal();

        m2.StatusAmal();
        m2.Amalan("baik");
        m2.StatusAmal();
        m2.Amalan("baik");
        m2.StatusAmal();
        m2.Amalan("baik");
        m2.StatusAmal();
        m2.Amalan("buruk");
        m2.StatusAmal();
    }
}