package ExceptionHandling.Checked;

public class CustomChecked {
   static int[] arr;
 static int size;
  int initial=0;
 static int top;
  CustomChecked(int size){
      arr=new int[size];
      this.size=size;
      top=size;
  }
  public  int push(int n) throws StackOverflowException{
      if (initial==top) {
          throw new StackOverflowException();
      }
       arr[initial]=n;
          initial++;
       return arr[initial-1];
      }

   public  int pop()throws StackUnderflowException{
      initial--;
      if(initial==-1){
          throw new StackUnderflowException();
      }
      return arr[initial];
   }

    public static void main(String[] args) {
        CustomChecked c1=new CustomChecked(3);
        try {
            c1.push(1);
            c1.push(2);
            c1.push(3);

            c1.pop();
            c1.pop();
            c1.pop();
            c1.pop();
        } catch (StackOverflowException e) {
            System.out.println(e);
        } catch (StackUnderflowException e) {
            System.out.println(e);
        }

    }
  }


