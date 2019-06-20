package ro.itschool.temacurs4;

public class NumberSum {
    public int calculateNumberSum(int recivedNumber){
        int copynumber=recivedNumber;
        int sum=0;
        int verifedNumber=0;
        do {
            verifedNumber=copynumber%10;
            if (verifedNumber%2==0)
                sum+=copynumber%10;

            copynumber/=10;
        }while(copynumber>0);

        return sum;
    }
}
