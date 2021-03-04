/**
 * 
 *
 */
package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/**
 * Algorithm for user login security, uses hash function.
 * @author Aung Nay
 * Code reference from 
 * https://happycoding.io/tutorials/java-server/secure-password-storage
 */
public class UserData {
    
    private static UserData instance = new UserData();
    /** 
     * Map of the usernames to the password hashes.
     */
    private Map<String, Integer> userPasswordMap = new HashMap<>();
    /** 
     * Map of the usernames to their salts.
     */
    private Map<String, Integer> userSaltMap = new HashMap<>();
    
    public static UserData getInstance(){ return instance;}

    /**
     * Returns a simple hash code of the input.
     * @param input Input to be converted into hash.
     * @return A integer of input hash code.
     */
    private int getSimpleHash(String input){
        final int prime = 31;
        int result = prime * hashCode() + (int)input.hashCode();
        //System.out.println(result);
        return result;
    }

    /**
     * Returns a hashCode. IDE generated.
     * @return A integer of a hash code.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserData other = (UserData) obj;
        if (!Objects.equals(this.userPasswordMap, other.userPasswordMap)) {
            return false;
        }
        return true;
    }
    
    /**
     * A singleton class. Call getInstance() when constructing.
     * i.e., UserData account1 = UserData.getInstance();
     */
    private UserData(){};
    
    /**
     * Returns a random integer between 1-100.
     * @return A integer of a random generated integer.
     */
    private int getRandomSalt(){return (int)(Math.random()*100);}
    
    /**
     * Returns a boolean whether the username exist inside the userPasswordMap.
     * @param user Username of the user
     * @return A boolean of if the username exist in the map.
     */
    public boolean isUserNameTaken(String user){
        return userPasswordMap.containsKey(user);
    }
    
    /**
     * Registers the user by adding the username and password into the map.
     * @param user Username of the user
     * @param pass Password of the user
     */
    public void registerUser(String user, String pass){
        int salt = getRandomSalt();
        String saltPassword = pass + salt;
        int passwordHash = getSimpleHash(saltPassword);
        userPasswordMap.put(user, passwordHash);
        userSaltMap.put(user, salt);
    }
    
    /**
     * Returns a boolean whether the username and password matches the key and value from the userPasswordMap.
     * @param user Username of the user
     * @param pass Password of the user
     * @return A boolean of if the username and password matches.
     */
    public boolean isLoginCorrect(String user, String pass) {
		
        // username isn't registered
        if(!userPasswordMap.containsKey(user) || !userSaltMap.containsKey(user)){
                return false;
        }

        int salt = userSaltMap.get(user);
        String saltedPassword = pass + salt;
        int passwordHash = getSimpleHash(saltedPassword);
        int storedPasswordHash = userPasswordMap.get(user);
        //System.out.println(passwordHash == storedPasswordHash);
        return passwordHash == storedPasswordHash;
    }
    
    
    // checking the Map
    private void printMap(){
        userPasswordMap.forEach((key, value) -> System.out.println(key + " | " + value));
    } 
    
}
