package Year;

/**
 * Created by Gilmar-Filho on 04/10/2017.
 */
public class Verifier {
    public boolean isLeapYear(int year){
        if(year % 400 == 0){
            return true;
        }else{
            if(year % 4 == 0){
                if(year % 100 == 0){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}
