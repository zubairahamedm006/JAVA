package Day14;
abstract class  employe{
    protected int id;
    protected String name;
    protected int salary;
    employe(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    abstract void bonus();
}
class manager extends employe {
     manager(int id, String name, int salary) {
         super(id, name, salary);
     }

          void bonus()
         {
             System.out.println(id+" "+name+" "+ (salary+(salary*0.10)));

         }
     }
     class developer extends employe {
         developer(int id, String name, int salary) {
             super(id, name, salary);

         }

         void bonus() {
             System.out.println( id+" "+name+" "+(salary+(salary*0.5)));
         }
     }


         class intern extends employe {
             intern(int id, String name, int salary) {
                 super(id, name, salary);
             }

             void bonus() {

                 System.out.println(id+" "+name+" "+ salary);
             }
         }

             public class employee {

                 public static void main(String[] args) {
                     employe m = new manager(116, "vidhya", 30000);
                     employe d = new developer(115, "pooja", 25000);
                     employe n = new intern(114, "varsha", 2000);
                     m.bonus();
                     d.bonus();
                     n.bonus();
                 }


             }


