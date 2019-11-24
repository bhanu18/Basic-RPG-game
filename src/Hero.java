
public class Hero {
   String name;
   weapon wp;
   public Hero(String name, weapon wp){
	   this.name = name;
	   this.wp=wp;
   }
   public void changeweapon(weapon wp){
	   this.wp=wp;
   }
   public String toString(){
	   return "Name: "+name+"\nWeapon:"+weapon.name;
   }
}
