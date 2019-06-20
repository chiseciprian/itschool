package ro.itschool.temacurs4;

public class AgeVerification {
    public String ageVerifed(int ageInsert){
        if(ageInsert<16){
            return "You can't drive";
        } else if (16<= ageInsert && ageInsert<=17){
            return "You can drive but not vote";
        } else if (18<=ageInsert && ageInsert<=24){
            return "You can vote but not rent a car";
        } else{
            return "You can do pretty much anything.";
        }

    }
}
