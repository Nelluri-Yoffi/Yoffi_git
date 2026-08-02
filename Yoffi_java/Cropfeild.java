class Crop
{
    int acres;
    int bagsPerAcre;

     void setAcres(int a)
    {
        acres = a;
    }
    void setBags(int b)
    {
        bagsPerAcre = b;
    }
    int getAcres()
    {
        return acres;
    }

    int getBags()
    {
        return bagsPerAcre;
    }

    int getIncome()
    {
        return acres*bagsPerAcre*5000;
    }
}
class Cropfeild
{
    public static void main(String[] args)
    {
        Cropfeild field = new Cropfeild();
        
        field.createField(3, 8);
        field.createField(5, 6);
        field.createField(7, 9);
    }

    void createField(int acres,int bags)
    {
        Crop myCrop = new Crop();

        myCrop.setAcres(acres);
        myCrop.setBags(bags);

        System.out.println("Acres: " + myCrop.getAcres());
        System.out.println("Bags per Acre: " + myCrop.getBags());
        System.out.println("Income: Rs. " + myCrop.getIncome());
        System.out.println();
    }
}