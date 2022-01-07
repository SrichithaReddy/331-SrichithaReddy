public class A1Hotel {
 public  static void main(String[] args) {
     Customer customer1=new Customer("srichitha","sri");
     
     System.out.println(customer1.name);
    try{
        customer1.name("srichithaReddy");

    }   catch(UnAcceptableePasswordException e){
        System.out.println("caughht eex"+e);
    } 
    }

        
    }


