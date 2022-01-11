
package PharmacyPkg;

 class Medicine  {
    int medicineNumber;
    String medicineName; 
    Medicine medicineNext;
    
    Medicine(int medicineNumber,String medicineName ){
        this.medicineNumber=medicineNumber;
        this.medicineName=medicineName;
        this.medicineNext=null;
    }
}
public class PharmacyProject {
   
  public Medicine head;
  public Medicine tail;
 
    
    PharmacyProject( ){
         head = null;
         tail = null;
        
    }
     public void add(int item , String name){
        Medicine newMed  = new Medicine(item , name);  
        if (head ==null) {
            head =newMed;
             tail =newMed;       
    } 
       else {
            tail.medicineNext =newMed;
            
            tail = newMed;
        }
       
    }
    
     public void delete(int item)
    {
       
        Medicine temp = head, prev = null;
        if (temp != null && temp.medicineNumber == item) {
            head = temp.medicineNext; 
            return;
        }

        while (temp != null && temp.medicineNumber != item) {
            prev = temp;
            temp = temp.medicineNext;
        }
        if (temp == null)
            
            return ;

        prev.medicineNext = temp.medicineNext;
    }

     public void display(){
        Medicine n = head;
        if (head == null) {
	  System.out.println("List is empty");
	  return;}
        while(n !=null){
          System.out.print( "[ "+n.medicineNumber+" , "+n.medicineName +" ] ");
          n = n.medicineNext;
     }
        System.out.println(  );
    }
     public void displaySort(){
        Medicine n = head;
        if (head == null) {
	  System.out.println("List is empty");
	  return;}
         System.out.print("Sort the medicine according its number : ");
        while(n !=null){
          System.out.print( "[ "+n.medicineNumber+" ] ");
          n = n.medicineNext;
     }
        System.out.println(  );
    }
      public void search(int item) {  
        Medicine current = head;  
        int position = 1;  
        boolean x = false;  
       
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            while(current != null) {  
              
                if(current.medicineNumber == item) {  
                    x = true;  
                    break;
                }  
                position++;  
                current = current.medicineNext;  
            }  
        }  
             System.out.println("Search for the element : " + item);
        if(x)  
             System.out.println("Element is present in the list at the position : " + position);  
        else  
             System.out.println("Element is not present in the list");  
    }  
      	public void sortList()
	{
	 Medicine curr = head, index = null;
         int temp;
         if (head == null)
         {
            return;
	 }
            else
         {
            while (curr != null)
                {
		  index = curr.medicineNext;
                  while (index != null)
                  {
                    if (curr.medicineNumber > index.medicineNumber )
                    {
                        temp = curr.medicineNumber;
			curr.medicineNumber = index.medicineNumber;
			index.medicineNumber = temp;
                    }
                        index = index.medicineNext;
                  }
			curr = curr.medicineNext;
		}
            
         }
	}
    	}
class TestPharmacy{
    public static void main(String[] args) {
      PharmacyProject  medicine = new PharmacyProject();
      medicine.add(1,"aaa");
      medicine.add(55,"ggg");
      medicine.add(100,"yyy");
      medicine.add(6,"fff");
      medicine.add(3,"lll");
      medicine.add(4,"sss");
      
      medicine.delete(55);
      
      medicine.display();

      medicine.search(6);
      
      medicine.sortList();
      
      medicine.displaySort();
    
    }
    
}
