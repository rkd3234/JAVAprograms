// Encrypt word: ROADTOSDET [when A=F]
// Output: WTFIYTXIJY

import java.util.*;

class Encrypt
{
    public static void main(String args[ ])
    {
        String str,Newstr=" ";
        System.out.print("Enter the word to encrypt: ");
        try {


            Scanner in=new Scanner(System.in);
            str=in.nextLine();
            for (int i=0;i<str.length();i++)
            {
                char ch=Character.toUpperCase(str.charAt(i));
                switch (ch)
                {
                    case 'A':
                        Newstr=Newstr+"F";
                        break;
                    case 'B':
                        Newstr=Newstr+"}";
                        break;
                    case 'C':
                        Newstr=Newstr+"#";
                        break;
                    case 'D':
                        Newstr=Newstr+"I";
                        break;
                    case 'E':
                        Newstr=Newstr+"J";
                        break;
                    case 'F':
                        Newstr=Newstr+"-";
                        break;
                    case 'G':
                        Newstr=Newstr+"*";
                        break;
                    case 'H':
                        Newstr=Newstr+"@";
                        break;
                    case 'I':
                        Newstr=Newstr+"/";
                        break;
                    case 'J':
                        Newstr=Newstr+"\\";
                        break;
                    case 'K':
                        Newstr=Newstr+"?";
                        break;
                    case 'L':
                        Newstr=Newstr+"$";
                        break;
                    case 'M':
                        Newstr=Newstr+"!";
                        break;
                    case 'N':
                        Newstr=Newstr+"^";
                        break;
                    case 'O':
                        Newstr=Newstr+"T";
                        break;
                    case 'P':
                        Newstr=Newstr+")";
                        break;
                    case 'Q':
                        Newstr=Newstr+"<";
                        break;
                    case 'R':
                        Newstr=Newstr+"W";
                        break;
                    case 'S' :
                        Newstr=Newstr+"X";
                        break;
                    case 'T':
                        Newstr=Newstr+"Y";
                        break;
                    case 'U':
                        Newstr=Newstr+",";
                        break;
                    case 'V' :
                        Newstr=Newstr+"_";
                        break;
                    case 'W':
                        Newstr=Newstr+"[";
                        break;
                    case 'X' :
                        Newstr=Newstr+"]";
                        break;
                    case 'Y':
                        Newstr=Newstr+":";
                        break;
                    case 'Z' :
                        Newstr=Newstr+"\"";
                        break;
                    default :
                        Newstr=Newstr+"0";
                        break;
                }
            }
        }
        catch(Exception ioe)
        {
            ioe.printStackTrace();
        }
        System.out.println("The encrypted word is: " +Newstr);
    }
}
