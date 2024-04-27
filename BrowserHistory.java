class BrowserHistory {
   
    
    Dll head;
    Dll tail;
    public BrowserHistory(String homepage) {
       Dll dll=new Dll(homepage);
       
        head=tail=dll;
    }
    
    public void visit(String url) {
      Dll dll=new Dll(url);
      tail.next=dll;
      dll.prev=tail;
      tail=tail.next;
     
      
    }
    
    public String back(int steps) {
        while(steps-- > 0 && tail.prev != null){
            tail =tail.prev;
        }
        return tail.data;
       
    }
    
    public String forward(int steps) {
        while(steps-- > 0 && tail.next != null){
           
           tail=tail.next;
        }
        return tail.data;
    }
}
class Dll{
    String  data="";
    Dll prev;
    Dll next;
    
   
    Dll(String data){
     this.data=data;
     this.prev=null;
     this.next=null;
    }
  
}



/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */