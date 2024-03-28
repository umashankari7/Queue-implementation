import java.util.Scanner;

class QQ{
  int size, arr[], top=-1;
  QQ(int size){
    this.size=size;
    this.arr=new int[size];

  }
boolean isFull(){
  return top==size-1;
}
boolean isEmpty(){
  return top==-1;
}
void enqueue(int n){
  if(isFull()){
    System.out.println("queue overflow");
    return;
  }
  arr[++top]=n;
}
 void dequeue(){
  if(isEmpty()){
    System.out.println("queue underflow");
    return;
  }
  for(int i=0;i<top;i++){
    arr[i]=arr[i+1];
  }
  top--;
}
int getSize(){
  return top+1;
}
int search(int n){
  int x=top;
  while(x>=0){
    if(arr[x]==n){
      return top-x+1;
    }
    x--;
  }
  return -1;
}
void display(){
  for(int i=0;i<=top;i++){
    System.out.print(arr[i]+" ");
  }

  System.out.println("");
}
}
public class Queueimp{
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  QQ q=new QQ(10);
  for(; ;){
    System.out.println("\nEnter\n1.Insert\n2.Delete\n3.Display\n4.Exit\n");
    System.out.println("enter your choice");
    int choice=sc.nextInt();
    switch(choice){
      case 1:
      System.out.println("enter the elements");
      int elements=sc.nextInt();
      q.enqueue(elements);
      break;
      case 2:
      q.dequeue();
      break;
      case 3:
      q.display();
      break;
      case 4:
      System.out.println("exit");
      default:
      System.out.println("invalid ");
    }
  }
  }
}
