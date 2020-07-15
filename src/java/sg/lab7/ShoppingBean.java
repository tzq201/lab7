package sg.lab7;

import javax.ejb.Stateless;

/**
 *
 * @author tzq20
 */
@Stateless
public class ShoppingBean {
    
    public double computeBMI(double height, double weight) {
        return (10000 / (height * height)) * weight;
    }

    public int getNameLength(String name) {
        return name.length();
    }

    public int countVowels(String name) {
        int noOfVowels = 0;
        name = name.toLowerCase();
        
        for(int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                ++noOfVowels;
        }
        
        return noOfVowels;
    }   
    
}
