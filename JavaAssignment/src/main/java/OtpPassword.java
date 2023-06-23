// Extract the OTP from the SMS. "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S"


import java.util.*;

class OtpPassword {
    public static void main(String[] args)

    {
        int length = 6;
        System.out.println(onetime_Password(length));
        System.out.print("Don't share this code with anyone ");
        int Length = 15;
        System.out.println(OTP(Length));
    }

    static char[] onetime_Password(int len)

    {
        System.out.print("Your one time password is : ");
        String numbers = "0123456789";
        Random rndm_method = new Random();

        char[] password = new char[len];

        for (int i = 0; i < len; i++)
        {
            password[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        return password;
    }
    static char[] OTP(int len) {

        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";
        String values = symbols+Small_chars+Capital_chars+numbers;

        Random rndm_method = new Random();

        char[] otp = new char[len];

        for (int i = 0; i < len; i++)
        {
            otp[i] = values.charAt(rndm_method.nextInt(values.length()));
        }
        return otp;
    }
}

