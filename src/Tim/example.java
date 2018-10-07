package Tim;

public class example
{
    //First time editing
    public static void main(String[] args)
    {
        byte myByteValue = (byte) 350;
        short myshortValue = 400;
        int myIntNumber = 1509;
        long myLongTotalValue = 50000L + 10L   * ( myByteValue + myshortValue + myIntNumber);
        short myShortTotal = (short) (50000L + 10L   * ( myByteValue + myshortValue + myIntNumber));

        System.out.println("The total is :" + myLongTotalValue);
        System.out.println(" Short total : " + myShortTotal);
    }

}

