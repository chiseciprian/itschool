package ro.itschool.temacurs4;

public class IntegerRecived {
    public void arayReturn(int n,int k){
        int[] fullArray=new int[n];
        int index=0;

        for (int i=0;i<n;i++){
            fullArray[i]=i;
            if(i%k==0) {
            index++;
            }
        }

        int[]retunArray=new int[index];
        int contor=0;
        for (int i=0;i<n;i++){
            if (fullArray[i]%k==0){
                retunArray[contor]=fullArray[i];
                contor++;
            }
        }

        for (int i=0;i<index;i++){
            System.out.println(retunArray[i]);
        }
    }
}
