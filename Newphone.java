interface iphone{
    static final int Iphone_ID =1234567890;
    void good_camera();
    void privacy();
    void security();
    void best_chip();
}
interface android{
    static final int Android_ID =987654321;
    void gaming();
    void budget_friendly();
    void easy_share();
    void good_battery();
}
class Pheonix implements iphone, android{
   @Override
   public void good_camera() {
       System.out.println("Pheonix has Best camera"+" with PhoeNIX id "+Iphone_ID);
   }
   @Override
   public void privacy() {
       System.out.println("Pheonix has Good Privacy"+" with Pheonix id "+Iphone_ID);
   }
   @Override
   public void security() {
       System.out.println("Pheonix has Good Security"+" with Pheonix id "+Iphone_ID);
   }
   @Override
   public void best_chip() {
       System.out.println("Pheonix has Best chip"+" with Pheonix id "+Iphone_ID);
   }
   @Override
   public void gaming() {
       System.out.println("Pheonix is best for Gaming"+" with Phoenix id "+Android_ID);
   }
   @Override
   public void budget_friendly() {
       System.out.println("Pheonix is Budget-friendly"+" with Phoenix id "+Android_ID);
   }
   @Override
   public void easy_share() {
       System.out.println("Pheonix has Easy share"+" with Phoenix id "+Android_ID);
   }
   @Override
   public void good_battery() {
       System.out.println("Pheonix has Good battery"+" with Phoenix id "+Android_ID);
   }
}
public class Newphone{
    public static void main(String[] args) {
        Pheonix obj=new Pheonix();
        obj.good_camera();
        obj.privacy();
        obj.security();
        obj.best_chip();
        obj.gaming();
        obj.budget_friendly();
        obj.easy_share();
        obj.good_battery();
}
}