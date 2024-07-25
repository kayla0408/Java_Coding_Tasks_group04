package Kadriye.week06;

public class String_PasswordValidation {
    public static void main(String[] args) {
        System.out.println(isValidPass("Abc123!")); // true
        System.out.println(isValidPass("abc123")); // false (no uppercase)
        System.out.println(isValidPass("ABC123!")); // false (no lowercase)
        System.out.println(isValidPass("Abcdef!")); // false (no digit)
        System.out.println(isValidPass("Ab1!")); // false (too short)
        System.out.println(isValidPass("Abc 123!")); // false (contains space)
    }

    public static boolean isValidPass(String password){
        if (password.length() < 6 || password.contains(" ")){
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (char eachChar : password.toCharArray()) {
            if (Character.isUpperCase(eachChar)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(eachChar)) {
                hasLowerCase = true;
            } else if (Character.isDigit(eachChar)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(eachChar)) {
                hasSpecialChar = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }
}
/*1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false

 */